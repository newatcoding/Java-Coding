package jan20;

public class fibonachii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		int c=fib1(10);
		long stop1=System.currentTimeMillis();
		System.out.println(c+"   "+(start-stop1));
		int[] arr=new int[11];
		long start1=System.currentTimeMillis();
		int d=FibImproved(10,arr);
		long stop2=System.currentTimeMillis();
		System.out.println(d+"   "+(start1-stop2));
		
	}
	//problem with the code :: same value calculated multiple times ,, time taken high......memoization
	public static int fib1(int n){
		if(n==0 || n==1)
		{
			return n;
			
		}
		int fibone=fib1(n-1);
		int fibtwo=fib1(n-2);
		int fn=fibone+fibtwo;
		return fn;
	}
	public static int FibImproved(int n,int[] box){
		
		if(n==0 || n==1)
		{
			return n;
			
		}
		if(box[n]!=0)
		{
			return box[n];
		}
		int fibone=FibImproved(n-1,box);
		int fibtwo=FibImproved(n-2,box);
		int fn=fibone+fibtwo;
		box[n]=fn;
		return fn;
	}

}
