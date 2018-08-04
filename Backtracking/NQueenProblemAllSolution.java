package Backtracking;

public class NQueenProblemAllSolution {
	static boolean solveNQueenProblem(int board[][],int i,int n) {
		if(i==n) {
			printSolution(board, n);
			System.out.println();
			return false;
		}
		for(int j=0;j<n;j++) {
			if(isSafe(board, i, j, n)) {
				board[i][j]=1; 
				boolean nextMove=solveNQueenProblem(board, i+1, n);
				if(nextMove) {
					return true;
				}
				board[i][j]=0;
			}
		}
		// tried for all position in current row but could not place a queen
		return false;
	}
	
	
	static boolean isSafe(int board[][],int i,int j,int n) {
		//Check for column
		for(int row=0;row<i;row++) {
			if(board[row][j]==1)return false;
		}
		//Check for left diagnol
		int x=i,y=j;
		while(x>=0 && y>=0) {
			if(board[x][y]==1) return false;
			x--;
			y--;
		}
		//Check for right diagnol
		x=i;
		y=j;
		while(x>=0 && y<n) {
			if(board[x][y]==1) return false;
			x--;
			y++;
		}
		return true;
	}
	
	public static void printSolution(int board[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1)System.out.print("Q");
				else System.out.print("_");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int board[][]=new int[10][10];
		int n=4;
		solveNQueenProblem(board, 0, n);
	}
	
}
