package dec18;

import java.util.Scanner;

public class inversediamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
        int b=n.nextInt();
        int space=1;
        int star=(b+1)/2;
        int i;
        int j;
        for(i=1;i<=b;i++)
        {
            
            
            if(i>(b+1)/2)
            {
                space-=2;
                star++;
            }
            for(j=1;j<=star;j++)
            {
            System.out.print("*");
            }
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=star;j++)
            {
            System.out.print("*");
            }

            System.out.println(" ");
            if(i<(b+1)/2)
            {
                space+=2;
                star--;
            
        }
    }

} }