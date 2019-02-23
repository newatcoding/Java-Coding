package page9;

import java.util.Scanner;

public class Countofaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		CountRepeat(str, 0,0);
		CountNoRepeat(str, 0,0);
	}
	public static void CountRepeat(String str,int cnt,int repeat){
		if(cnt>=str.length()-2){
			System.out.println(repeat);
			return;
		}
		if(str.charAt(cnt)=='a' && str.charAt(cnt+1)=='a' && str.charAt(cnt+2)=='a'){
			repeat++;
		}
		CountRepeat(str, cnt+1, repeat);
	}
	public static void CountNoRepeat(String str,int cnt,int repeat){
		if(cnt>=str.length()-2){
			System.out.println(repeat);
			return;
		}
		if(str.charAt(cnt)=='a' && str.charAt(cnt+1)=='a' && str.charAt(cnt+2)=='a'){
			repeat++;
			CountNoRepeat(str, cnt+3, repeat);
		}
		else
		{
			CountNoRepeat(str, cnt+1, repeat);
		}
		
	}

}
