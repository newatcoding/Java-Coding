package page3;

import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner a=new Scanner(System.in);
		 int r=a.nextInt();
		
         int num=a.nextInt();
       int num1=num;
       int p=0;
       while(num1!=0)
       {
           p++;
           num1=num1/10;
           
       }  
       if(r<0)
		 {
		r= p+r;
		 }
       int c=(int)Math.pow(10,p-r);
       int d=(int)Math.pow(10,r);
       int ans=0;
       int rem=num%c;
	   ans =rem*d;
	   num=num/c;
	   ans=ans+num;
       System.out.println(ans);
	}
}