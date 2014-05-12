package reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import data.Graph;

public class ReadGraph {
	public static Graph ReadOrientedGraphFromEdgeList(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int count=sc.nextInt();
		Graph graph=new Graph(count);
		while(sc.hasNext()){
			int from=sc.nextInt();
			int to=sc.nextInt();
			graph.addOrientedEdge(from, to);
		}
		sc.close();
		return graph;
	}
	public static Graph ReadOrinetedGraphFromAdjacencyMatrix(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int count=sc.nextInt();
		Graph graph=new Graph(count);
		int[][] matrix=new int[count][count];
		for(int i=0;i<count;i++)
			for(int j=0;j<count;j++)
				matrix[i][j]=sc.nextInt();
		for(int i=0;i<count;i++)
			for(int j=0;j<count;j++)
				if(matrix[i][j]==1)
					graph.addOrientedEdge(i, j);
		sc.close();
		return graph;
	}
	public static Graph ReadOrientedGraphFromIncidencematrix(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int vcount=sc.nextInt();
		int ecount=sc.nextInt();
		Graph graph=new Graph(vcount);
		int[][] matrix=new int[ecount][vcount];
		for(int i=0;i<ecount;i++)
			for(int j=0;j<vcount;j++)
				matrix[i][j]=sc.nextInt();
		for(int i=0;i<ecount;i++){
			int from=0;
			int to=0;
			for(int j=i;j<vcount;j++){
				if(matrix[i][j]==1)
					from=j;
				if(matrix[i][j]==-1)
					to=j;
			}
			graph.addOrientedEdge(from, to);
		}
		sc.close();
		return graph;
	}
	public static Graph ReadUnorientedGraphFromEdgeList(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int count=sc.nextInt();
		Graph graph=new Graph(count);
		while(sc.hasNext()){
			int from=sc.nextInt();
			int to=sc.nextInt();
			graph.addUnorientedEdge(from, to);
		}
		sc.close();
		return graph;
	}
	public static Graph ReadUnorinetedGraphFromAdjacencyMatrix(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int count=sc.nextInt();
		Graph graph=new Graph(count);
		int[][] matrix=new int[count][count];
		for(int i=0;i<count;i++)
			for(int j=0;j<count;j++)
				matrix[i][j]=sc.nextInt();
		for(int i=0;i<count;i++)
			for(int j=i;j<count;j++)
				if(matrix[i][j]==1)
					graph.addUnorientedEdge(i, j);
		sc.close();
		return graph;
	}
	public static Graph ReadUnorientedGraphFromIncidencematrix(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int vcount=sc.nextInt();
		int ecount=sc.nextInt();
		Graph graph=new Graph(vcount);
		int[][] matrix=new int[ecount][vcount];
		for(int i=0;i<ecount;i++)
			for(int j=0;j<vcount;j++)
				matrix[i][j]=sc.nextInt();
		for(int i=0;i<ecount;i++){
			int from=0;
			int to=0;
			for(int j=i;j<vcount;j++){
				if(matrix[i][j]==1)
					if(from==0)
						from=j;
					else
						to=j;
			}
			graph.addUnorientedEdge(from, to);
		}
		sc.close();
		return graph;
	}
}