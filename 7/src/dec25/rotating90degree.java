package dec25;

public class rotating90degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		int temp;
		for(int i=0;i<3;i++)
		{ 
			
			for(int j=i;j<3;j++)
			{
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
				
			}
			
		}

		for(int i=0;i<3/2;i++)
		{ 
			
			for(int j=0;j<3;j++)
			{
				temp=arr[i][j];
				arr[i][j]=arr[2-i][j];
				arr[2-i][j]=temp;
				
			}
			
		}
			for(int i=0;i<3;i++)
			{ 
				
				for(int j=0;j<3;j++)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println(" ");
			}

	}

}
