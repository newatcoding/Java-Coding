package page5;

import java.util.Scanner;

public class TracesOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int[][] mat =new int[n1][n2];
		int[][] mat1=new int[n1][n2];
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
		int sum=0;
		for(int i=0;i<mat.length;i++)
		{
			sum=sum+mat[i][i]+mat1[i][i];
		}
		System.out.println(sum);
	}

}
