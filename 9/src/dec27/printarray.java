package dec27;

import java.util.Scanner;

public class printarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,5,6,2,3};
//		printarray(0,arr);
		int[] arr1={2,4,7,6,4,7,5,6,8,7};
//		decreasingarray(0,arr);
		
//		maxvalue(0,arr);
		Scanner scn=new Scanner(System.in);
		int c=scn.nextInt();
//		find(0,arr,c);
		int d=findlast(0,arr1,c);
		System.out.println(d);
		int d=findallindex(0,arr1,c,j);
	}
//	public static void printarray(int a ,int[] n)
//	{
//		if(a==n.length)
//		{
//			return;
//		}
//				System.out.println(n[a]);
//				printarray(a+1,n);
//		
//	}



//	public static void decreasingarray(int a,int[] n)
//	{
//		if(a==5)
//		{
//			return;
//		}
//		
//		decreasingarray(a+1,n);
//		
//		System.out.println(n[a]);
//		
//	}

//	public static int maxvalue(int a,int[] n)  //3rd variable problem
//	{
//		if(a==n.length-1)
//		{
//			return;
//		}
//		
//		if(n[a]<n[a+1])
//		{
//			c=n[a+1];
//		}
//		else if()
//		maxvalue(a+1, n);
//		
//		
//	}
//	public static void find(int a, int[] n,int num)
//	{
//		if(a==n.length)
//		{
//			System.out.println("value not found");
//			return;
//		}
//		if(n[a]==num)
//		{
//			System.out.println("number is in position " + (a+1));
//			return;
//		}
//		find(a+1,n,num);
//	}
	public static int findlast(int a,int[] n,int data) //method important
	{
		if(a==n.length)
		{
			return -1;
		}
		int res=findlast(a+1,n,data);
		if(res==-1)
		{
		if(n[a]==data)
				{
					return a;
				}
		return -1;
		}
		return res;
	}
	public static int[] findallindex(int a,int[] n,int data,int j) //array return problem
	{
		if(a==n.length)
		{
			int[] res =new int[j];
			return res;
		}
		
		if(n[a]==data)
		{
			j++;
			
		}
				
		int[] rres=findallindex(a+1,n,data,j);
		
	
		if(n[a]==data)
		{
			ress[j-1]=a;
		}
		
		return arr[j];
	}
	
	
}