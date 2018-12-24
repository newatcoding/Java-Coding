package hackerrank;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
        int num1=a.nextInt();
          int num2=a.nextInt();
      int p=2; int q=0;  
      while(p<=num1 || p<=num2)
      { 
          
          if(num1%num2==0 ||num2%num1==0)
          {    if(num1>num2)
          {
              System.out.println(num2);          return;
              }
          else
          {
              System.out.println(num1);     return;
          }    }
          else if(num1%p==0 &&num2%p==0)
          {
              q=p; 
          }            
          p++;
          }
      int ans=1;
      int p1=2;
       while(p1<=num1 || p1<=num2)
       {
           
           while(num1%p1==0 && num2%p1==0)
           {
               ans=ans*p1;
                                  num1=num1/p1;
                               num2=num2/p1;  
               
              
               
           } 
          
           p1++;
       }
       ans=ans*num1*num2;
      System.out.println(q+ " " +ans);
  }
}