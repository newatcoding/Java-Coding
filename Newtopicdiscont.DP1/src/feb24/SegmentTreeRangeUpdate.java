package feb24;

import java.util.logging.Handler;

public class SegmentTreeRangeUpdate {

	
		static int[] sta;
		static int[] oba;
		static int[] lazy;
		private static void preprocess(int[] ba){
			oba=ba;
			int ht=getlog(ba.length);
			int sl=(1<<(ht+1))-1;
			sta=new int[sl];
			lazy=new int[sl];
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
		public static void update(int qs,int qe,int delta){
			update(qs, qe,delta,0,0,oba.length-1);
		}
		private static void update(int qs,int qe,int delta,int si,int ss,int se){
			handlependingupdate(si, ss, se);
			//is the segment inside the query
			if(qs<=ss && qe>=se){
				lazy[si]=delta;
				handlependingupdate(si, ss, se);
				return;
			}
			//segment and query do not overlap
			else if(se<qs || ss>qe){
				return;
			}
			//partial overlap or query is inside segment
			else{
				int mid=(ss+se)/2;
				update(qs, qe,delta, 2*si+1, ss, mid);
				update(qs, qe,delta, 2*si+2, mid+1, se);
				return ;
			}
		}
		
		public static int query(int qs,int qe){
			return query(qs, qe,0,0,oba.length-1);
		}
		private static int query(int qs,int qe,int si,int ss,int se){
			handlependingupdate(si, ss, se);
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
		private static void handlependingupdate(int  si,int ss,int se){
			sta[si]+=(se-ss+1)*lazy[si];
			if(ss!=se){
				lazy[2*si+1]+=lazy[si];
				lazy[2*si+2]+=lazy[si];
			}
			lazy[si]=0;
		}
		//identity(operation) used with a operand gives you no change in operand
		private static int identity(){
		//	for sum identity is 0 
			return 0; //for sum
		//	return 1; //for product
		//	return Integer.MAX_VALUE; //to find minimum
		//	return Integer.MIN_VALUE;  //to find maximum
					
		}
		private static int operation(int lhs,int rhs){
		//	return Math.max(lhs, rhs);
			return lhs+rhs;
//			if(rhs!=0){        //for GCD
//				return operation(lhs, lhs%rhs);
//				else{
//					return lhs;
//				}
//			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] ba={-3,4,5,7,60,450,30};
			preprocess(ba);
			System.out.println(query(2,5)+" "+query(4,6));
			update(0,7,2);
			update(2,5,1);
			System.out.println(query(2,5)+" "+query(4,6));
			
			
		}

	}
