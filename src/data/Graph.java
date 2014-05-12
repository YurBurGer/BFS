package data;


public class Graph {
	private Vertex[] graph;
	public Graph(int count) {
		super();
		this.graph = new Vertex[count];
		for(int i=0;i<count;i++){
			this.graph[i]=new Vertex(i);
		}
	}
	public void addUnorientedEdge(int from, int to){
		this.graph[from].addEdge(to);
		this.graph[to].addEdge(from);
	}
	public void addOrientedEdge(int from, int to){
		this.graph[from].addEdge(to);
	}
	public Vertex getVertex(Integer num){
		return graph[num];
	}
}
