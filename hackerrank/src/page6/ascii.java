package page6;

import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn=new Scanner(System.in);
	        String str=scn.next();
	        String str1="";
	        for(int i=0;i<str.length()-1;i++)
	        {
	            char ch=str.charAt(i);
	            char ch1=str.charAt(i+1);
	            int a=ch1-ch;
	            str1=str1+ch+a;
	        }
	        str1+=str.charAt(str.length()-1);
	        System.out.print(str1);
	    }
	}