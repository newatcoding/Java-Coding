package dec26;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		String a=scn.next();
		printoddcharofstring(a);
		String result=makingnewstring(a);
		System.out.println(result);
		char[] arr=a.toCharArray();    //changes a string to an array of character
		
		
	}
	public static void printoddcharofstring(String a)
	{
		int c=a.length();
		for(int i=0;i<c;i++)
		{
			if(i%2!=0)
			{
				System.out.println(a.charAt(i));
			}
	}
	}
	public static String makingnewstring(String a)
	{
		String result="";
		for(int i=0;i<a.length();i++)
		{
			if(i%2!=0)
			{
				result+=a.charAt(i);
			}
		}
		return result;
	}
 
}
