package page8;

import java.util.Scanner;

public class pallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str1=scn.next();
		
		System.out.println(pallindrome(str1,true,0));
		
	}
	public static boolean pallindrome(String str,boolean check,int i){
		if(i==(str.length()+1)/2){
			return true; 
		}
		boolean br=pallindrome(str, check, i+1);
		if(check==true)
		{
			int ch1=str.charAt(i);
			int ch2=str.charAt(str.length()-1-i);
			if(ch1==ch2 || ch1-ch2==32 || ch2-ch1==32){
			return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
			
	}

}
