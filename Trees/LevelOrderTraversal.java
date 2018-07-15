package Trees;

import java.util.*;
public class LevelOrderTraversal extends HeightOfTree{
	Node n;
	public LevelOrderTraversal() {
		n=null;
	}
	public static void levelorder(Node n) {
		Queue<Node> q=new LinkedList<Node>();
		q.add(n);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
			System.out.println(temp.key);
		}
	}
	public static void main(String[] args) {
		LevelOrderTraversal bti=new LevelOrderTraversal();
		bti.n=new Node(1);
		bti.n.left=new Node(2);
		bti.n.right=new Node(3);
		bti.n.left.left=new Node(4);
		bti.n.left.right=new Node(5);
		levelorder(bti.n);
		System.out.println(HeightOfTree.height(bti.n));
	}
}
