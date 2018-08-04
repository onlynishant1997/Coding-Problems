package Backtracking;

public class PrintStringPermutations {
	public static void main(String[] args) {
		String str="ABC";
		permutateString(str,0,str.length()-1);
	}

	private static void permutateString(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
		}
		for(int i=l;i<=r;i++) {
			str=swap(str,l,i);
			permutateString(str, l+1, r);
			str=swap(str,l,i);
		}
		
	}

	private static String swap(String str, int l, int i) {
		// TODO Auto-generated method stub
		char arr[]=str.toCharArray();
		char temp=arr[i];
		arr[i]=arr[l];
		arr[l]=temp;
		return String.valueOf(arr);
	}
}
