package interfaces;

import graph.Node;

import java.util.ArrayList;

public interface IEdge {
	
	public ArrayList<Node> getNodes();
	
	public Node getSource();
	
	public Node getDestination();
	
	public int getPoids();
	
	public void setPoids(int poids);
	
}
