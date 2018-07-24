package DynamicProgramming;

public class SubsetSumProblem {
	
	public static boolean SSP(int arr[],int n,int sum) {
		if(sum==0)return true;
		if(n<=0 && sum!=0)return false;
		if(arr[n-1]>sum)return SSP(arr,n-1,sum);
		return SSP(arr,n-1,sum)||SSP(arr,n-1,sum-arr[n-1]);
	}
	
	public static void main(String[] args) {
		int arr[]={1,2,3};
		int sum=6;
		System.out.println(SSP(arr,arr.length,sum));
	}
}
