package dec21;

import java.util.Scanner;

public class rotatingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner a=new Scanner(System.in);
		int p=a.nextInt();
		if(p>=0)
		{
			
		}
		if(p<0)
		{
			p=10+p;
		}
		for(int i=0;i<p/2;i++)
		{	int c=arr[i];
			arr[i]=arr[p-i-1];
			arr[p-i-1]=c;
		} 
//		for(int i=0;i<10;i++)
//		{
//			System.out.print(arr[i]+ " ");
//		}
		int j=1;
		for(int i=p;i<(10+p)/2;i++)
		{ 
		int c=arr[i];
			arr[i]=arr[10-j];
			arr[10-j]=c;
		j++;
	}
//		for(int i=0;i<10;i++)
//		{
//			System.out.print(arr[i]);
//		}	
		for(int i=0;i<5;i++)
		{
			int c=arr[i];
			arr[i]=arr[9-i];
			arr[9-i]=c;
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
