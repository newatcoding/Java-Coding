package jan23;

public class Tabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibTabulation(7);
		climbStairs(7);
		FindPath(3, 4);
		int[][] arr={
				{2,3,6,8,1},
				{7,9,4,0,4},
				{4,5,9,3,7},
				{},
				{},
				{},
				{}
		};
		}
	
	public static void FibTabulation(int n){
	int[] f=new int[n+1];
	f[0]=0;
	f[1]=1;
		for(int i=2;i<=n;i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
		System.out.println(f[n]);
	}
	public static void  climbStairs(int n){
		int[] f=new int[n+1];
		f[0]=1;
		for(int x=1;x<=n;x++)
		{
			if(x>=1)
				f[x]+=f[x-1];
			if(x>=2)
				f[x]+=f[x-2];
			if(x>=3)
				f[x]+=f[x-3];
		}
		System.out.println(f[n]);
	//	return f[n];
		
	}
	public static void FindPath(int r,int c){
		int[][] path=new int[r+1][c+1];
		
		for(int i=path.length-1;i>=0;i--)
		{
			for(int j=path[0].length-1;j>=0;j--)
			{
				if(i==path.length-1 && j==path[0].length-1)
					path[i][j]=1;
				else if(i==path.length-1)
					path[i][j]=path[i][j+1];
				else if(j==path[0].length-1)
					path[i][j]=path[i+1][j];
				else
					path[i][j]=path[i+1][j]+path[i][j+1];
			}
			
		}
		System.out.println(path[0][0]);
		
	}
	//on basis of storage not cost 
	//print path[0][0] to find sum
	//return path array to find path string or way  using recursion on the returned array 
	public static void FindPathMin(int[][] arr ){
	int[][] path=new int[r+1][c+1];
		
		for(int i=path.length-1;i>=0;i--)
		{
			for(int j=path[0].length-1;j>=0;j--)
			{
				if(i==path.length-1 && j==path[0].length-1)
					path[i][j]=arr[i][j];
				else if(i==path.length-1)
					path[i][j]=arr[i][j]+path[i][j+1];
				else if(j==path[0].length-1)
					path[i][j]=arr[i][j]+path[i+1][j];
				else
					path[i][j]=arr[i][j]+Math.min(path[i+1][j],path[i][j+1]);
			}
			
		}
		System.out.println(path[0][0]);
	}

}
