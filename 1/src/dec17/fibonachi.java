package dec17;

import java.util.Scanner;

public class fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imp = new Scanner(System.in);
		int b = imp.nextInt();
		int a = -1;
		int c = 1;
		int d = 1;
		int e;
		while (d <= b) {
			e = c + a;
			a = c;
			c = e;
			System.out.print(e + " ");
			d++;

		}
	}

}
