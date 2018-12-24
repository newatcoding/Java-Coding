package page3;

import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int check=a.nextInt();
		int p=0;
		while(num!=0)
		{
			int rem=num%10;
			if(rem==check)
			{
				p++;
			}
			num=num/10;
		}
		System.out.println(p);
	}

}
