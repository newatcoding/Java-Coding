package feb02;

public class RodSelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q:: Rod of length 8 ,every different length piece has different price find way to cut the rod for maximum profit
//use stair or ladder recursion hint	
		int[] arr={0,3,5,6,15,10,25,12,24};
	RodSelling(arr);
	}
	public static void RodSelling(int[] arr){
		int[] strg=new int[arr.length];
		strg[0]=0;
		strg[1]=arr[1];
		for(int i=2;i<arr.length;i++){
			strg[i]=arr[i];
			for(int left=1 , right=i-left; left<=right ; left++ ,right-- ){   //for(int j=0;j<i;j++){
			strg[i]=Math.max(strg[i],strg[left]+strg[right]);				  // strg[i]=Math.max(strg[i],strg[j]+arr[i-j])	
			}
			  
		}
	}
	
}
