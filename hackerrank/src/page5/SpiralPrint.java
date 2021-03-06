package page5;

import java.util.Scanner;

public class SpiralPrint {

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
		int tne = mat.length * mat[0].length;
		int cnt = 1;
		int rmin = 0;
		int rmax = mat.length - 1;
		int cmin = 0;
		int cmax = mat[0].length - 1;

		while (cnt <= tne) {

			// left wall
			for (int r = rmin; r <= rmax && cnt <= tne; r++) {
				System.out.print(mat[r][cmin] + " ");
				cnt++;
			}
			cmin++;

			// bottom wall
			for (int c = cmin; c <= cmax && cnt <= tne; c++) {
				System.out.print(mat[rmax][c] + " ");
				cnt++;
			}
//			System.out.println();
			rmax--;

			// right wall
			for (int r = rmax; r >= rmin && cnt <= tne; r--) {
				System.out.print(mat[r][cmax] + " ");
				cnt++;
			}
			cmax--;

			// top wall
			for (int c = cmax; c >= cmin && cnt <= tne; c--) {
				System.out.print(mat[rmin][c] + " ");
				cnt++;
			}
			rmin++;
		}
	}



}