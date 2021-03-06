package feb23;

public class SortDecompositionRootN {

	static int[] sqrt;
	static int[] oa;
	static int bs;
	static int bn;
	private static void preprocess(int[] arr){
		
		bs=(int)Math.sqrt(arr.length);
		sqrt =new int[bs];
		bn=(int)Math.ceil(arr.length*1.0/bs);
		oa=arr;
		for(int i=0;i<arr.length;i++){  //sqrt array stores sum of 7 cells of array each
			int block=i/bs;
			sqrt[block]+=oa[i];
		}
	}
	private static int query(int l,int r){           
		int sum=0;
		int ls=l/bs;
		int rs=r/bs;
		if(ls==rs){                  //if both limit of oa is inside the sqrt array
			for(int i=l;i<=r;i++)
			{
				sum+=oa[i];
			}
			return sum;
		}
		//in general condition include some part of 2 sqrt and 2 complete array shown as mid
		//ls                //taking value from original arr oa
		for(int i=l; i/bs==ls;i++){
			sum+=oa[i];
		}
		//mid  //taking value from sqrt
		for(int b=ls+1;b<=rs-1;b++){ 
			sum+=sqrt[b];
		}
		//rs   //taking value from original arr
		for(int c=r;c/bs==rs;c--){
			sum+=oa[c];
		}
		return sum;
	}
	private static void update(int idx,int val){
		int pos=idx/bs;
		sqrt[pos]-=oa[idx];
		sqrt[pos]+=val;
		oa[idx]=val;
		//?
	}
	private static int querytest(int l,int r){
		int qv=0;
		for(int i=l;i<=r;i++)
		{
			qv+=oa[i];
		}
		return qv;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[49];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*10);
		}
		preprocess(arr);
		System.out.println(query(15, 38)+" "+querytest(15, 38));
		System.out.println(query(15, 19)+" "+querytest(15,19));
		System.out.println(arr[22]);
		update(22, 43);
		System.out.println(query(15, 38)+" "+querytest(15, 38));
		System.out.println(query(15, 19)+" "+querytest(15, 19));
	}

}
