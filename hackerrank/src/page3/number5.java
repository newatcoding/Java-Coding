package page3;

import java.util.Scanner;

public class number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int p=scn.nextInt();
		int c=(int)Math.pow(num,0.5);
		double d=Math.pow(num, 0.5);
		System.out.println(d);
		double mul=Math.pow(10,p);
		double e=d*mul;
		System.out.println(e);
		double f=(long)e;
		System.out.println(f);
		double num1=f/mul;
		System.out.println(c+" "+num1);
	}

}
