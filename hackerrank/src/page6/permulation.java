package page6;

import java.util.Scanner;

public class permulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        String str=scn.next();
        String str1="";
      
     for(int i=0;i<str.length();i++)
     {
    	 str1=str1+str.charAt(i);
    	 for(int j=0;j<str.length();j++)
    	 {
    		 if(i!=j)
    		 {
    			 str1=str1+str.charAt(j);
    		 }
    	 }
    	 System.out.println(str1);
    	 str1="";
     }
	}
	
}