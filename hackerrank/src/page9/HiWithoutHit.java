package page9;

import java.util.Scanner;

public class HiWithoutHit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int i=scn.nextInt();
		Count(str,0,0);
		
		String str1=Remove(str,0," ");
//		System.out.println(str1.charAt(i));
	System.out.println(str1);
	}
	
	public static void Count(String str,int cnt,int count){
		if(cnt>=str.length()-2)
		{
			if(str.charAt(cnt)=='h' && str.charAt(cnt+1)=='i'){
				count++;
			}
			System.out.println(count);
			return;
		}
		if(str.charAt(cnt)=='h' && str.charAt(cnt+1)=='i'){
			if(str.charAt(cnt+2)!='t'){
				count++;
			}
			
		}
		Count(str, cnt+1,count);
		
	}
	public static String Remove(String str,int cnt,String str1){
		if(cnt>=str.length()-2)
		{
		return str1;
		}
		if(str.charAt(cnt)=='h' && str.charAt(cnt+1)=='i' && str.charAt(cnt+2)!='t'){
		
			
		}
		else
		{
			str1=str1+str.charAt(cnt);
		}
		Remove(str, cnt+1, str1);
		return str1;
	}
}
