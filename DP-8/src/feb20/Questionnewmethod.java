package feb20;

import java.util.ArrayList;

public class Questionnewmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int caps=100;
		int person=10;
		
		ArrayList<Integer>[] pcmap=new ArrayList[person];
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
		ArrayList<Integer>[] cpmap=new ArrayList[caps];
				for(int i=0;i<cpmap.length;i++){
					cpmap[i]=new ArrayList<>();
					
				}
				for(int p=0;p<pcmap.length;p++){
					for(int pcap:pcmap[p]){
						cpmap[pcap].add(p);
					}
				}
				int[][] dp=new int [caps][1<<person];	
			System.out.println(countWaysBM(cpmap, 0,0, dp, person));
	}
	public static int countWaysBM(ArrayList<Integer>[] cpmap,int c,int ptmask ,int[][] dp,int tp){
		if(ptmask==(1<<tp)-1){
			return 1;
		}
		if(c==cpmap.length){
			return 0;   //when cap is gone
		}
		if(dp[c][ptmask]!=0){
			return dp[c][ptmask];
		}
		int myresult=countWaysBM(cpmap, c+1, ptmask, dp, tp);
	for(int person:cpmap[c]){
	if((ptmask & (1<< person))==0){
		ptmask=ptmask ^ (1<<person);
		int rresult=countWaysBM(cpmap, c+1, ptmask,dp,tp);
		myresult+=rresult;
		ptmask=ptmask ^ (1<<person);
		
	}
	}
	dp[c][ptmask]=myresult;
	return myresult;

}

}
