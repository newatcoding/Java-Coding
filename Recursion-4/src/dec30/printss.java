package dec30;

public class printss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//get subsequence without using arraylist,  work done via question answer
		
		printss("abc","");
		printascii("abc","");
	}
	public static void printss(String str,String ans){
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		char ch=str.charAt(0);
		String rem=str.substring(1);
		
		printss(rem,ch+ans);
		printss(rem,ans);
		
		
	}
	public static void printascii(String str,String ans){
		if(str.length()==0)    //(ques=="") not usable because two different address will be  compared.. use this (str.equal(""))
		{
			System.out.print(ans+" ");
			
			return;
		}
		char ch=str.charAt(0);
		String rem=str.substring(1);
		
		printascii(rem,ch+ans);
		printascii(rem,(int)ch+ans);
		printascii(rem,ans);
		
		
	}
	
	

}
