package jan06;

public class PermulationUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="";
		StringBuilder ans=new StringBuilder("");
		StringBuilder ques=new StringBuilder("abc");
//		printPermutation1(str1,str2);
//		printPermutation(ques,ans);
		printpermutationans(ques,ans);
	}
	public static void printPermutation1(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			String c=ques.substring(0, i)+ques.substring(i+1);
//ans=ans+ch gives wrong answer ;
				printPermutation1(c,ans+ch);
				
			}
		
	}
	public static void printPermutation(StringBuilder ques,StringBuilder ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			
			return;
		}
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
				printPermutation(ques,ans);
				ans.deleteCharAt(ans.length()-1);
				ques.insert(i,ch); //as string builder is primitive i.e.valuse changes at every lever if any one changes 
										//so when we come back we need to restore the changes  we made
			}
	}
	public static void printpermutationans(StringBuilder ques,StringBuilder ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		ques.deleteCharAt(0);
		for(int i=0;i<=ans.length();i++){
			
			
			ans.insert(i,ch);
				printpermutationans(ques, ans);
			
			ans.deleteCharAt(i);
			ques.insert(i,ch);
			
		}
		ques.setCharAt(0, ch);
		
	}
}
