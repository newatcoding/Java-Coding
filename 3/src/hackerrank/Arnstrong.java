package hackerrank;

import java.util.Scanner;


public class Arnstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int arn=a.nextInt();
		int er=a.nextInt();
		int pow=0;
		
		int p=arn;
		int q1=arn;
		while(q1!=0)
		{
			pow++;
			q1=q1/10;
		}
		int ans=0;
		while(arn!=0)
		{
			int rem=arn%10;
			int c=(int)Math.pow(rem, pow);
			ans=ans+ c;
			arn=arn/10;	
			}
			if(ans==p)
			{
			System.out.println("true");
			}
		else
			{
				System.out.println("false");
				
			}
		
			for(int i=1;i<=er;i++)
			{ 	ans=0;
				
				int q2=i;
				int pow1=0;
				int er1=er;
				while(er1!=0)
				{
					pow1++;
					er1=er1/10;
				}
				
				while(q2!=0)
				{
					int rem=q2%10;
					int c=(int)Math.pow(rem, pow1);
					ans=ans+ c;
					q2=q2/10;	
					}
					if(ans==i)
					{
						System.out.println(ans+ " ");
					}
					
			}
	}

}
