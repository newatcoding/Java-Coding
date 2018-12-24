package hackerrank;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner n=new Scanner(System.in);
	        int b=n.nextInt();
	       int i;
	       
	       int c=b+2;
	        for(i=1;i<=b;i++)
	        {
	        	
	           for(int k=1;k<=i;k++)
	                { 
	                
	                    System.out.print(k+" ");
	                   
	                }   
	          
	            for(int k=c;k>=0;k--)
	            {
	                System.out.print(" ");
	               
	            } c=c-2;
	            for(int k=b;k<=i;k--)
	            {
	                System.out.print(" ");
	               
	               
	            } 
	            if(i<b)
	            {
	           for(int k=i;k>=1;k--)
	                { 
	                
	                    System.out.print(k+" ");
	                }
	            }
	            else
	            {
	            	 for(int k=i-1;k>=1;k--)
		                { 
		                
		                    System.out.print(k+" ");
		                }

	            }
	         

	            System.out.println(" ");
	           	    }

	} 
	        }

