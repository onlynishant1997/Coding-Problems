package Recursion;

public class PeakElementInArray {
	public static int bsearch(int arr[],int l,int r,int n){
        int mid=l+(r-l)/2;
        if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n || arr[mid]>=arr[mid+1])){
        	return arr[mid];
        }
        else if(mid>0 && arr[mid-1]>arr[mid]){
        	return bsearch(arr,l,mid-1,n);
        }
        else return bsearch(arr,mid+1,r,n);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int arr[]={-3,-2,0,3,4,10,9};
	    int n=arr.length-1;
	    int peak=bsearch(arr,0,n-1,n);
	    System.out.println(peak);
	}
}
