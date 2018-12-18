package dec18;

import java.util.Scanner;

public class forpatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int b=n.nextInt();
		int val=1;
		int i;
		int j;
		for(i=1;i<=b;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(val+" ");
				val++;
			}
			System.out.println(" ");
		}
	}

}
