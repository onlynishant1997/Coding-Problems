package DynamicProgramming;


/*  
 	Input: 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
  */

public class ClimbingStairs {
	public int recursiveClimbStairs(int n) {
        if(n==0)return 1;
        if(n==1)return 1;
        int a=recursiveClimbStairs(n-2);
        int b=recursiveClimbStairs(n-1);
        return a+b;
    }
	public int climbStairs(int n) {
	     
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n+1;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
	}	
}
