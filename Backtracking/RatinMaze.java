package Backtracking;

public class RatinMaze {
	public static void main(String[] args) {
		int maze[][]  = { {1, 1, 0, 0},
						  {1, 1, 0, 1},
						  {0, 1, 0, 0},
						  {1, 1, 1, 1}};
		solveMazeUtil(maze, 4);
		
	}

	private static void solveMazeUtil(int[][] maze, int n) {
		int sol[][]=new int[n][n];
		mazeHelp(maze, n, sol, 0, 0);
	}
	
	public static void mazeHelp(int maze[][],int n,int solution[][],int x,int y) {
		if(x==n-1&&y==n-1) {
			solution[x][y]=1;
			printSolution(solution,n);
			return;
		}
		if(x>=n||y>=n||y<0||x<0||maze[x][y]==0||solution[x][y]==1) {
			return;
		}
		solution[x][y]=1;
		mazeHelp(maze, n, solution, x-1, y);
		mazeHelp(maze, n, solution, x+1, y);
		mazeHelp(maze, n, solution, x, y-1);
		mazeHelp(maze, n, solution, x, y+1);
		solution[x][y]=0;
	}

	private static void printSolution(int[][] solution, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(solution[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
}
