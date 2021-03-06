package jan13;

import java.util.Scanner;

public class PolynomialEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print a general polynomial equation using initial value of a and n
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int n=scn.nextInt();
		usingmathpower(x,n);
		withoutmathpower(x,n);
	
	}
	public static void usingmathpower(int x,int n)
	{
		int sum=0;
		int num=n;
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*(int)Math.pow(x,num);
			num--;
		}
		System.out.println(sum);
	}
	public static void withoutmathpower(int x,int n)
	{
		int sum=0;
		int pow=x;
		for(int i=n;i>=1;i--)
		{
			sum=sum+ i*pow;
			pow=pow*x;
		}
		System.out.println(sum);
	}
}
