package jan05;

public class QueenOfChessProactive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlaceQueens(new boolean[4][4], 0, "", 0);

	}

	public static int count = 0;

	public static void PlaceQueens(boolean[][] chess, int queenNo, String path, int LastQueenPlaced) {

		if (queenNo == chess.length) {
			if (IsTheBoaradSafe(chess) == true) {
				System.out.println((++count) + " " + path);

			}
			return;

		}

		for (int i = LastQueenPlaced; i < chess.length * chess.length; i++) {
			int row = i / chess.length;
			int col = i % chess.length;

			if (chess[row][col] == false) {
				chess[row][col] = true;
				PlaceQueens(chess, queenNo + 1, path + "q" + (queenNo + 1) + "-b" + i+" ", i + 1);
				chess[row][col] = false;
			}
		}
	}

	public static boolean IsTheBoaradSafe(boolean[][] chess) {
		for (int r = 0; r < chess.length; r++) {
			for (int c = 0; c < chess.length; c++) {
				if (chess[r][c] == true && IsTheQueenSafe(chess, r, c) != true) {
					return false;
				}

			}
		}
		return true;
	}

	public static boolean IsTheQueenSafe(boolean[][] chess, int r, int c) {
		int[][] dim = { { 0, 1 }, 
						{ 1, 1 },
						{ 1, 0 },
						{ 0, -1 },
						{ -1, 0 },
						{ -1, -1 },
						{ -1, 1 }, 				
						{ 1, -1 } };

		for (int dis = 1; dis < chess.length; dis++) {
			for (int[] dimentions : dim) {
				int rowdelta = dimentions[0];
				int coldelta = dimentions[1];
				int newrow = r + dis * rowdelta;
				int newcol = c + dis * coldelta;
				if (newrow < chess.length && newrow >= 0 && newcol >= 0 && newcol < chess.length) {
					if (chess[newrow][newcol] == true)
						return false;
				}

			}
		}
		return true;
	}
}