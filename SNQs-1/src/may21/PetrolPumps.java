package may21;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class PetrolPumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] o={6,4,8,2,3,3,1,7,2};
		int[] d={5,5,2,4,4,6,2,7,1};
		int s=0;
		int start=0,end=0;
		while(true){
			
			if(s+o[end]>=d[end]){
				
				s=s+o[end]-d[end];
				end=(end+1)%o.length;
				if(start==end){
					//finish
					System.out.println("start point "+ start);
					break;
				}

			}
			else{
				if(end<start){
					System.out.println("No Solution");
					break;
				}
				s=0;
				start=end+1;
				end=end+1;
				
			}
			
						
		}
	}

}
