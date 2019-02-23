package page8;

import java.util.Scanner;

public class MoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		char ch=scn.next().charAt(0);   //new way learn

		String str1=MoveChar(str, 0,ch," ");

		System.out.println(str1);
	}
	public static int  count=0;
	public static String MoveChar(String str, int index,char ch,String str1){
		if(index<=str.length()-1)
		{
			return str1;
		}
	
		if(str.charAt(index)==ch)
		{
				count++;
		 str1=MoveChar(str, index+1, ch,str1);
		}
		else{
			str1=str1+str.charAt(index);
			System.out.println();
		 str1=MoveChar(str, index+1, ch,str1);
		}
		
		
		
		return str1;
		
	}
	
		
	
}
