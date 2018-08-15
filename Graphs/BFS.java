package Graphs;

import java.util.LinkedList;

//Breadth First Search
public class BFS {
	
	public void bfs(int n,Graph g) {
		boolean[] visited=new boolean[g.vertices];
		LinkedList<Integer> queue=new LinkedList<>();
		visited[n]=true;
		queue.add(n);
		while(queue.size()!=0) {
			int t=queue.poll();
			System.out.println(t+" ");
			for(Integer i:g.vertex[t]) {
				if(!visited[i]) {
					visited[i]=true;
					queue.add(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(4);	
        g.addEdgeDirected(0, 1);
        g.addEdgeDirected(0, 2);
        g.addEdgeDirected(1, 2);
        g.addEdgeDirected(2, 0);
        g.addEdgeDirected(2, 3);
        g.addEdgeDirected(3, 3);
       // g.printGraph();
        BFS bfs=new BFS();
        bfs.bfs(2, g);
	}
}
