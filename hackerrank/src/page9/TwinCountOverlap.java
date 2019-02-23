package page9;

import java.util.Scanner;

public class TwinCountOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		TwinCount(str, 0,0);
		TwinCountNoOverlap(str,0, 0);
	}
	//overlaping
	public static void TwinCount(String str,int cnt,int total){
		if(cnt>=str.length()-2){
			System.out.println(total);
			return;
		}
		if(str.charAt(cnt)==str.charAt(cnt+2)){
			
			total++;
		}
		TwinCount(str, cnt+1,total);
	}
	//non overlaping
	public static void TwinCountNoOverlap(String str,int cnt,int total){
		if(cnt>=str.length()-4){
			System.out.println(total);
			return;
		}
		if(str.charAt(cnt)==str.charAt(cnt+4)){
			total++;
			
		}
		TwinCountNoOverlap(str, cnt+1, total);
	}

}
