package page8;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		BubbleSort(arr,0);
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
	public static void BubbleSort(int[] arr,int a){
		if(a==arr.length-1)
		{
			return ;
		}
		for(int i=0;i<a+1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				a=1;
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		BubbleSort(arr,a+1);
	}

}
