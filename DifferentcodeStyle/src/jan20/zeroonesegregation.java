package jan20;

public class zeroonesegregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,0,1,1,1,0,0,1,1,0,1,0,1};
//		int[] arr={0,1,1,0};
		int[] arr1={0,2,2,0,1,0,2,1,0,2,1};
//		int[] arr1={0,2,2,0};
		Segrigatezeroandone(arr);
		Segrigatezeroneandtwo(arr1);
	}
	public static void Segrigatezeroandone(int[] arr){
		int i=0; int j=0;
		//0's -> o to i-1
		//1's -> i to j-1
		//unknown -> j to end
	while(i<arr.length)
	{
		if(arr[i]==0)
		{
			swap(i,j,arr);
			i++;
			j++;
		}
		else if(arr[i]==1)
		{
			i++;
		}
	}
	printanswer(arr);
	System.out.println(" ");
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
	public static void Segrigatezeroneandtwo(int[] arr){
		int i=0; int j=0;	 int k=0;
		//0's -> o to i-1
		//1's -> i to j-1
		//2's -> j to k-1
		//unknown -> k to end
		while(k<arr.length)
		{
			if(arr[k]==0)
			{
				swap(k,j,arr);
				k++;              //after 1st swap only number of unknown decreases ,j++ cannot be done here
				swap(j,i,arr);		//because j doesn't have 1 so that one's can shift .
				i++;
				j++;
				
			}
			else if(arr[k]==1)
			{
				swap(j,k,arr);
				j++;
				k++;
			}
			else if(arr[k]==2)
			{
				k++;
			}
		}
		printanswer(arr);
	}
	
}
