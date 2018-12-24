package page3;

import java.util.Scanner;

public class number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int p=0;
		for(int i=1;i<num;i++)
		{
		int c=(int)Math.pow(2,i);
		if(num==c)
		{
			System.out.println("true");
			p++;
			break;
		}
		
		}
		if(p==0)
		{
		System.out.println("false");
		}
	}

}
