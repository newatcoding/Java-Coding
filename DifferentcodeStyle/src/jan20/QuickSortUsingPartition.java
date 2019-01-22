package jan20;

public class QuickSortUsingPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,9,8,6,11,21};
		quicksort(arr, 0, arr.length-1);
		printanswer(arr);
	}
	public static void quicksort(int[] arr,int lo,int hi){
		if(lo>=hi)
		{
			return;
		}
		int idx=partitioning(arr,lo,hi,arr[hi]);
				quicksort(arr,lo,idx-1);
				quicksort(arr, idx+1, hi);
				
	}
	public static int partitioning(int[] arr,int lo,int hi,int pivot){
		int i=lo; int j=lo;
	
		while(i<=hi)
		{
			if(arr[i]>pivot)
			{
				i++;
			}
			else
			{
				swap(i,j,arr);
				i++;
				j++;
			}
		}
		return j-1;

	}
		public static void swap(int i,int j,int[] arr){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		public static void  printanswer(int[] arr){
			for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+" ");
			}
		
	}
}
