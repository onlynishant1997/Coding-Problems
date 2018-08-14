package Graphs;

import java.util.LinkedList;

class Graph{
	int vertices=0;
	LinkedList<Integer> vertex[];
	@SuppressWarnings("unchecked")
	public Graph(int n) {
		vertices=n;
		vertex=new LinkedList[n];
		for(int i=0;i<n;i++) {
			vertex[i]=new LinkedList<>();
		}
	}
	public void addEdgeUndirected(int src,int dest) {
		this.vertex[src].addFirst(dest);
		this.vertex[dest].addFirst(src);
	}
	public void addEdgeDirected(int src,int dest) {
		this.vertex[src].addLast(dest);
	}
	public void printGraph() {
		for(int i=0;i<vertices;i++) {
			System.out.println("Adjacency list of vertex "+ i);
            System.out.print("head");
            for(Integer t:vertex[i]) {
            	System.out.print(" -> "+t);
            }
            System.out.println("\n");
		}
	}
}

public class GraphRepresentation {
	public static void main(String[] args) {
		Graph graph=new Graph(5);
		graph.addEdgeUndirected(0, 1);
		graph.addEdgeUndirected(0, 4);
		graph.addEdgeUndirected(1, 2);
		graph.addEdgeUndirected(1, 3);
		graph.addEdgeUndirected(1, 4);
		graph.addEdgeUndirected(2, 3);
		graph.addEdgeUndirected(3, 4);
		graph.printGraph();
	}
}
