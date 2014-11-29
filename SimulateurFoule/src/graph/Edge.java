package graph;

import interfaces.IEdge;

import java.util.ArrayList;

public class Edge implements IEdge {
	
	private Node source;
	private Node destination;
	private ArrayList<Node> listNodes;
	private int poids;

	/**
	 * Default constructor
	 */
	public Edge(){
	}
	
	/**
	 * Constructor with an array of nodes (size array:2)
	 * @param listNodes
	 */
	public Edge(ArrayList<Node> listNodes) {
		if(listNodes.size() != 2 && listNodes != null){
			this.listNodes = new ArrayList<Node>(2);
			listNodes.add(listNodes.get(0));
			listNodes.add(listNodes.get(1));
			this.source = listNodes.get(0);
			this.destination = listNodes.get(1);
			//Initialisation du poids avec listNodes.get(1).get...(getPoids)
		}
		else if(listNodes == null)
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
			this.listNodes = new ArrayList<Node>(2);
			this.listNodes.add(source);
			this.listNodes.add(destination);
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
		this.listNodes = new ArrayList<Node>(2);
		this.listNodes.add(e.getNodes().get(0));
		this.listNodes.add(e.getNodes().get(1));
	}


	public ArrayList<Node> getNodes() {
		// TODO Auto-generated method stub
		return this.listNodes;
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
