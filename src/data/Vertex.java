package data;

import java.util.ArrayList;
import java.util.Collections;

public class Vertex implements Comparable<Vertex>{
	private int num;
	private ArrayList<Integer> edges;
	private boolean isVisited=false;
	private Integer parent;
	public Vertex(int num) {
		super();
		this.num = num;
		this.edges=new ArrayList<>();
		this.parent=null;
	}
	public int getNum() {
		return num;
	}
	public boolean isVisited() {
		return isVisited;
	}
	public void markVisited() {
		this.isVisited = true;
	}
	public void addEdge(Integer vnum){
		edges.add(vnum);
		Collections.sort(edges);
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	@Override
	public int compareTo(Vertex arg0) {
		return Integer.compare(num, arg0.num);
	}	
	public ArrayList<Integer> getEdges(){
		return edges;
	}
}
