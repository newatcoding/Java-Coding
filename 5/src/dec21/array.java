package dec21;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int size=a.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the length of array");
		for(int i=0;i<size;i++)
		{
			System.out.println("enter" +i+ "th element");	//putting value in the array
			arr[i]=a.nextInt();
		} 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]); 			//checkng the length of the array
		} 	int[] arr1={1,2,3,4,5,6,7};
		for(int val:arr1)
		{
			System.out.println(val); 				//val takes values of the arr one by one and print them in this case
		}
		
	}

}
