package Graphs;

//Depth First Search
public class DFS {
	public void dfs(Graph g,int n,boolean visited[]) {
		visited[n]=true;
		System.out.println(n);
		for(Integer i:g.vertex[n]) {
			if(!visited[i]) {
				dfs(g,i,visited);
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
		boolean visited[]=new boolean[g.vertices];
		DFS dfs=new DFS();
		dfs.dfs(g, 2, visited);
		
		/*for(int i=0;i<g.vertices;i++)
			if(visited[i]==false)
				dfs.dfs(g, 2, visited);*/ //For Undirected Graph
	}
}
