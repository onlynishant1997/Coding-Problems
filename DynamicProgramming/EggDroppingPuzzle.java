package DynamicProgramming;

public class EggDroppingPuzzle {
	public int dropPuzzle(int eggs,int floors) {
		int arr[][]=new int[eggs+1][floors+1];
		for(int i=1;i<=eggs;i++) {
			for(int j=1;j<=floors;j++) {
				if(j==1) {
					arr[i][j]=1;
				}
				if(i==1) {
					arr[i][j]=j;
				}
			}
		}
		
		for(int i=2;i<=eggs;i++) {
			for(int j=2;j<=floors;j++) {
				int min=99999;
				for(int k=1;k<=j;k++) {
					int temp=1+Math.max(arr[i-1][k-1],arr[i][j-k]);
					if(temp<min) min=temp;
				}
				arr[i][j]=min;
			}
		}
		
		return arr[eggs][floors];
	}
	public static void main(String[] args) {
		System.out.println(new EggDroppingPuzzle().dropPuzzle(10, 1));
	}
}
