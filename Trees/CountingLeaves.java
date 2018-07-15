package Trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class CountingLeaves {
	
	
	public static void printLevelOrder(Node root)
	    {
	        int h = height(root);
	        int i;
	        for (i=1; i<=h; i++)
	            printGivenLevel(root, i);
	    }
	 
	    /* Compute the "height" of a tree -- the number of
	    nodes along the longest path from the root node
	    down to the farthest leaf node.*/
	public static int height(Node root)
	    {
	        if (root == null)
	           return 0;
	        else
	        {
	            /* compute  height of each subtree */
	            int lheight = height(root.left);
	            int rheight = height(root.right);
	             
	            /* use the larger one */
	            if (lheight > rheight)
	                return(lheight+1);
	            else return(rheight+1); 
	        }
	    }
	 
	    /* Print nodes at the given level */
	public static void printGivenLevel (Node root ,int level)
	    {
	        if (root == null)
	            return;
	        if (level == 1)
	            System.out.print(root.key + " ");
	        else if (level > 1)
	        {
	            printGivenLevel(root.left, level-1);
	            printGivenLevel(root.right, level-1);
	        }
	    }
	
	public static void fun(Node n) {
		if(n==null)return;
		System.out.println(n.key);
		fun(n.left);
		fun(n.right);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int no=Integer.parseInt(br.readLine());
		int count=0;
		Node root=null;
		Node temp=null;
		Node check=null;
		while(count!=no) {
			if(root==null) {
				Node n= new Node(count++);
				root=n;
				temp=n;
				check=n;
			}
			else if(temp.left==null){
				temp.left=new Node(count++);
			}
			else if(temp.right==null) {
				temp.right=new Node(count++);
			}
			else if(temp.left!=null && temp.right!=null) {
			//	check=temp;
				temp=temp.left;
			}
			else {
				//check=temp;
				temp=temp.right;
			}
			
		}
		printLevelOrder(root);
		
	}
}
