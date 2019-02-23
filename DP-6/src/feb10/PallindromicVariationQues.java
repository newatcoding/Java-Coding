package feb10;

public final class PallindromicVariationQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//via GAP  method
		Lpsq("abcckybc");
		Cpsq("abca");
		LpsqBoolean("abccbc");
		Mpc("abccbc");
		
	}
	//Longest pallindrome subsequence
	public static void Lpsq(String str){
		int[][] strg=new int[str.length()][str.length()];
		for(int gap=0; gap<str.length();gap++){
			for(int i=0 , j=i+gap; j<str.length();  i++ , j++){
				if(gap==0)
				{
					strg[i][j]=1;
				}
				else if(gap==1){
				if(str.charAt(i)==str.charAt(j)){
					strg[i][j]=2;
				}
				else
				{
					strg[i][j]=1;
				}
				}
				else{
					if(str.charAt(i)==str.charAt(j)){
						strg[i][j]=strg[i+1][j-1]+2;
					}
					else
					{
						strg[i][j]=Math.max(strg[i+1][j],strg[i][j-1]);
					}
				}
			}
		}
		
		for(int k=0;k<str.length();k++){
			for(int l=0;l<str.length();l++){
				System.out.print(strg[k][l]+" ");
			}
			System.out.println(" ");
		}
		
	}
    //Count pallndromic subsequence
	public static void Cpsq(String str){
		int[][] strg=new int[str.length()][str.length()];
		for(int gap=0; gap<str.length();gap++){
			for(int i=0 , j=i+gap; j<str.length();  i++ , j++){
				if(gap==0)
				{
					strg[i][j]=1;
				}
				else if(gap==1){
				if(str.charAt(i)==str.charAt(j)){
					strg[i][j]=3;
				}
				else
				{
					strg[i][j]=2;
				}
				}
				else{
					if(str.charAt(i)==str.charAt(j)){
						strg[i][j]=strg[i+1][j]+strg[i][j-1]+1;
					}
					else
					{
						strg[i][j]=strg[i+1][j]+strg[i][j-1]-strg[i+1][j-1];
					}
				}
			}
		}
		
		for(int k=0;k<str.length();k++){
			for(int l=0;l<str.length();l++){
				System.out.print(strg[k][l]+" ");
			}
			System.out.println(" ");
		}
		
	}
	//Lpsq & Cpsq  using boolean storage
	public static void LpsqBoolean(String str){
		boolean[][] br=new boolean[str.length()][str.length()];
		int count=0;
		int longest=0;
		for(int gap=0; gap<str.length();gap++){
			for(int i=0 , j=i+gap; j<str.length();  i++ , j++){
				if(gap==0){
					br[i][j]=true;
				}
				else if(gap==1){
					br[i][j]=str.charAt(j)==str.charAt(i);
				}
				else
				{

						br[i][j]=str.charAt(j)==str.charAt(i) && br[i+1][j-1]==true;
						
				}
				if(br[i][j]==true)
				{
					count++;
					longest=gap+1;
				}
			}
			
		}
		System.out.println(count+" "+ longest);
	}
   //minimum pallindromic cut
	public static void Mpc(String str){
		int[][] br=new int[str.length()][str.length()];
		int count=0;
		int longest=0;
		for(int gap=0; gap<str.length();gap++){
			for(int i=0 , j=i+gap; j<str.length();  i++ , j++){
				if(gap==0){
					br[i][j]=0;
				}
				else if(gap==1){
					br[i][j]=str.charAt(j)==str.charAt(i)?0:1;
				}
				else
				{
					if(str.charAt(i)==str.charAt(j) && br[i+1][j-1]==0){
						br[i][j]=0;
					}
					else
					{
						br[i][j]=Integer.MAX_VALUE;
						for(int c=1;c<=gap;c++){
							int lp=br[i][i+c-1];
							int rp=br[i+c][j];
							br[i][j]=Math.max(br[i][j],lp+rp+1);
						}
						
					}
						
						
				}
				
			}
			
			}
			
		
		
	}
}
