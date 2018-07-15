package Trees;


public class BinaryTreeIntro {
	Node n;
	public BinaryTreeIntro() {
		n=null;
	}
	public BinaryTreeIntro(int k) {
		n=new Node(k);
	}
	public static void inOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		System.out.println(n.key);
		inOrder(n.right);
	}
	public static void preOrder(Node n) {
		if(n==null) return;
		System.out.println(n.key);
		inOrder(n.left);
		inOrder(n.right);
	}
	public static void postOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		inOrder(n.right);
		System.out.println(n.key);
	}
	public static void main(String[] args) {
		BinaryTreeIntro bti=new BinaryTreeIntro(1);
		bti.n.left=new Node(2);
		bti.n.right=new Node(3);
		inOrder(bti.n);
	}

}
