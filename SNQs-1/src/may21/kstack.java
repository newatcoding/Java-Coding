package may21;

public class kstack {

	private int[] data;
	private int[] pa;
	private int[] sa;
	private int fh;

	public kstack(int cap, int k) {
		this.data = new int[cap];
		this.pa = new int[cap];
		this.sa = new int[k];
		this.fh = 0;

		// for initial value and pointer of freehead where each position points
		// to the recent next
		for (int i = 0; i < cap; i++) {
			data[i] = 0;
			pa[i] = i + 1;
		}
		pa[cap - 1] = -1;

		for (int i = 0; i < k; i++) {
			sa[i] = -1;
		}

	}

	// for is full if fh is -1 i.e. no space
	public boolean isFull() {
		return this.fh == -1;
	}

	// is empty
	public boolean isEmpty(int s) {
		return sa[s] == -1;
	}

	// push
	public void push(int val, int s) {
		if (isFull() == true) {
			System.out.println("Stack Overflow");
			return;
		}

		else {
			int temp = fh;
			fh = pa[fh]; // remove first

			pa[temp] = sa[s]; // add first in stack s
			sa[s] = temp; // add first in stack s
			data[temp] = val;

		}

	}

	public int pop(int s) {
		if (isEmpty(s) == true) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			int temp = sa[s];
			sa[s] = pa[temp];
			pa[temp] = fh;

			int num = data[temp];
			data[temp] = 0;
			return num;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kstack ks = new kstack(10, 3);
		ks.push(10, 0);
		ks.push(20, 0);
		ks.push(30, 1);
		ks.push(40, 1);
		ks.push(50, 2);
		ks.push(60, 2);
		ks.push(70, 1);
		ks.push(80, 1);
		ks.push(90, 0);
		ks.push(100, 0);
		ks.push(110, 0);

		for (int i = 0; i <= 2; i++) {
			System.out.print(i + "=");
			while (ks.isEmpty(i) == false) {
				int val = ks.pop(i);
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

}
