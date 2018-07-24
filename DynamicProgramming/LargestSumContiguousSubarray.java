package DynamicProgramming;

public class LargestSumContiguousSubarray {
	public static int LSCS(int arr[],int n) {
		int sum=0;
		int max=0;
		for(int i=0;i<n;i++) {
			sum=Math.max(arr[i],sum+arr[i]);
			max=Math.max(sum, max);
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(LSCS(arr,arr.length));
	}
}
