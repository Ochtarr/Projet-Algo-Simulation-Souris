package interfaces;

import graph.Edge;
import graph.Node;

import java.util.ArrayList;

public interface IGraph {
	
	public ArrayList<Node> getNodes();
	
	public ArrayList<Edge> getEdges();
	
	public void addNode(Node n);
	
	public void addEdge(Node n1, Node n2, int poids);
	
	public int getNumberOfNodes();
	
	public int getNumberOfEdges();

}
