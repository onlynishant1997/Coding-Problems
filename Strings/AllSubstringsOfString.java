package Strings;

public class AllSubstringsOfString {
	
	static void printSubstring(String s,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				String temp=s.substring(i, j);
				System.out.println(temp);
			}
		}
	}
	
	public static void main(String[] args) {
		String str="I Like To Code";
		printSubstring(str, str.length());
	}
}
