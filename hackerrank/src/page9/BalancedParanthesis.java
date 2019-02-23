package page9;

import java.util.Scanner;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		System.out.println(Check(str,0,0));
	}
	public static boolean Check(String str,int cnt,int sum){
		if(cnt>str.length()-1)
		{
			if(sum==0){
			return true;
			}
			else {
				return false;
			}
		}
		if(str.charAt(cnt)=='(' || str.charAt(cnt)=='['  || str.charAt(cnt)=='{')
		{
				sum=sum+str.charAt(cnt);
		}
		else if(str.charAt(cnt)==')' || str.charAt(cnt)==']'  || str.charAt(cnt)=='}')
		{
			if(str.charAt(cnt)==')'){
			sum=sum-str.charAt(cnt)+1;     }
			else {
				sum=sum-str.charAt(cnt)+2;
			}
		}
		boolean br=Check(str, cnt+1,sum);
		return br;
	}

}
