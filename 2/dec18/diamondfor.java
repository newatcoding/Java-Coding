package dec18;

import java.util.Scanner;

public class diamondfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int b=n.nextInt();
		int space=b/2;
		int star=1;
		int i;
		int j;
		for(i=1;i<=b;i++)
		{
			for(j=1;j<=space;j++)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
//			System.out.print(space+" "+star);
			if(i<=b/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
			
		}
	}

}