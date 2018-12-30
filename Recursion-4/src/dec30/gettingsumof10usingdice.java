package dec30;

import java.util.ArrayList;

public class gettingsumof10usingdice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printboardpath(0,10,"");
	System.out.println(printboardpath1(0,10));
	}
	static int count=0;
	// using string
	public static void printboardpath(int src,int dest,String path){
		if(src==dest)
		{
			System.out.println(path+" "+(++count));
			return;
		}
		for (int i = 1; i <= 6 && src+i<=dest; i++) {
		
			printboardpath(src+i, dest,path+i);

		}
		
	}
	//using arraylist
	public static ArrayList<String> printboardpath1(int src,int dest){
		if(src==dest)
		{
			ArrayList<String> erem=new ArrayList<>();
			erem.add("");
			return erem;
		}
		ArrayList<String> ros=new ArrayList<>();
		for (int i = 1; i <= 6 && src+i<=dest; i++) {
		
		ArrayList<String> rem=printboardpath1(src+i, dest);
		for(String val:rem){
			ros.add(i+val);
		}


		}
		
		return ros;
	}

}
