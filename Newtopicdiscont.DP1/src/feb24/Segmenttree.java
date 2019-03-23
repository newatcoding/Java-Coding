package feb24;

public class Segmenttree {

	static int[] sta;
	static int[] oba;
	private static void preprocess(int[] ba){
		oba=ba;
		int ht=getlog(ba.length);
		int sl=(1<<(ht+1))-1;
		sta=new int[sl];
		build(0,0,ba.length-1);
		
		
	}
	private static int getlog(int n){
		int log=0;
		while((1<<log)<n){
			log++;
		}
		return log;
	}
	private static void build(int si,int ss,int se){
		if(ss==se){
			sta[si]=oba[ss];
			return;
		}
		int mid=(ss+se)/2;
		build(2 * si + 1, ss, mid);
		build(2 * si + 2, mid+1, se);
		sta[si]=operation(sta[2*si+1], sta[2*si+2]);
	}
	public static void update(int idx,int nval){
		update(idx,nval,0,0,oba.length-1);
	}
	private static void update(int idx,int nval,int si,int ss,int se){
		if(ss==se){  //if we use ss==idx then it won't work every time use eg when idx =0 it will 
			oba[ss]=nval;                   //return from first level as mid will not let it go further
			sta[si]=nval;
			return;
		}
		int mid=(ss+se)/2;
		if(idx<=mid){
		update(idx, nval, 2*si+1, ss, mid);
		}
		else{
		update(idx, nval, 2*si+2, mid+1, se);
		}
		sta[si]=operation(sta[2*si+1],sta[2*si+2]);
		
	}
	public static int query(int qs,int qe){
		return query(qs, qe,0,0,oba.length-1);
	}
	private static int query(int qs,int qe,int si,int ss,int se){
		//is the segment inside the query
		if(qs<=ss && qe>=se){
			return sta[si];
		}
		//segment and query do not overlap
		else if(se<qs || ss>qe){
			return identity();
		}
		//partial overlap or query is inside segment
		else{
			int mid=(ss+se)/2;
			int lc=query(qs, qe, 2*si+1, ss, mid);
			int rc=query(qs, qe, 2*si+2, mid+1, se);
			return operation(lc,rc);
		}
	}
	//identity(operation) used with a operand gives you no change in operand
	private static int identity(){
		//for sum identity is 0 
	//	return 0; //for sum
	//	return 1; //for product
	//	return Integer.MAX_VALUE; //to find minimum
		return Integer.MIN_VALUE;  //to find maximum
				
	}
	private static int operation(int lhs,int rhs){
		return Math.max(lhs, rhs);
//		if(rhs!=0){        //for GCD
//			return operation(lhs, lhs%rhs);
//			else{
//				return lhs;
//			}
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ba={-3,4,5,7,1,9,8,2};
		preprocess(ba);
		System.out.println(query(2,5)+" "+query(4,6));
		update(3, 17);
		System.out.println(query(2,5)+" "+query(4,6));
		
		
	}

}
