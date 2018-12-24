package dec17;

import java.util.Scanner;
public class reversingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner a=new Scanner(System.in);
	      int num=a.nextInt();
	      int reverse=0;
	      while(num!=0)
	      {
	    	  int digit=num%10;
	    	  reverse=reverse*10+digit;
	    	  num=num/10;
	    	  
	      }
	      System.out.println(reverse);
	        }
	}