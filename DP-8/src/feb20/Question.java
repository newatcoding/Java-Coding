package feb20;

import java.util.ArrayList;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QQ:: 3 people 100 caps no repeatation 
		int p=3;
		int caps=20;
		ArrayList<Integer>[] pcmap=new ArrayList[p];
		pcmap[0]=new ArrayList<>();
		pcmap[1]=new ArrayList<>();
		pcmap[2]=new ArrayList<>();
		
		pcmap[0].add(2);
		pcmap[0].add(5);
		pcmap[0].add(7);
		
		pcmap[1].add(5);
		pcmap[1].add(7);
		
		pcmap[2].add(19);
		pcmap[2].add(2);
		boolean[] bn=new boolean[caps];
		int[][] dp=new int[p][1<<caps];
		System.out.println(countWays(pcmap, 0, bn));
		System.out.println(countWaysBM(pcmap, 0, 0,dp));  //only possible till 32 caps because 1 int has 32 bit
		}
		public static int countWays(ArrayList<Integer>[] pcmap,int p, boolean[] capsTaken){
			if(p==pcmap.length){
				return 1;
			}
			int myresult=0;
		for(int cap:pcmap[p]){
		if(capsTaken[cap]==false){
			capsTaken[cap]=true;
			int rresult=countWays(pcmap, p+1, capsTaken);
			myresult+=rresult;
			capsTaken[cap]=false;
		}
		}
			return myresult;
		}
		//dp is used to save time ..at one moment same question was asked for same ans store every value in dp and check if ques already asked leave it
		//using bit manipulation but only error is that applicable only for max to max 32 caps.
		public static int countWaysBM(ArrayList<Integer>[] pcmap,int p,int ctmask ,int[][] dp){
			if(p==pcmap.length){
				return 1;
			}
			if(dp[p][ctmask]!=0){
				return dp[p][ctmask];
			}
			int myresult=0;
		for(int cap:pcmap[p]){
		if((ctmask & (1<< cap))==0){
			ctmask=ctmask ^ (1<<cap);
			int rresult=countWaysBM(pcmap, p+1, ctmask,dp);
			myresult+=rresult;
			ctmask=ctmask ^ (1<<cap);
			
		}
		}
		dp[p][ctmask]=myresult;
		return myresult;

	}
		//using subsequence for combination  now for level we have caps and choice is on person.

}