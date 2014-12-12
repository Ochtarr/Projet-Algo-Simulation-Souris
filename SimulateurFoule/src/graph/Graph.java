package graph;

import interfaces.IGraph;

import java.util.ArrayList;

public class Graph implements IGraph {
	
	private ArrayList<Node> listNodes;
	private ArrayList<Edge> listEdges;
	
	/**
	 * Default Constructor. Do nothing
	 */
	public Graph(){
	}
	
	/**
	 * Constructor with node and edge lists parameters
	 * @param listNodes
	 */
	public Graph(ArrayList<Node> listNodes, ArrayList<Edge> listEdges){
		this.listNodes = listNodes;
		this.listEdges = listEdges;
	}
	
	public ArrayList<Node> getNodes() {
		// TODO Auto-generated method stub
		return this.listNodes;
	}
	
	public ArrayList<Edge> getEdges() {
		// TODO Auto-generated method stub
		return this.listEdges;
	}

	public void addNode(Node n) {
		// TODO Auto-generated method stub
		this.listNodes.add(n);
	}

	public void addEdge(Node n1, Node n2, int poids) {
		// TODO Auto-generated method stub
		this.listEdges.add(new Edge(n1, n2, poids));
	}

	public int getNumberOfNodes() {
		// TODO Auto-generated method stub
		return this.listNodes.size();
	}

	public int getNumberOfEdges() {
		// TODO Auto-generated method stub
		return this.listEdges.size();
	}

	public void addEdge(Edge edge) {
		// TODO Auto-generated method stub
		if (edge != null)
			this.listEdges.add(edge);
	}
	
	public int compterPoidsTotal(Node source, Node destination){
		int poidsTotal = 0;
		String villeActuelle = source.getLabel();
		Node origin = new Node(source);
		Node fin = new Node(destination);
		
		//Affiche le départ
		System.out.println(villeActuelle);
		
		if( this.NodeExists(origin) && this.NodeExists(fin)){
			
			while(villeActuelle != fin.getLabel()) {
			
				for(int i=0 ; i<this.getNumberOfEdges(); i++){
					if(this.getEdges().get(i).getSource().getLabel() == villeActuelle ) {
						poidsTotal += this.getEdges().get(i).getPoids();
						villeActuelle = this.getEdges().get(i).getDestination().getLabel();
						//Affiche toutes les villes traversées + ville finale
						System.out.println(villeActuelle);
					}
				}
				
			}
		}
		return poidsTotal;
	}
	
	public boolean NodeExists(Node n1) {
		for(int i=0; i<this.getNodes().size(); i++){
			if( n1.getLabel() == this.getNodes().get(i).getLabel() )
				return true;	
		}
		return false;
	}

}
