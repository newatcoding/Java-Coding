package dec26;

import java.util.Scanner;

public class Substringprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		printallsubstring(s);
		
	}
	public static void printallsubstring(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
		System.out.print(str.substring(i,j)+" ");
			}
			System.out.println(" ");
		}
	}

}
