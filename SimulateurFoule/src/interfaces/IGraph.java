package interfaces;

import java.util.ArrayList;

import graph.Node;
import graph.Edge;

public interface IGraph {
	
	public ArrayList<Node<?>> getNodes();
	
	public ArrayList<Edge> getEdges();

}
