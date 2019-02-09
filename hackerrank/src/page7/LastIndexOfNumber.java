package page7;

import java.util.Scanner;

public class LastIndexOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=scn.nextInt();
		}
		int find=scn.nextInt();
		int pos=LastIndexOfNumber(arr,0,find,-1);
		System.out.println(pos);
	}
	public static int LastIndexOfNumber(int[] arr,int i,int find,int pos1){
		if(i==arr.length)
		{
			return pos1;
		}
		if(arr[i]==find)
		{
			pos1=i;
			
		}
		int pos=LastIndexOfNumber(arr,i+1,find,pos1);
		
		return pos;
	}
	public static void AllIndexOfNumber(){
		
	}

}
