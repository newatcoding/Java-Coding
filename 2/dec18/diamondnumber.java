package dec18;

import java.util.Scanner;

public class diamondnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 Scanner n=new Scanner(System.in);
	        int b=n.nextInt();
	        int space=(b-1);
	        int star=1;
	        int i;
	        int j;
	        int val=1;
	        for(i=1;i<=b;i++)
	        {
	            
	            for(j=1;j<=space;j++)
	            {
	            System.out.print(" ");
	            }
	            int myval=val;
	            for(int k=1;k<=star;k++)
	            { 
	            
	                System.out.print(myval+" ");
	                if(k<=star/2)
	                {
	                myval++; }
	                else{
	                    myval--;
	                }
	            }
	            System.out.println(" ");
//	            System.out.print(space+" "+star);
	            if(i<=b/2)
	            {
	                space-=2;
	                star+=2;
	                val++;
	            }
	            else
	            {
	                space+=2;
	                star-=2;
	                val--;
	            }
	            
	        }
	    }

	}