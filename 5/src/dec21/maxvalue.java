package dec21;

import java.util.Scanner;

public class maxvalue {

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
		}	int p=1;
		  int i=0;
			while(p<size)
			{
				
								if(arr[i]<arr[p])
									
				{
					i=p;
				} p++;
				
			}
			
			System.out.println(arr[i]);
		
	}

}
