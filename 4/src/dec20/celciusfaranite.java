package dec20;

import java.util.Scanner;

public class celciusfaranite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("temperature in faranite");
		for(int i=0; i<300;i+=20)
			{
		
					float celcius=(int)((5.0/9)*(i-32)); //there is a difference between 5 and 5.0;code error for 5 
					System.out.println(celcius);
				}
	}

}
