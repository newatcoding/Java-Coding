package dec30;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printstar(1,1,5);
	}
	public static void printstar(int i,int j,int max)
	{
		if(i>max)
		{
			return;
		}
		if(j>i)
		{
			System.out.println("");
			return;
		}
		System.out.print("*");
		printstar(i,j+1,max);
		printstar(i+1,1,max);
	}
}
