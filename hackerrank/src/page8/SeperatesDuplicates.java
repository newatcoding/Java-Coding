package page8;

import java.util.Scanner;

public class SeperatesDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int i=scn.nextInt();
	String str1=SeperateDuplicates(str, 0);
	System.out.println(str1.charAt(i));
	System.out.println(str1);
	String str2=RemoveDuplicates(str, 0);
		System.out.println(str2);
	}
	public static String SeperateDuplicates(String str,int i){
		if(i==str.length()-1)
		{
			return str;
		}
		if(str.charAt(i)==str.charAt(i+1))
		{
			String str1=str.substring(0, i+1);
			String str2=str.substring(i+1);
			str=str1+'*'+str2;
			i=i+1;
		}
		String str1=SeperateDuplicates(str, i+1);
		return str1;
		
	}
	public static String RemoveDuplicates(String str,int i){
		if(i==str.length()-1)
		{
			return str;
		}
		if(str.charAt(i)==str.charAt(i+1))
		{
			String str1=str.substring(0, i);
			String str2=str.substring(i+1);
			str=str1+str2;
			i=i-1;
		}
		String str1=RemoveDuplicates(str, i+1);
		return str1;
		
	}
	
}
