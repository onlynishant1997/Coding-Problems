package DynamicProgramming;

public class EditDistance {
	
	public static int ED(String a,String b,int m,int n) {
		if(m==0)return n;
		if(n==0)return m;
		if(a.charAt(m-1)==b.charAt(n-1)) {
			return ED(a,b,m-1,n-1);
		}
		return 1+Math.min(ED(a,b,m-1,n-1),Math.min(ED(a,b,m-1,n),ED(a,b,m,n-1)));
	}
	
	public static void main(String[] args) {
		String str1="sunday";
		String str2="saturday";
		System.out.println(ED(str1,str2,str1.length(),str2.length()));
	}
}
