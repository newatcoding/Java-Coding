package dec26;

import java.util.Scanner;

public class compressingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		String str=scn.next();
		compress(str);
		compress2(str);
	    
	}
	public static void compress(String str)
	{
		StringBuilder str1= new StringBuilder();
		char ch=str.charAt(0);
		str1.append(ch);
		for(int i=0; i<str.length();i++)
		{ 
			char next=str.charAt(i);
			if(ch!=next)
			{
				str1.append(next);
				ch=next;
			}
			
		}
		System.out.println(str1.toString());
	}
	public static void compress2(String str)
	{
		StringBuilder str1= new StringBuilder();
		char ch=str.charAt(0);
		str1.append(ch);
		int count=0;
		for(int i=0; i<str.length();i++)
		{ 
			char next=str.charAt(i);
			if(ch!=next)
			{   
				str1.append(count);
				str1.append(next);
				ch=next;
				count=1;
			}
			else
			{
				count++;
			}
			
		}
		str1.append(count);
		System.out.println(str1.toString());
	}
}
