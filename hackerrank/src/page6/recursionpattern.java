package page6;

import java.util.Scanner;

public class recursionpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        printrighttriangle(num);
    }
    public  static void printrighttriangle(int num)
    {
    if(num==0)
    {
        return;
    }
         for(int i=1;i<=num;i++)
        {
            System.out.print("*");
        }
        System.out.println("");
        printrighttriangle(num-1); 
    }

       
	}
        

        
        