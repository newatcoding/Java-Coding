package jan02;

public class QueenPermutaion {

	public QueenPermutaion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenPermutation(new boolean[4], 0, 2, "");
		QueenCombination(new boolean[4], 0, 2, "", 0);
		queenPermutationBM(0 ,4,0,2,"");
	}

	public static void QueenPermutation(boolean[] boxes, int qno, int queens, String asf) {
		if (qno == queens) {
			System.out.print(asf + " ::: ");
			return;
		}
		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;

				QueenPermutation(boxes, qno + 1, queens, asf + " " + qno + "b " + i);
				boxes[i] = false;
			}
		}
		System.out.println("");
	}

	public static void QueenCombination(boolean[] boxes, int qno, int queens, String asf, int queenplacedinbox) {
		if (qno == queens) {
			System.out.print(asf + " ::: ");
			return;
		}
		for (int i = queenplacedinbox; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;

				QueenCombination(boxes, qno + 1, queens, asf + " " + qno + "b " + i, i + 1);
				boxes[i] = false;
			}
		}
	}
	public static void queenPermutationBM(int bit,int boxes,int qno,int queens,String path)
	{
		if (qno == queens) {
			System.out.print(path+" ::: ");
			return;
		}
		for (int i = 0; i < boxes; i++) {
			int bm=1<<i; 
			//check bit is off
			if((bit&bm)==0)
			{
				bit=bit| bm;
				queenPermutationBM(bit, boxes,qno+1,queens,path+"q"+(qno+1)+"-b"+i);
				bit=bit & ~bm;
			}
		}	
			
	}
}
