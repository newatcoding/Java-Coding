package pattern;

import java.util.Scanner;

public class p1 {

//	Take as input N, a number. Print the pattern like this.
//	for N = 5
//	5
//	3
//	1
//	2
//	4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a  number");
		int n=scn.nextInt();
		for(int i=n;i>=0;i--){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		
		for(int i=0;i<=n;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}

}
