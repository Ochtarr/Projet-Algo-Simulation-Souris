package interfaces;

import graph.Edge;
import graph.Node;
import positionnement.Position;

import java.util.HashMap;

public interface IGraph {
	
	public HashMap<Position, Node> getNodes();
	
	public HashMap<Position[], Edge> getEdges();
	
	public void addNode(Position pos, Node n);
	
	public void addEdge(Node n1, Node n2, int poids);
	
	public void addEdge(Edge edge);
	
	public int getNumberOfNodes();
	
	public int getNumberOfEdges();

}
