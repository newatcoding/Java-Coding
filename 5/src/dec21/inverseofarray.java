package dec21;

import java.util.Scanner;

public class inverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //condition the value inside the array will not excede the number of array and it will be natural number
		Scanner a=new Scanner(System.in);
		int size=a.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the length of array");
		for(int i=0;i<size;i++)
		{
			System.out.println("enter " +i+ "th element");	//putting value in the array
			arr[i]=a.nextInt();
		}
		int[] arr1=new int[size];
		for(int i=0;i<size;i++)
		{
		int j=arr[i];
		arr1[j]=i;
				
			}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i]+ " ");
		}
		}
	}


