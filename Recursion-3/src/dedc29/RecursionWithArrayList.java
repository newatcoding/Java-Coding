package dedc29;

import java.util.ArrayList;

public class RecursionWithArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> test1 =new ArrayList<>();
//		ArrayList<String> test2 =new ArrayList<>();
//		test2.add("");		//test1==0 and test2==1 now
//		ArrayList<Integer> arr =new ArrayList<>();
//		arr.add(10);		//adds value in the ar (0)
//		arr.add(10);		//adds valuse in(1)
//		arr.add(10);		//(2)
//		arr.add(2,1000);		//adds value in 2 and value in 2 shifts to 3  (index,value)
////		arr.remove(0)       //removes the array from position (index)
//		arr.set(2, 123);		//replaces the array  (index,value)
		System.out.println(getsubsequence("abc"));
		System.out.println(getsubsequenceascii("bc"));
		
		System.out.println(nokiaKPC("139"));
		System.out.println(getPath(0,0,2,2));
		
	}
	static String[] codes={".;","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
	public static ArrayList<String> getsubsequence(String abc)
	{
		if(abc.length()==0)
		{
			ArrayList<String> rres=new ArrayList<>();
			rres.add("");
			return rres;
		}
		char c=abc.charAt(0);
		String ros=abc.substring(1);   //bc
		
		ArrayList<String> sspfros=getsubsequence(ros);
		ArrayList<String> res=new ArrayList<>();
		for(String ss:sspfros)
		{
			res.add(ss);
			res.add(c+ss);
		}
		return res;
	}
	public static ArrayList<String> getsubsequenceascii(String abc)
	{
		if(abc.length()==0)
		{
			ArrayList<String> rres=new ArrayList<>();
			rres.add("");
			return rres;
		}
		char c=abc.charAt(0);
		String ros=abc.substring(1);   //bc
		
		ArrayList<String> sspfros=getsubsequenceascii(ros);
		ArrayList<String> res=new ArrayList<>();
		for(String ss:sspfros)
		{
			res.add(ss);
			res.add((int)c+ss);
			res.add(c+ss);
		}
		return res;
	}
    public static ArrayList<String> nokiaKPC(String str)

    {
    	if(str.length()==0)
		{
			ArrayList<String> rres=new ArrayList<>();
			rres.add("");
			return rres;
		}
    	char ch=str.charAt(0);
    	String ros=str.substring(1);
    	
    	ArrayList<String> arr=nokiaKPC(ros);
    	ArrayList<String> res=new ArrayList<>();
    	String code=codes[ch-'0'];  //abc
    	
    	for(String ss:arr)
    	{
    		for(int i=0;i<code.length();i++)
    		{
    			char ch1=code.charAt(i);
    			res.add(ch1+ss);
    		}
    		
    		
    	}
    	return res;
    	 
    }
    public static ArrayList<String> getPath(int sr,int sc,int dr,int dc)
	{
		if (sr == dr && sc == dc) {
			ArrayList<String> eres = new ArrayList<>();
			eres.add("");
			return eres;
		}
		ArrayList<String> res = new ArrayList<>();
		if (sc < dc) {
			ArrayList<String> hres = getPath(sr, sc + 1, dr, dc);
			for (String val : hres)
				res.add("H" + val);
		}
		if (sr < dr) {
			ArrayList<String> vres = getPath(sr + 1, sc, dr, dc);
			for (String val : vres)
				res.add("V" + val);
		}
		return res;
	}
}
