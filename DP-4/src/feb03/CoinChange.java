package feb03;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={2,3,5};
		viapermutation(7,coins);
	}
	public static void viapermutation(int sum,int[] coins){
		int[] strg=new int[sum+1];
		strg[0]=1;
		for(int i=1;i<strg.length;i++){
			for(int j=0;j<coins.length;j++){
				if(i-coins[j]>=0){
					strg[i]+=strg[i-coins[j]];
				}
			}
			
		}
		System.out.println(strg[sum]);
		
	}
	
	public static void viavombination(int sum){
		int[] strg=new int[sum+1];
	}

}
