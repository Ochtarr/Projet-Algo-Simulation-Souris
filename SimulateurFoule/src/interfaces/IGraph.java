package interfaces;

import java.util.ArrayList;

import graph.Node;
import graph.Edge;

public interface IGraph {
	
	public ArrayList<Node<?>> getNodes();
	
	public ArrayList<Edge> getEdges();
	
	public void addNode(Node<?> n);
	
	public void addEdge(Node<?> n1, Node<?> n2);
	
	public int getNumberOfNodes();
	
	public int getNumberOfEdges();

}
