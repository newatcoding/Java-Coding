package dec17;

import java.util.Scanner;

public class revereseprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int b=n.nextInt();
		int i;
		int j;
		for(i=1;i<=b;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
