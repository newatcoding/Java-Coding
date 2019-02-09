package page7;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		int I=scn.nextInt();
		
		Reverseanarray(0,arr,I);
	}
	public static void Reverseanarray(int a,int[] arr,int i){
		if(a==arr.length)
		{
			return;
		}
		Reverseanarray(a+1,arr, i);
		
	}

}
