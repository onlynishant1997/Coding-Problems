package DynamicProgramming;

public class Reduce_N_To_1 {
	static int fun(int n) {
		if(n==1)return 0;
		if(n==2 || n==3)return 1;
		if(n%2==0 && n%3==0) {return 1+fun(n/3);}
		if(n%2==0) {return 1+Math.min(fun(n/2), fun(n-1));}
		if(n%3==0) {return 1+Math.min(fun(n/3), fun(n-1));}
		if(n%2!=0 && n%3!=0) {return 1+fun(n-1);}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(fun(31));
	}
}
