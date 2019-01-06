package dec26;

import java.util.Scanner;

public class checkthepallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		checkthepallindrome(s);
		printallpalsubstr(s);
	}
	public static void checkthepallindrome(String str)
	{
		int p=0;
		for(int i=0;i<str.length()/2;i++)
			
		{
			char c=str.charAt(i);
			char d=str.charAt(str.length()-i-1);
			if(c !=d)
			{
				
				p++;
			}
		}
		if(p==0)
		{
			System.out.println(str +"  it is pallindrome");
		}
		else if(p>0)
		{
			System.out.println( str +"  not pallindrome");
		}
		
	}
	public static void printallpalsubstr(String str)
	{ 
	String str1="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				str1=str.substring(i,j+1);
				checkthepallindrome(str1);
				
			}
						
			
		}
		
	}
}
