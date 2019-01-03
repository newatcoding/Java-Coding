package jan02;

public class optionforboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenCombinationSS(4,0,0,2,"");
	}
	public static void QueenCombinationSS(int TotalBoxes, int boxNo, int qno, int queens,String path)
	{
		if(qno==queens)
		{
			System.out.println(path);
			return;
		}
		if(boxNo==TotalBoxes)
		{
			return;
		}
		QueenCombinationSS(TotalBoxes,boxNo+1 ,qno+1,queens,path+(" q"+qno+" b"+boxNo));
		QueenCombinationSS(TotalBoxes,boxNo+1 ,qno,queens,path);
		
	}

}
