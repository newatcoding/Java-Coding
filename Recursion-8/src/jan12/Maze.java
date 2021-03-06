package jan12;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// QQ:: maze is given find all pathusing which we can move from 0,0 to
		// 4,4 via path having 1 only..
		int[][] maze = { { 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 1, 1, 0, 1 },
				{ 1, 0, 0, 1, 1 } };

		printpath(maze, new boolean[5][5], 0, 0, "");
		printpath1(maze, new boolean[5][5], 0, 0, "");
	}

	// reactive approach
	public static void printpath(int[][] maze, boolean[][] visit, int sr, int sc, String path) {
		if (sr == maze.length - 1 && sc == maze[0].length-1) {
			System.out.println(path);
			return;
		}
		visit[sr][sc] = true;
		// top
		if (sr - 1 >= 0 && maze[sr - 1][sc] != 0 && visit[sr - 1][sc] == false) {
			printpath(maze, visit, sr - 1, sc, path + 'T');
		}
		// left
		if (sc - 1 >= 0 && maze[sr][sc - 1] != 0 && visit[sr][sc - 1] == false) {
			printpath(maze, visit, sr, sc - 1, path + 'L');
		}
		// down
		if (sr + 1 < maze.length && maze[sr + 1][sc] != 0 && visit[sr + 1][sc] == false) {
			printpath(maze, visit, sr + 1, sc, path + 'D');
		}
		// right
		if (sc + 1 < maze[0].length && maze[sr][sc + 1] != 0 && visit[sr][sc + 1] == false) {
			printpath(maze, visit, sr, sc + 1, path + 'R');
		}

		visit[sr][sc] = false; // to repeat above step and finding all the
								// possible values
	}

	// proactive approach
	public static void printpath1(int[][] maze, boolean[][] visit, int sr, int sc, String path) {
		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(path);
			return;
		}
		if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || visit[sr][sc] == true
				|| maze[sr][sc] == 0) {
			return;
		}
		visit[sr][sc] = true;
		printpath1(maze, visit, sr - 1, sc, path + 'T');
		printpath1(maze, visit, sr, sc - 1, path + 'L');
		printpath1(maze, visit, sr + 1, sc, path + 'D');
		printpath1(maze, visit, sr, sc + 1, path + 'R');
		visit[sr][sc] = false; // remove this line to get only one answer
	}

}
