package page5;

import java.util.Scanner;

public class MatricesMulplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int[][] mat =new int[n1][n2];
		int[][] mat1=new int[n1][n2];
		int[][] mat2=new int[n1][n2];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
			mat[i][j]=scn.nextInt();
			}
		}
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
			mat1[i][j]=scn.nextInt();
			}
			
		}
		for(int k=0;k<mat.length;k++){
		for(int i=0;i<mat.length;i++)
		{
			
		int ans=0;
			for(int j=0;j<mat[0].length;j++)
			{
				ans=ans+mat[k][j]*mat1[j][i];
			}
			
				mat2[i][k]=ans;

			
			
		}
		}
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
			System.out.print(mat2[i][j]+" ");
			}
			System.out.println("");
			
		}
	}

}
