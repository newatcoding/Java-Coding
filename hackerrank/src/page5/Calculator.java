package page5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		 char ch=scn.next().charAt(0);
		 int n1=scn.nextInt();
		 int n2=scn.nextInt();
		 int ans=0;
		 while(ch!='x' || ch!='X')
		 {
			  
		 switch(ch)
		 {
		 case '+': 
			 ans=n1+n2;
			 break;
		 case '-':
			 ans=n1-n2;
			 break;
		 case '*':
			 ans=n1*n2;
			 break;
		 case '/':
			 ans=n1/n2;
			 break;
		 case '%':
			 ans=n1%n2;
			 break;
		 case 'X':
			 break;
		 case 'x':
			 break;
		 default:
			
			break;
			 
		 }
		 
		 System.out.println(ans);
		 ch=scn.next().charAt(0);
		 if(ch=='X' || ch=='x')
		 {
			 break;
		 }
		 else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%')
		 {
		 n1=scn.nextInt();
		 n2=scn.nextInt();
		 }
		 else
		 {
			 System.out.println("Invalid Operation");
		 }
		 }
		 
	}

}
