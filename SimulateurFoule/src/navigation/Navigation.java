package navigation;

import java.util.ArrayList;

import elements.Mouse;

import graph.*;
import map.Map;
import positionnement.Position;

public class Navigation {
	
	private Map map;
	private Mouse mouse;
	private Position directionProposee;
	private Graph graph;
	private ArrayList<Node> nodeList;
	private ArrayList<Edge> edgeList;
	
	//variable nécessaire à Dijkstra
	//Copie nécessaire pour éviter de perdre le cout de déplacement de chaque noeud
	private ArrayList<Node> dijkstraNodeList;
	//Ensemble permettant de savoir si un noeud a déjà été visité ou non
	private ArrayList<Node> dijkstraVisitedNodeList;
	private ArrayList<Node> dijkstraNonVistedNodeList;
	
	
	public Navigation(){
	}
	
	public Navigation(Map m, Mouse mouse){
		this.map = m;
		this.mouse = mouse;
		this.directionProposee = new Position();
		this.nodeList = nodeListInitialisation(m);
		this.edgeList = edgeListInitialisation(nodeList, m);
		this.graph = new Graph(nodeList, edgeList);
		
	}
	
	private ArrayList<Node> nodeListInitialisation(Map m){
		ArrayList<Node> nodeList = new ArrayList<Node>();
		int compteur = 0;
		for(int i=0 ; i<m.getNbLigne(); i++){
			for(int j=0; j<m.getNbColonne(); j++){
				String s = "" + i + j;
				compteur++;
				Node n = new Node(s , new Position(i,j), compteur, m.getElementAt(new Position(i,j)));
				nodeList.add(n);
			}
		}
		return nodeList;
		
	}
	
	private ArrayList<Edge> edgeListInitialisation(ArrayList<Node> nodeList, Map m){
		ArrayList<Edge> edgeList = new ArrayList<Edge>();
		//Initialisation de l'ensemble des arrêtes
		for( Node node : nodeList){
			for(int i=0 ; i<m.getNbLigne(); i++){
				for(int j=0; j<m.getNbColonne(); j++){
					
					//déplacement sur la droite
					//origine : noeud 'node'
					//destination : right node of 'node' -> nodeList.get(node.getListPosition()+1)
					if(nodeList.get(node.getListPosition()+1) == null && node.getListPosition()+1 >= 0){
						Edge e = new Edge(node, nodeList.get(node.getListPosition()+1), nodeList.get(node.getListPosition()+1).getPoids() );
						edgeList.add(e);
					}
						
					//déplacement vers le bas
					//origine : noeud 'node'
					//destination : down node of 'node' -> nodeList.get(node.getListPosition()+m.getNbColonne())
					if(nodeList.get(node.getListPosition()+m.getNbColonne()) == null && node.getListPosition()+m.getNbColonne() >= 0){
						Edge e = new Edge(node, nodeList.get(node.getListPosition()+m.getNbColonne()), nodeList.get(node.getListPosition()+m.getNbColonne()).getPoids() );
						edgeList.add(e);
					}
					
					//déplacement vers la gauche
					//origine : noeud 'node'
					//destination : left node of 'node' -> nodeList.get(node.getListPosition()-1)
					//vérifier que la position soit supérieure à 0 pour éviter une exception dans le nodeList.getListPosition()
					if( nodeList.get(node.getListPosition()-1) == null && node.getListPosition()-1 >= 0 ){
						Edge e = new Edge(node, nodeList.get(node.getListPosition()-1), nodeList.get(node.getListPosition()-1).getPoids() );
						edgeList.add(e);
					}
					
					//déplacement vers le haut
					//origine : noeud 'node'
					//destination : up node of 'node' -> nodeList.get(node.getListPosition()-m.getNbColonne())
					if(nodeList.get(node.getListPosition()-m.getNbColonne()) == null && node.getListPosition()-m.getNbColonne() >= 0){
						Edge e = new Edge(node, nodeList.get(node.getListPosition()-m.getNbColonne()), nodeList.get(node.getListPosition()-m.getNbColonne()).getPoids() );
						edgeList.add(e);
					}
				
				}
			}
		}
		return edgeList;
	}
	
	private Node getInitialNode(){
		return dijkstraNodeList.get(mouse.getPosition());
	}
	
	private void initialisationDijkstra(){
		this.dijkstraNodeList = new ArrayList<Node>(nodeList);
		this.dijkstraNonVistedNodeList = new ArrayList<Node>(nodeList);
		this.dijkstraVisitedNodeList = new ArrayList<Node>();
		for(Node node : dijkstraNodeList){
			node.setPoids(-1);
		}
		dijkstra.
	}
	
	private ArrayList<Node> rechercherVoisin(Node n){
		ArrayList<Node> voisinList = new ArrayList<Node>();
		for(Edge e : edgeList){
			if(e.getSource().getListPosition() == n.getListPosition());{
				voisinList.add(e.getDestination());
				//l'ordre sera droite, bas, gauche, haut comme initialisé dans la méthode edgeListInitialisation
			}
		}
		return voisinList;
	}
	
	/**
	 * @return current graph
	 */
	public Graph getG() {
		return this.graph;
	}

	/**
	 * @param graph
	 */
	public void setG(Graph graph) {
		this.graph = graph;
	}

	/**
	 * @return current node list of current graph
	 */
	private ArrayList<Node> getNodeList() {
		return nodeList;
	}

	/**
	 * @param nodeList
	 */
	private void setNodeList(ArrayList<Node> nodeList) {
		this.nodeList = nodeList;
	}

	/**
	 * @return current edge list of current graph
	 */
	private ArrayList<Edge> getEdgeList() {
		return edgeList;
	}

	/**
	 * @param edgeList
	 */
	private void setEdgeList(ArrayList<Edge> edgeList) {
		this.edgeList = edgeList;
	}

	/**
	 * @return the directionProposee
	 */
	public Position getDirectionProposee() {
		return directionProposee;
	}
	
	/**
	 * @param directionProposee the directionProposee to set
	 */
	public void setDirectionProposee(Position directionProposee) {
		this.directionProposee = directionProposee;
	}
	
	/**
	 * @return current map
	 */
	public Map getM() {
		return this.map;
	}
	
	/**
	 * @param map the map to set
	 */
	public void setM(Map map) {
		this.map = map;
	}
	
	
	
}
