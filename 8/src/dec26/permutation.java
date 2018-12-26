package dec26;

import java.util.Scanner;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		String str=scn.next();
		permutationofeverychar(str);
	}
	public static void permutationofeverychar(String str)
	{
		for(int  i=0;i<str.length();)
		{   i=0;
			for(int j=i+1;j<=str.length();j++)
			{
		System.out.print(str.substring(i,j)+" ");
			}
			System.out.println(" ");
			i++;
		}
	}

}
