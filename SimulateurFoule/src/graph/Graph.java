package graph;

import interfaces.IGraph;

import java.util.HashMap;

import positionnement.Position;

public class Graph implements IGraph {
	
	private HashMap<Position, Node> listNodes;
	private HashMap<Position[], Edge> listEdges;
		
	/**
	 * Default Constructor. Do nothing
	 */
	public Graph(){
	}
	
	/**
	 * Constructor with node and edge lists parameters
	 * @param listNodes
	 */
	public Graph(HashMap<Position, Node> listNodes, HashMap<Position[], Edge> listEdges){
		this.listNodes = listNodes;
		this.listEdges = listEdges;
	}
	
	public HashMap<Position, Node> getNodes() {
		// TODO Auto-generated method stub
		return this.listNodes;
	}
	
	public HashMap<Position[], Edge> getEdges() {
		// TODO Auto-generated method stub
		return this.listEdges;
	}

	public void addNode(Position pos, Node n) {
		// TODO Auto-generated method stub
		this.listNodes.put(pos, n);
	}
	
	public void addEdge(Edge edge) {
		// TODO Auto-generated method stub
		Position[] edgePosition = null;
		if (edge != null)
			edgePosition = new Position[2];
			edgePosition[0] = edge.getSource().getPosition();
			edgePosition[1] = edge.getDestination().getPosition();
			this.listEdges.put(edgePosition, edge);
	}

	public void addEdge(Node n1, Node n2, int poids) {
		// TODO Auto-generated method stub
		Position[] edgePosition = null;
		if (n1 != null && n2 != null){
			edgePosition = new Position[2];
			edgePosition[0] = n1.getPosition();
			edgePosition[1] = n2.getPosition();
			this.listEdges.put(edgePosition, new Edge(n1, n2, poids));
		}
	}

	public int getNumberOfNodes() {
		// TODO Auto-generated method stub
		return this.listNodes.size();
	}

	public int getNumberOfEdges() {
		// TODO Auto-generated method stub
		return this.listEdges.size();
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
	
	public Node getLeftNode(Node n){
		 return this.listNodes.get( new Position(n.getPosition().getX()-1,n.getPosition().getY()) );
	}
	
	public Node getRightNode(Node n){
		 return this.listNodes.get( new Position(n.getPosition().getX()+1,n.getPosition().getY()) );
	}
	
	public Node getTopNode(Node n){
		 return this.listNodes.get( new Position(n.getPosition().getX(),n.getPosition().getY()+1) );
	}
	
	public Node getBottomNode(Node n){
		 return this.listNodes.get( new Position(n.getPosition().getX(),n.getPosition().getY()-1) );
	}
}
