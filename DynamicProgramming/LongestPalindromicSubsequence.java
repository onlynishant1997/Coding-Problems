package DynamicProgramming;

public class LongestPalindromicSubsequence {
	public static int LPS(String  s,int i,int j) {
		if(i==j)return 1;
		if(s.charAt(i)==s.charAt(j) && i+1==j) return 2;
		if(s.charAt(i)==s.charAt(j)) return LPS(s,i+1,j-1)+2;
		return Math.max(LPS(s,i+1,j), LPS(s,i,j-1));
	}
	public static void main(String[] args) {
		String s="GEEKSFORGEEKS";
		System.out.println(LPS(s,0,s.length()-1));
	}
}
