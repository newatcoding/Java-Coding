package dec25;

public class zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[4][4];
		int r=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				while(i+j==r)
				{
					arr[i][j]=r+1;
				}
				
			} r++;
		
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
