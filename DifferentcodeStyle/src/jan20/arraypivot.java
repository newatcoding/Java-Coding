package jan20;

import java.util.Scanner;

public class arraypivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,5,3,11,9,7,6};
		Scanner scn=new Scanner(System.in);
		int pivot=scn.nextInt();
		arraypivot(arr, pivot); //partition 
	}
	public static  void arraypivot(int[] arr, int pivot){ 
	int i=0; int j=0;
	//0's -> o to i-1
	//1's -> i to j-1
	//unknown -> j to end
	while(i<arr.length)
	{
		if(arr[i]>=pivot)
		{
			i++;
		}
		else
		{
			swap(i,j,arr);
			i++;
			j++;
		}
	}
	printanswer(arr);
	System.out.println(" ");
}
	public static void swap(int i,int j,int[] arr){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void  printanswer(int[] arr){
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
	}
}
