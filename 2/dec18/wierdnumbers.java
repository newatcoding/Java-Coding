package dec18;

import java.util.Scanner;

public class wierdnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int b=n.nextInt();
	
		int i;
		int j;
		for(i=0;i<=b;i++)
		{
			int val=1;
			for(j=0;j<=i;j++)  //when i =j then value of val=0 will be dismissed as the next loop j>i will not work adn then val resets to 1
			{
				
				
				
				System.out.print(val+" ");
			int nckp1=val*(i-j)/(j+1);
				val=nckp1;
				
			}
			System.out.println(" ");
		}
	}

}
