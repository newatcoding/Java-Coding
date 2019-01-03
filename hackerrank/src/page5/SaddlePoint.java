package page5;

import java.util.Scanner;

public class SaddlePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int[][] mat =new int[n1][n2];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
			mat[i][j]=scn.nextInt();
			}
		}
		SaddlePoint(mat);
	}
	public static void SaddlePoint(int[][] mat)
	{
		int c=mat[0][0];
		int d=0;
		int e=0;
		for(int i=0;i<mat.length;i++)
		{
		for(int j=0;j<mat[0].length-1;j++)
		{
			if(mat[i][j]<mat[i][j+1])
			{
				c=mat[i][j+1];
				e=j+1;
			}
			else
			{
				c=mat[i][j];
				e=j;
			}
			
		}
		d=c;
		for(int z=0;z<mat.length;z++)
		{
			if(d<mat[z+1][e])
			{
				d=mat[z+1][e];
			}
			else
			{
				d=mat[z][e];
			}
		}
		System.out.println(d);
				}
	
	}
}
