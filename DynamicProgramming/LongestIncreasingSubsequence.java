package DynamicProgramming;

public class LongestIncreasingSubsequence {
	public static int fun(int arr[],int n) {
		int[] temp=new int[] {1,1,1,1,1,1,1,1,1,1};
		int max=0;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					temp[i]=Math.max(temp[i], temp[j]+1);
				}
			}
		}
		for(int i=0; i < temp.length; i++){
            if(temp[i] > temp[max]){
                max = i;
            }
        }
		return temp[max];
	}
	public static void main(String[] args) {
		int arr[]= {10, 22, 11, 12, 13, 14, 41, 60, 80};
		System.out.println(fun(arr,arr.length));
	}
}
