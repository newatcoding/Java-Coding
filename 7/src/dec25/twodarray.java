package dec25;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 } };
		int r = 0;
		int c = 0;
		int ans = 0;
		while (r >= 0 && r < mat.length && c >= 0 && c < mat[0].length) {
			ans = ans + mat[r][c];
			ans = ans % 4;
			if (ans == 0) {
				c++;
			} else if (ans == 1) {
				r++;
			} else if (ans == 2) {
				c--;
			} else if (ans == 3) {
				r--;
			}
			// System.out.println(r+" "+c);
		}
		if (r < 0) {
			r++;
		}
		if (r == mat.length) {
			r--;
		}
		if (c < 0) {
			c++;
		}
		if (c == mat[0].length) {
			c--;
		}
		System.out.println(r + "," + c);
	}

}
