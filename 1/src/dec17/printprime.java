package dec17;

import java.util.Scanner;

public class printprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = 2;

		while (c <= b) {
			boolean isPrime = true;

			int d = 2;
			while (d * d <= c) {

				if (c % d == 0) {
					isPrime = false;
					break;
				}
				d++;
			}
			if (isPrime == true) {
				System.out.print(c + " ");

			}
			c++;
		}
	}

}