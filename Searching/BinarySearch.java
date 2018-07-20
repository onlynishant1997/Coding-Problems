package Searching;

public class BinarySearch {
	
	public static int BS(int[] arr, int l, int r, int search) {
		if(l<r) {
			int mid=l+(r-1)/2;
			if(arr[mid]==search) return mid;
			if(arr[mid]>search) {
				return BS(arr,l,mid-1,search);
			}
				return BS(arr,mid+1,r,search);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,8,10,12};
		int search = 5;
		System.out.println(BS(arr,0,arr.length-1,search));
	}

}
