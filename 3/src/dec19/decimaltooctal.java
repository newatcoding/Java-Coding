package dec19;

import java.util.Scanner;

public class decimaltooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  a=new Scanner(System.in);
		int num=a.nextInt(); 
		int pow=1;
		int rem;
		int sum=0 ;
		while(num!=0)
		{
			rem=num%8;
			num=num/8;
			sum= sum+ rem*pow;
			pow=pow*10;
		}
		System.out.println(sum+ " ");
	}

}
