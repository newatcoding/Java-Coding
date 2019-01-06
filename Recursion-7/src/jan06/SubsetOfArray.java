package jan06;

import java.util.ArrayList;

public class SubsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30};
		String str="";
//		ArrayList<Integer> set=new ArrayList();
		UsingArrayList(arr,0,new ArrayList<>());
		printss(arr,0,str);
	}
	public static void UsingArrayList(int[] arr,int vidx,ArrayList<Integer> set)
	{
		if(vidx==arr.length)
		{
			System.out.println(set);
			return;
		}
		UsingArrayList(arr,vidx+1,set);
		set.add(arr[vidx]);
		UsingArrayList(arr,vidx+1,set);
		set.remove(set.size()-1);
	}
	
	//print subset using string  i.e sub sequence
	public static void printss(int[] arr,int vidx,String set)
	{
		if(vidx==arr.length)
		{
			System.out.println(set);
			return;
		}
		printss(arr,vidx+1,set);

		printss(arr,vidx+1,set+" "+arr[vidx]);
	}

}
