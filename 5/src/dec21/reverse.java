package dec21;

import java.util.Scanner;

public class reverse {

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
		for(int i=(size-1);i>=0;i--)
		{
			System.out.print(arr[i]);;
		}
	}
	
}
