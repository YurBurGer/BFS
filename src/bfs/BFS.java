package bfs;

import java.util.LinkedList;

import data.Graph;

public class BFS {
	public static LinkedList<Integer> DoBFS(Graph graph,int from, int to){
		LinkedList<Integer> path=new LinkedList<>();
		LinkedList<Integer> BFSList=new LinkedList<>();
		BFSList.add(from);
		graph.getVertex(from).markVisited();
		Integer current=from;
		while(!BFSList.isEmpty()&&(current!=to)){			
			for(Integer i:graph.getVertex(current).getEdges()){
				if(!graph.getVertex(i).isVisited()){
					BFSList.addLast(i);
					graph.getVertex(i).markVisited();
					graph.getVertex(i).setParent(current);
				}
			}
			BFSList.remove();
			current=BFSList.peek();
		}
		if(current==to){
			while(current!=null){
				path.addFirst(current);
				current=graph.getVertex(current).getParent();
			}
			return path;
		}
		else
			return null;
	}
}
