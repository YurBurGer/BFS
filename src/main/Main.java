package main;

import java.io.FileNotFoundException;
import java.util.List;

import bfs.BFS;
import data.Graph;
import reading.ReadGraph;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Graph g=ReadGraph.ReadOrinetedGraphFromAdjacencyMatrix("AdjacencyMatrixTest.txt");
		//Graph g=ReadGraph.ReadUnorientedGraphFromEdgeList("EdgeListTest.txt");
		List<Integer> l=BFS.DoBFS(g, 0, 8);
		if(l!=null)
			for(Integer i:l)
				System.out.print(i+" ");
		else
			System.out.println("No way, man!");
	}

}
