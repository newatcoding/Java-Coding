package page7;

import java.util.Scanner;

public class checksortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
	        int n=scn.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=scn.nextInt();
	        }
	        boolean br=checksortedarray(0,arr,true);
	        System.out.println(br);

	    }
	
	public static boolean checksortedarray(int n,int[] arr,boolean br)
	{
		if(n==arr.length-1 || br==false)
		{
			return br;
		}
			if(arr[n]>arr[n+1])
			{
				br=false;
			}
			br=checksortedarray(n+1, arr,br);
			return br;
			
	}
	}