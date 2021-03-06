package feb09;

public class BagWeightPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] wts={2,5,1,3,4};
	int[] prices={15,14,10,45,30};
	int tar=7;
	ZeroOneNapsack(wts, prices, tar);
	unboundedNapSack(wts, prices, tar);
	}
	public static void ZeroOneNapsack(int[] wts,int[] prices,int tar){
		int[][] bn=new int[wts.length+1][tar+1];
		
		for(int i=1;i<wts.length+1;i++){
			
			for(int j=0;j<tar+1;j++){
				if(j-wts[i-1]>=0 && bn[i-1][j-wts[i-1]]+prices[i-1]>bn[i-1][j]){
					bn[i][j]=prices[i-1]+bn[i-1][j-wts[i-1]];
				}
				else{
					bn[i][j]=bn[i-1][j];
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
	}
	
	public static void unboundedNapSack(int[] wts,int[] prices,int tar){
		int[] bn=new int[tar+1];
		bn[0]=0;
		for(int i=1;i<bn.length;i++){      //for storage
			for(int j=0;j<wts.length;j++){      //to check every column for value in wts
				if(i-wts[j]>=0){                 //condition of check
					if(prices[j]+bn[i-wts[j]]>bn[i])
						bn[i]=prices[j]+bn[i-wts[j]];
				}
				
			}
			
		}
		for(int val:bn){
			System.out.print(val+"  ");	
		}
		
	
	}

}
