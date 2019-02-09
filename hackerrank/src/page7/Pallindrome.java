package page7;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println(Pallindrome(arr,n-1,0,false));
	}
	public static boolean Pallindrome(int[] arr,int n,int i,boolean val){
		if(i==n/2)
		{
			return true;
		}
		if(arr[i]!=arr[n-i])
		{
			return false;
		}
	
		boolean br=Pallindrome(arr,n,i+1,val);
		return br;
	}
}
