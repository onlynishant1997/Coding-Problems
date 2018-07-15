package Trees;

public class HeightOfTree {
	public static int height(Node n) {
		if(n==null)return 0;
		int l=height(n.left);
		int r=height(n.right);
		if(l>=r)return l+1;
		else return r+1;		
	}
}
