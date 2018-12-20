package dec20;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		String str=a.next();
		char ch=str.charAt(0);		 //here 0th character is taken and stored in variable ch
		
//		String val="a";
//		int val1=Integer.parseInt(val);
//		System.out.println(val1);
//		
		
	
		if(ch>='a' && ch<='z')
		{
			System.out.println("lower case");
			char result=(char)(ch - 'a' + 'A');
			System.out.println(result);
		}
		else if(ch<='a' && ch<='z')
		{
		System.out.println("upper case");
		char result=(char)( ch - 'A' + 'a');
		System.out.println(result);
		}
		
	}

}
