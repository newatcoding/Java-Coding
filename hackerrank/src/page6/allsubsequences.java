package page6;

import java.util.Scanner;

public class allsubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use bit to complete the question
		Scanner scn=new Scanner(System.in);
        String str=scn.next();
      
        int num=(int)Math.pow(2,str.length());
      for(int i=0;i<num;i++)
      {
    	   	checkbitison(i,str);
    		 
      }
    }
	public static void checkbitison(int i,String str)
	{
		String str1="";
		for(int j=0;j<str.length();j++)
		{
			int bm=1<<j;
			if((bm&i)==bm)
			{
				str1=str1+str.charAt(j);
			}
		}
		System.out.println(str1);
	}
}