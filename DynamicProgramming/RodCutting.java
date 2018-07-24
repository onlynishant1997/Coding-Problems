package DynamicProgramming;

public class RodCutting {
	static int cutRod(int price[], int n)
	{
		if(n<=0)return 0;
		int maximum=0;
		for(int i=0;i<n;i++) {
			maximum=Math.max(maximum,price[i]+cutRod(price,n-i-1));
		}
		return maximum;
	}
	public static void main(String[] args) {
		int arr1[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
		int arr2[] = new int[] {3, 5, 8, 9, 10, 17, 17, 20};
		System.out.println("Maximum Obtainable Value is "+cutRod(arr1, 5));
		System.out.println("Maximum Obtainable Value is "+cutRod(arr2, arr2.length));
	}
}
