package jan12;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
				{ 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
				{ 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 7, 4 },
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Sudokuprint(mat);
		Sudokualgo(mat, 0);
	}

	public static void Sudokuprint(int[][] mat) {
		// System.out.println(mat.length+" "+mat[0].length);
		System.out.println("- - - - - - - - - - -");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 0) {
					System.out.print("_ ");
				} else if (mat[i][j] > 0) {
					System.out.print(mat[i][j] + " ");
				}
				if (j == 2 || j == 5) {
					System.out.print("|");
				}

			}
			System.out.println("|");
			if (i == 2 || i == 5) {
				System.out.println("- - - - - - - - - - -");
			}
		}
		System.out.println("- - - - - - - - - - -");
		
	}

	public static void Sudokualgo(int[][] mat, int lastusedbox) {
		if (lastusedbox == mat.length * mat.length) {
			printmatrix(mat);
			return;
		}

		int r = lastusedbox / mat.length;
		int c = lastusedbox % mat.length;
		if (mat[r][c] == 0) {
			for (int i = 1; i <=9; i++) {
				if (IfAllowed(mat, r, c, i)) {
					mat[r][c] = i;
					Sudokualgo(mat, lastusedbox + 1);
					mat[r][c] = 0;
				}
			}

		} else {
			Sudokualgo(mat, lastusedbox + 1);
		}
	}

	public static boolean IfAllowed(int[][] mat, int r, int c, int num) {
		
		for (int i = 0; i < mat.length; i++) {
			//row check
			if (mat[r][i] == num) {
				return false;
			}
			//col check
			if (mat[i][c] == num) {
				return false;
			}
		}
		r = r / 3;
		r = r * 3;
		c = c / 3;
		c = c * 3;
		//sub matrix check
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (mat[i][j] == num) {
					return false;
				}
			}
		}
		return true;

	}

	public static void printmatrix(int[][] mat) {
		System.out.println("- - - - - - - - - - -");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
				if (j == 2 || j == 5) {
					System.out.print("|");
				}
			}
			System.out.println("|");
			if (i == 2 || i == 5) {
				System.out.println("- - - - - - - - - - -");
			}
		}
		System.out.println("- - - - - - - - - - -");
	}
}
