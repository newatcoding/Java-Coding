package dec17;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int b=a.nextInt();
		int c=2;
		
				while(c<b)
				{
					
				if(b%c==0)
				{
					System.out.println(b+ " not is prime");
					return;
					}
				c++;
				}
				
				
					System.out.println(b+ " is prime");	
					
				
			
				}
				
	}
	


