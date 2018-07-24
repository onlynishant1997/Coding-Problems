package DynamicProgramming;

public class KnapSackProblem {
	
	public static int KSP(int val[],int wt[],int W,int n) {
		if(n==0 || W==0) return 0;
		if(wt[n-1]>W) return KSP(val,wt,W,n-1);
		else return Math.max(KSP(val,wt,W,n-1),val[n-1]+KSP(val,wt,W-wt[n-1],n-1));
	}
	
	public static void main(String[] args) {
		int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W=50;
        System.out.println(KSP(val,wt,W,val.length));
	}
}
