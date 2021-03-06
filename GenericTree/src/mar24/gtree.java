package mar24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;

import javax.swing.text.html.MinimalHTMLWriter;

import org.w3c.dom.Node;

public class gtree {
	private static class Node {
		public int data;
		public ArrayList<Node> childern;

		Node(int data) {
			this.data = data;
			this.childern = new ArrayList<>();
		}
	}

	public static Node construct(ArrayList<Integer> dlist) {
		Node root = null;
		ArrayList<Node> nlist = new ArrayList<>();
		for (int i = 0; i < dlist.size(); i++) {

			if (dlist.get(i) == -1) {
				nlist.remove(nlist.size() - 1);
			}

			else {
				Node nn = new Node(dlist.get(i));
				if (nlist.size() == 0) {
					root = nn;
				} else {
					Node lastnode = nlist.get(nlist.size() - 1);
					lastnode.childern.add(nn);

				}
				nlist.add(nn);

			}

		}
		return root;
	}

	public static void display(Node root) {
		String s = root.data + "->";
		for (int i = 0; i < root.childern.size(); i++) {
			s += root.childern.get(i).data + ",";

		}
		System.out.println(s + ".");
		for (int i = 0; i < root.childern.size(); i++) {
			display(root.childern.get(i));

		}

	}

	public static int count = 0;

	public static int size(Node root) { // sizde of tree
		count++;
		for (int i = 0; i < root.childern.size(); i++) {
			size(root.childern.get(i));

		}
		return count;

	}

	public static int max(Node root) {
		int maxnum = Integer.MIN_VALUE;
		for (int i = 0; i < root.childern.size(); i++) {
			int cmax = max(root.childern.get(i));
			maxnum = Math.max(maxnum, cmax);
		}
		maxnum = Math.max(maxnum, root.data);

		return maxnum;
	}

	public static int height(Node root) {
		int ht = 0;
		for (int i = 0; i < root.childern.size(); i++) {
			int cht = height(root.childern.get(i));
			ht = Math.max(ht, cht);
		}
		ht += 1;
		return ht;
	}

	public static boolean find(Node root, int dtf) {

		if (root.data == dtf) {
			return true;
		}

		for (int i = 0; i < root.childern.size(); i++) {
			if (find(root.childern.get(i), dtf) == true)
				return true;

		}

		return false;

	}

	// node to child path
	public static ArrayList<Integer> n2rPath(Node root, int dtf) {

		if (root.data == dtf) {
			ArrayList<Integer> rlist = new ArrayList<>();
			rlist.add(root.data);
			return rlist;
		}

		for (int i = 0; i < root.childern.size(); i++) {
			ArrayList<Integer> n2rpath = n2rPath(root.childern.get(i), dtf);
			if (n2rpath != null) {
				n2rpath.add(root.data);

				return n2rpath;
			}
		}

		return null;

	}

	// lowest common element
	public static int lca(Node root, int d1, int d2) {
		ArrayList<Integer> a1 = n2rPath(root, d1);
		ArrayList<Integer> a2 = n2rPath(root, d2);
		int ans = 0;
		int k = Math.min(a1.size(), a2.size());
		for (int i = a1.size() - 1, j = a2.size() - 1; i >= a1.size() - k; i--, j--) {

			if (a1.get(i) == a2.get(j)) {
				ans = a1.get(i);
				continue;
			} else {
				return ans;
			}
		}
		return ans;
	}

	public static int distance(Node root, int d1, int d2) {
		ArrayList<Integer> a1 = n2rPath(root, d1);
		ArrayList<Integer> a2 = n2rPath(root, d2);
		int repeat = 0;
		int k = Math.min(a1.size(), a2.size());
		for (int i = a1.size() - 1, j = a2.size() - 1; i >= a1.size() - k; i--, j--) {

			if (a1.get(i) == a2.get(j)) {
				repeat++;
			}
			// System.out.println(repeat);
		}
		return (a1.size() + a2.size() - (2 * repeat) + 1);
	}

	public static void mirror(Node root) {
		for (int i = 0; i < root.childern.size(); i++) {
			mirror(root.childern.get(i));
		}
		int left = 0;
		int right = root.childern.size() - 1;
		while (left < right) {
			Node ln = root.childern.get(left);
			Node rn = root.childern.get(right);
			root.childern.set(left, rn);
			root.childern.set(right, ln);
			left++;
			right--;
		}
	}

	public static void removeLeaves(Node root) {

		for (int i = 0; i < root.childern.size(); i++) {
			Node nn = root.childern.get(i);
			if (nn.childern.size() == 0) {
				root.childern.remove(nn);
				i--;
				// removeLeaves(root);
			}
		}
		for (int i = 0; i < root.childern.size(); i++) {

			removeLeaves(root.childern.get(i));

		}

	}

	public static void linearize(Node root){
		if(root.childern.size()==0){
			for
			root.childern.add(arg0)
		}
		for(int i=0;i<root.childern.size();i++){
			linearize(root.childern.get(i));
		}
		
	}

	private static class HeapMover {
		int mx = Integer.MIN_VALUE;
		int mn = Integer.MAX_VALUE;
		int sz = 0;
		int ht = 0;
		int seal = Integer.MAX_VALUE;
		int floor = Integer.MIN_VALUE;
		int state = 0;
	}

	public static void multisolver(Node root, int depth, HeapMover hm) {
		hm.sz++;
		hm.ht = depth > hm.ht ? depth : hm.ht;
		hm.mx = root.data > hm.mx ? root.data : hm.mx;
		hm.mn = root.data < hm.mn ? root.data : hm.mn;
		for (int i = 0; i < root.childern.size(); i++) {
			multisolver(root.childern.get(i), depth + 1, hm);
		}
	}

	public static void SealAndFloor(Node root, int num, HeapMover hm) {
		// Necessary for these if condition to be outside the loop
		if (root.data < num && root.data > hm.floor) {
			hm.floor = root.data;
		}

		if (root.data > num && root.data < hm.seal) {
			hm.seal = root.data;

		}
		for (int i = 0; i < root.childern.size(); i++) {

			SealAndFloor(root.childern.get(i), num, hm);
		}
	}

	public static void PredecessorAndSuccessor(Node root, int pred, int succ, HeapMover hm, int num) {
		if (hm.state == 0) {
			if (root.data != num) {

				pred = root.data;
			} else {
				System.out.println(pred + " ");
				hm.state = 1;
			}
		} else if (hm.state == 1) {
			succ = root.data;
			System.out.println(succ);
			hm.state++; // in this line if we write return it will not work,
						// after return state is
						// 1 ,so if(state==1) will work again and update the
						// succ
		}
		for (int i = 0; i < root.childern.size(); i++) {
			PredecessorAndSuccessor(root.childern.get(i), pred, succ, hm, num);

		}
	}

	public static void PredSuccway2(Node root, int curr, int prev, int num) {
		prev = curr;
		curr = root.data;
		if (curr == num) {
			System.out.println(prev + " ");
		} else if (prev == num) {
			System.out.println(curr + " ");
		}
		for (int i = 0; i < root.childern.size(); i++) {
			PredSuccway2(root.childern.get(i), curr, prev, num);
		}
	}

	public static void KthLargest(Node root, int kth, HeapMover hm) {
		int num = Integer.MAX_VALUE;
		while (kth > 0) {
			hm.floor = Integer.MIN_VALUE; // after every call we need to reset
											// the value of floor
			SealAndFloor(root, num, hm); // or else it will give maximum value
											// again till end.
			num = hm.floor;

			kth--;
		}
	}

	// to be completed
	public static int Diameter(Node root, int start, int end, int sum) {
		if (root.childern.size() == 0 && root.data != end) {
			sum--;
		}
		for (int i = 0; i < root.childern.size(); i++) {
			Diameter(root, start, end, sum);
			if (root.data == end) {

			}
		}

		return sum;
	}

	public static void LevelOrder(Node root) {
		LinkedList<Node> queue = new LinkedList();
		queue.addLast(root);

		while (queue.size() > 0) {
			Node fr = queue.getFirst();
			queue.removeFirst();
			System.out.print(fr.data + " ");
			for (int i = 0; i < fr.childern.size(); i++) {
				queue.addLast(fr.childern.get(i));
			}
		}
	}

	public static void LevelOrderNextLine(Node root) {
		LinkedList<Node> queue = new LinkedList();
		queue.addLast(root);

		LinkedList<Node> nextqueue = new LinkedList();
		while (queue.size() > 0) {

			Node fr = queue.getFirst();
			queue.removeFirst();
			System.out.print(fr.data + " ");

			for (int i = 0; i < fr.childern.size(); i++) {

				nextqueue.addLast(fr.childern.get(i));

			}
			if (queue.size() == 0) {
				queue = nextqueue;
				nextqueue = new LinkedList();
				System.out.println(" ");
			}

		}

	}

	public static void LevelOrderZigzag(Node root) {
		LinkedList<Node> currqueue = new LinkedList<>();
		currqueue.addLast(root);
		boolean ltr = true;

		LinkedList<Node> nextqueue = new LinkedList<>();

		while (currqueue.size() > 0) {

			Node fr = currqueue.getFirst();
			currqueue.removeFirst();
			System.out.print(fr.data + " ");
			if (ltr) {
				for (int i = 0; i < fr.childern.size(); i++) {

					nextqueue.addFirst(fr.childern.get(i));
				}
			} else {
				for (int i = fr.childern.size() - 1; i >= 0; i--) {

					nextqueue.addLast(fr.childern.get(i));
				}
			}
			if (currqueue.size() == 0) {
				currqueue = nextqueue;
				nextqueue = new LinkedList<>();
				System.out.println(" ");
				ltr=!ltr;
			}

		}
		

	}
	public static class Ehelper{
		
		public int state;
		public Node root;
		Ehelper(Node root,int state){
			this.root=root;
			this.state=state;
		}
		
	}
	
	//itetrativeorder
	public static void euler(Node root){
		
		LinkedList<Ehelper> stack=new LinkedList<Ehelper>();
		Ehelper rh=new Ehelper(root,0);
		stack.addFirst(rh);
		while(stack.size()>0){
			Ehelper th=stack.getFirst();
			int cs=th.root.childern.size();
			if(th.state==0){
				
				System.out.println(th.root.data+"pre");
				th.state++;
			}
			else if(th.state>=1 && th.state<=cs){
				Ehelper ch=new Ehelper(th.root.childern.get(th.state-1),0);
				stack.addFirst(ch);
				if(th.state==2){
				System.out.println(th.root.data+"in"+(th.state));
				}
				th.state++;
			}
			else if(th.state==cs+1){
				System.out.println(th.root.data+"post");
				th.state++;
			}
			else if(th.state==cs+2){
				
				stack.removeFirst();
			}
		}
	}
	//bonus 

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110,
				-1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1));
		Node root = construct(list);
		display(root);
		// System.out.println(size(root));
		// System.out.println(max(root));
		// System.out.println(height(root));
		// System.out.println(find(root, 120));
		// System.out.println(n2rPath(root, 120));
		// System.out.println(lca(root, 70,120));
		// System.out.println(distance(root,100 ,120));
		// mirror(root);
		// display(root);
		// mirror(root);
		// removeLeaves(root);
		// display(root);
//		HeapMover hm = new HeapMover();
//		multisolver(root, 0, hm);
//		System.out.println(hm.ht + " " + hm.mn + " " + hm.mx + " " + hm.sz);
//		SealAndFloor(root, 65, hm);
//		System.out.println(hm.seal + " " + hm.floor);
//		// PredecessorAndSuccessor(root, 0, 0, hm, 90);
//		// PredSuccway2(root, 0, 0, 90);
//		// KthLargest(root, 5, hm);
//		// System.out.println(hm.floor+" ");
//		LevelOrder(root);
//		System.out.println();
//
//		LevelOrderNextLine(root);
//		LevelOrderZigzag(root);
		euler(root);
	}

}
