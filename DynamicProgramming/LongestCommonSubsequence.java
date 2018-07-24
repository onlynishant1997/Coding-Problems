package DynamicProgramming;

public class LongestCommonSubsequence {
	public static int recursiveLCS(char[] x,char []y,int m,int n) {
		if(m==0 || n==0)return 0;
		if(x[m-1]==y[n-1])return 1+recursiveLCS(x, y, m-1, n-1);
		else return Math.max(recursiveLCS(x, y, m, n-1),recursiveLCS(x, y, m-1, n));
	}
	public static int nonRecursiveLCS(char[] x,char []y,int m,int n) {
		int L[][]=new int[m+1][n+1];
		for (int i=0; i<=m; i++)
	    {
	      for (int j=0; j<=n; j++)
	      {
	        if (i == 0 || j == 0)
	            L[i][j] = 0;
	        else if (x[i-1] == y[j-1])
	            L[i][j] = L[i-1][j-1] + 1;
	        else
	            L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
	      }
	    }
		return L[m][n];
	}
	public static int printingLCS(char[] x,char []y,int m,int n) {
		int L[][]=new int[m+1][n+1];
		for (int i=0; i<=m; i++)
	    {
	      for (int j=0; j<=n; j++)
	      {
	        if (i == 0 || j == 0)
	            L[i][j] = 0;
	        else if (x[i-1] == y[j-1])
	            L[i][j] = L[i-1][j-1] + 1;
	        else
	            L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
	      }
	    }
		int index=L[m][n];
		char lcs[]=new char[index];
		int i=m-1,j=n-1;
		while(i>=0 && j>=0) {
			if(x[i]==y[j]) {
				lcs[index-1]=x[i];
				i--;
				j--;
				index--;
			}
			else if(L[i-1][j]> L[i][j-1]) {i--;}
			else j--;
		}
		for(int k=0;k<lcs.length;k++) {
		System.out.println(lcs[k]);
		}
		return L[m][n];
	}
	public static void main(String[] args) {
		String s1 = "LRBBMQBHCDARZOWKKYHI";
	    String s2 = "QHNWNKUEWHSQMGBBUQCL";
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	    System.out.println(nonRecursiveLCS(X, Y, m, n));
	   // System.out.println(recursiveLCS(X, Y, m, n));
	 //   System.out.println(printingLCS(X, Y, m, n));
	}
}
