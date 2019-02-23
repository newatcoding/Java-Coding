package page9;

import java.util.Scanner;

public class ReplaceHiwithPep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int i=scn.nextInt();
		Replace(str,0);
		
	}
	public static void Replace(String str,int cnt){
		if(cnt>=str.length()-2)
		{
			if(str.charAt(str.length()-2)=='h' && str.charAt(str.length()-1)=='i')
			{
				str=str.substring(0, str.length()-2)+"pep";
				System.out.println(str);
			}
			else
			{
			System.out.println(str);
			}
			return;
		}
		if(str.charAt(cnt)=='h' && str.charAt(cnt+1)=='i')
		{
			str=str.substring(0, cnt)+"pep"+str.substring(cnt+2);
			Replace(str, cnt+3);
			
		}
		else
		{
			Replace(str, cnt+1);
		}
		
		return;
		
		
	}

}
