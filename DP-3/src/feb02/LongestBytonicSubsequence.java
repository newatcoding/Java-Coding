package feb02;

public class LongestBytonicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,22,9,33,21,50,41,60,80,1};
		LBS(arr);
	}
	public static void LBS(int[] arr){
		int[] strg=new int[arr.length];
		int[] m1=LIS(arr);
		int[] m2=LDS(arr);
		
		for(int i=0;i<m1.length;i++)
		{
			strg[i]=m1[i]+m2[i]-1;
		}
		int max=0;
		for(int j=0;j<strg.length;j++){
			max=Math.max(max, strg[j]);
		}
		System.out.println(max);
		
	}
	public static int[] LIS(int[] arr ){
		int[] store=new int[arr.length];
		store[0]=1;
		
		for(int i=0;i<arr.length;i++){
			store[i]=1;
			for(int j=0;j<i;j++){
				if(arr[i]>=arr[j])
				{
					store[i]=Math.max(store[i], store[j]+1);
					
				}
			}
			
		}
		int max=0;
		for(int i1=0;i1<store.length;i1++)
		{
			max=Math.max(max,store[i1]);
		}
		return store;
	}
	//longest decreasing subsequence
	public static int[] LDS(int[] arr){
		int[] store=new int[arr.length];
		store[arr.length-1]=1;
		
		for(int i=arr.length-2;i>=0;i--){
			store[i]=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j])
				{
					store[i]=Math.max(store[i], store[j]+1);
					
				}
			}
			
		}
//		for(int val:store)
//		{
//			System.out.print(val+" ");
//		}
		int max=0;
		for(int i1=0;i1<store.length;i1++)
		{
			max=Math.max(max,store[i1]);
		}
		return store;
	}
		

}
