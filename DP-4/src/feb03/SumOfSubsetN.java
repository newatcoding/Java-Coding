package feb03;

import java.util.Scanner;

public class SumOfSubsetN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int tar=scn.nextInt();
		int[] arr={2,3,5,6,1};
		Targetsum(arr, tar);
	}
	public static void Targetsum(int[] arr,int tar){
		boolean[][] bn=new boolean[arr.length+1][tar+1];
		bn[0][0]=true;
		for(int i=1;i<arr.length+1;i++){
			bn[i][0]=true;
			for(int j=0;j<tar+1;j++){
				if(j-arr[i-1]>=0 && bn[i-1][j-arr[i-1]]==true) // condition checking the difference and if any element in above row and column is true
				{
					bn[i][j]=true;
				}
				else if(bn[i-1][j]==true) // check boolean in row above for same column
				{
					bn[i][j]=true;
				}
			}
		}
		for(int k=0;k<bn.length;k++)
		{
			for(int n=0;n<bn[0].length;n++)
			{
				System.out.print(bn[k][n]+" "); 
			
			}
			System.out.println(" ");
		}
		String str="";
		printpath(bn, arr,bn.length-1 ,bn[0].length-1 ,str);
		
		
	}
	public static void printpath(boolean[][] bn,int[] arr,int i,int j,String str){
		if(i==0 || j==0){
			System.out.print(str+" ");
			return;
		}
		
			if(bn[i-1][j]==true){
				printpath(bn, arr, i-1, j, str);
			}
			if(j-arr[i-1]>=0 && bn[i-1][j-arr[i-1]]==true){
				printpath(bn, arr, i-1, j-arr[i-1], str +" "+ arr[i-1]);
			}
			
		
			
	}

}
