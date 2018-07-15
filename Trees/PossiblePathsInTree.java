package Trees;

public class PossiblePathsInTree {
	static int arr[]=new int[10];
	static int len=0;
	public static void printArray(int arr[],int len) {
		for(int i=0;i<len;i++)System.out.println(arr[i]);
		System.out.println("---");
	}
	public static void printPossiblePath(Node root,int arr[],int len) {
		if(root==null)return ;
		arr[len++]=root.key;
		if(root.left==null && root.right==null) {
			printArray(arr,len);
		}
		else {
		printPossiblePath(root.left,arr,len);
		printPossiblePath(root.right,arr,len);
		}
	}
	public static void main(String[] args) {
		Node root=new Node(20);
		root.left=new Node(10);
		root.right=new Node(30);
		root.left.left=new Node(5);
		root.left.right=new Node(15);
		root.right.left=new Node(25);
		root.right.right=new Node(35);
		printPossiblePath(root,arr,len);


	}
}

