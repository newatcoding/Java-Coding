package page9;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int rep=scn.nextInt();
		while(rep>0){
			int date=scn.nextInt();
			String day=scn.next();
			int[] arr=new int[7];
			String[] str={"mon", "tues", "wed", "thurs", "fri", "sat","sun"};
			int sum=0;
			int pos=0;
			for(int i=0;i<arr.length;i++){
				sum=date%7;
				if(str[i]==day){
					pos=i;
				}
				arr[i]=4;
			}
			for(int j=pos;j<pos+sum;j++){
				arr[j]=arr[j]+1;
			}
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]+" ");
			}
			System.out.println(" ");
			
			rep--;
		}
		
	}
	
	
}
