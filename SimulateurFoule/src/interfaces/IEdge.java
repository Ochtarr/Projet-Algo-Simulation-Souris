package interfaces;

import graph.Node;

import positionnement.Position;

import java.util.HashMap;

public interface IEdge {
	
	public HashMap<Position, Node> getNodes();
	
	public Node getSource();
	
	public Node getDestination();
	
	public int getPoids();
	
	public void setPoids(int poids);
	
}
