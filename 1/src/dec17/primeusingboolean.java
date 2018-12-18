package dec17;

import java.util.Scanner;

public class primeusingboolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = 1;
		boolean see = true;
		while (c < b) {
			c++;
			if (b % c == 0) {
				see = false;
				break;
			}
		}
		if(see=false)
		{
			System.out.println(b+ " not is prime");
						}
		else if(see=true)
			{
				System.out.println(b+ " is prime");	
				
			}

	}
}