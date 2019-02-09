package feb02;

public class LongestSubsequenceSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,22,9,33,21,50,41,60,80,1};
		int[] store=new int[arr.length];
		LongestSubset(arr,store);
	}
	public static void LongestSubset(int[] arr,int[] store ){
		
		store[0]=1;
		int k=1;
		for(int i=0;i<arr.length;i++){
			store[i]=1;
			for(int j=0;j<i;j++){
				if(arr[i]>=arr[j])
				{
					store[i]=Math.max(store[i], store[j]+1);
					
				}
			}
			
		}
		for(int val:store)
		{
			System.out.print(val+" ");
		}
		int max=0;
		for(int i=0;i<store.length;i++)
		{
			max=Math.max(max,store[i]);
		}
		System.out.println("  Max:: "+max);
		LongestSubsequence(max,arr,store,pos);
		
	}
	public static void LongestSubsequence(int max,int[] arr,int[] store,int pos){
		
		LongestSubsequence(max-1, arr, store, pos);
	}
	
	

}
