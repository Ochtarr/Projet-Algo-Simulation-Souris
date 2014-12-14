package graph;

import interfaces.IEdge;

import positionnement.Position;

import java.util.HashMap;

public class Edge implements IEdge {
	
	private Node source;
	private Node destination;
	private HashMap<Position, Node> mapNodes;
	private int poids;

	/**
	 * Default constructor
	 */
	public Edge(){
	}
	
	/**
	 * Constructor with an hashmap of nodes (capacity:2)
	 * @param mapNodes
	 */
	public Edge(HashMap<Position, Node> mapNodes) {
		if(mapNodes.size() != 2 && mapNodes != null){
			this.source = mapNodes.get(0);
			this.destination = mapNodes.get(1);
			this.mapNodes = new HashMap<Position, Node>(2);
			mapNodes.put(this.source.getPosition(), this.source);
			mapNodes.put(this.destination.getPosition(), this.destination);
		}
		else if(mapNodes == null)
			System.out.println("Parameter must be initialized.");
		else
			System.out.println("Size of parameter must equal two");
	}
	
	/**
	 * construct an edge with two nodes. First will be the source and the second one the destination
	 * @param source
	 * @param destination
	 */
	public Edge(Node source, Node destination, int poids){
		if(source!=null && destination!=null){
			this.source = source;
			this.destination = destination;
			this.mapNodes = new HashMap<Position, Node>(2);
			this.mapNodes.put(this.source.getPosition(), this.source);
			this.mapNodes.put(this.destination.getPosition(), this.destination);
			this.poids = poids;
		}
	}
	
	/**
	 * Constructs an edge by copying another edge
	 * @param e
	 */
	public Edge(Edge e){
		this.source = e.source;
		this.destination = e.destination;
		this.mapNodes = new HashMap<Position, Node>(2);
		this.mapNodes.put(this.source.getPosition(), this.source);
		this.mapNodes.put(this.destination.getPosition(), this.destination);
	}


	public HashMap<Position, Node> getNodes() {
		// TODO Auto-generated method stub
		return this.mapNodes;
	}

	public Node getSource() {
		// TODO Auto-generated method stub
		return this.source;
	}

	public Node getDestination() {
		// TODO Auto-generated method stub
		return this.destination;
	}
	
	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public String toString(){
		String s = "";
		s+= this.getSource() + " -> " + this.getDestination() + " (" + this.getPoids() + ")";
		return s;
	}

}
