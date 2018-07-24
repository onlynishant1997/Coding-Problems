package DynamicProgramming;

public class LongestPathInMatrix {
	
	public static int LPM(int arr[][],int n,int i,int j) {
		 if(i<0 || i>=n || j<0 || j>=n)return 0;
	     int max1=0,max2=0,max3=0,max4=0;
	     if(j<n-1  && arr[i][j]+1==arr[i][j+1])max1= 1 + LPM(arr,n,i,j+1);
	     if(j>0 && arr[i][j]+1==arr[i][j-1])max2= 1 + LPM(arr,n,i,j-1);
	     if(i<n-1 && arr[i][j]+1==arr[i+1][j])max3= 1 + LPM(arr,n,i+1,j);
	     if(i>0 && arr[i][j]+1==arr[i-1][j])max4= 1 + LPM(arr,n,i-1,j);
	     return Math.max(Math.max(max1,max2),Math.max(max3,max4));
	}
	
	public static void main(String[] args) {
		int arr[][]={{1, 2, 9},{5, 3, 8},{4, 6, 7}};
		int max=0;
		int temp=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				temp=LPM(arr,3,i,j);
				if(temp>max)max=temp;
			}
		}
		System.out.println(max+1);
	}
}
