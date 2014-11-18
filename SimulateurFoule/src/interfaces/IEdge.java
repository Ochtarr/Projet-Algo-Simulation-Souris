package interfaces;

import java.util.ArrayList;

import graph.Node;

public interface IEdge {
	
	public ArrayList<Node<?>> getNodes();
	
	public Node<?> getSource();
	
	public Node<?> getDestination();
	
	public int getPoids();
	
	public void setPoids(int poids);
	
}
