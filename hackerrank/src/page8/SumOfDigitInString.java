package page8;

import java.util.Scanner;

public class SumOfDigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String num=scn.next();
		printsum(num,0,0);
	}
	public static void printsum(String str,int i,int sum){
		if(i==str.length())
		{
			System.out.println(sum+" ");
			return;
		}
		String ch=str.substring(i, i+1);
		sum=sum+ Integer.parseInt(ch);
		printsum(str, i+1,sum);
		
	}

}
