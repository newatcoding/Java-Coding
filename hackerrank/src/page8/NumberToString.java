package page8;

import java.util.Scanner;

public class NumberToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String num=scn.next();
		int  div=scn.nextInt();
		
		printnewString(num,0,0);
	}
	public static void printnewString(String str,int i,int sum){
		if(i==str.length())
		{
			System.out.println(sum+" ");
			return;
		}
		
		int newnum=Integer.parseInt(str)/i;
		printnewString(str, i+1,sum);
		
	}
	
}