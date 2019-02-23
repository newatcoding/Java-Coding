package feb23;

public class SparseTable {

	static int[][] strg;
	public static void preprocess(int[] arr){
		int log=getlogfloor(arr.length);
		 strg=new int [arr.length][log+1];
		for(int i=0;i<strg.length;i++){
			strg[i][0]=arr[i];
		}
		for(int j=1;j<strg[0].length;j++){
			for(int i=0;i<=strg.length-(1<<log);i++){
				int f1=strg[i][j-1];              //cell on the left of the main cell which stores the min value from range i to b;  
				int f2=strg[i+(1<<(j-1))][j-1];  //same as above   from b to end point of that strg pos
				strg[i][j]=Math.min(f1,f2);                            //to check the min between i to 2 rasied to power j in the array
			}
		}
	}
	
	public static int getlogfloor(int n){    //this whole code is to find the power of 2 for which the while condition is true
		int log=0;
		while((1<<log)<=n){
			log++;
		}
		return log-1;
	}
	public static int queries(int l,int r){
		int c=r-l+1;
		int log=getlogfloor(c);
		int f1=strg[l][log];                //for finding the min between those limits whose difference is not power of 2 .
		int f2=strg[r-(1<<log)+1][log];     //to solve we find a power of  2 nearest to the difference & chcek min between l to log 
		return Math.min(f1, f2);              // rest you see
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[15];
		arr[0]=-5;		arr[1]=5;
		arr[2]=4;		arr[3]=1;
		arr[4]=7;		arr[5]=11;
		arr[6]=12;		arr[7]=14;
		arr[8]=6;		arr[9]=9;
		arr[10]=10;		arr[11]=1;
		arr[12]=7;		arr[13]=9;
		arr[14]=2;
		preprocess(arr);
		System.out.println(queries(0, 9));
		System.out.println(queries(5, 14));
		
	}

}
