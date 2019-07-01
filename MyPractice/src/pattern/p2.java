package pattern;

import java.util.Scanner;

public class p2 {
//normal star triangle
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.err.println("Enter number of lines");
		int n=scn.nextInt();;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println("  ");
		}
		}

}
