package navigation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import elements.Cheese;
import elements.Element;
import elements.Mouse;

import graph.*;
import map.ObjectMap;
import positionnement.Position;

public class Navigation {
	
	private ObjectMap map;
	private Mouse mouse;
	private Position directionProposee;
	private Graph graph;
	private HashMap<Position, Node> nodeList;
	private HashMap<String, Node> voisinList;
	private HashMap<Position[], Edge> edgeList;
	
	private Node nodeDepart;
	private ArrayList<Node> nodeArrivee;
	
	//variable nécessaire à Dijkstra
	//Copie nécessaire pour éviter de perdre le cout de déplacement de chaque noeud
	
	// non necessaire //private HashMap<Position, Node> dijkstraNodeList;
	//Ensemble permettant de savoir si un noeud a déjà été visité ou non
	private HashMap<Position, Node> dijkstraVisitedNodeList;
	private HashMap<Position, Node> dijkstraNonVistedNodeList;
	
	
	public Navigation(){
	}
	
	public Navigation(ObjectMap m, Mouse mouse){
		this.map = m;
		this.setMouse(mouse);
		this.directionProposee = new Position();
		this.nodeList = nodeListInitialisation(m);
		this.edgeList = edgeListInitialisation(nodeList, m);
		this.graph = new Graph(nodeList, edgeList);
		
		this.nodeDepart = nodeList.get(new Position(mouse.getCurrPosition()));
		trouverNoeudArrive();
	}
	
	private HashMap<Position, Node> nodeListInitialisation(ObjectMap map){
		HashMap<Position, Node> nodeList = new HashMap<Position, Node>(map.getCapacity());
		Iterator<Element> iterator = map.getMap().values().iterator();
		while(iterator.hasNext()){
			
			String label = iterator.next().getLabel();
			Position pos = new Position(iterator.next().getCurrPosition());
			int poids = iterator.next().getMovingCost();
			boolean accessible = iterator.next().isAccessible();
			
			nodeList.put(pos, new Node(label, pos, poids, accessible ));	
			
		}
		return nodeList;
	}
	
	private HashMap<Position[], Edge> edgeListInitialisation(HashMap<Position, Node> nodeList, ObjectMap m){
		HashMap<Position[], Edge> edgeList = new HashMap<Position[], Edge>(4);
		Iterator<Node> iterator = nodeList.values().iterator();
		//Initialisation de l'ensemble des arrêtes
		while( iterator.hasNext()){							
			//déplacement sur la droite
			//origine : noeud 'node'
			//destination : right node of 'node' -> nodeList.get(node.getListPosition()+1)
			Position[] tbPos = null;
			if( graph.getRightNode(iterator.next()) != null){
				Edge e = new Edge(iterator.next(), graph.getRightNode(iterator.next()), graph.getRightNode(iterator.next()).getPoids() );
				tbPos = new Position[2];
				tbPos[0] = new Position(iterator.next().getPosition());
				tbPos[1] = new Position(graph.getRightNode(iterator.next()).getPosition());
				edgeList.put( tbPos , e);
			}
				
			//déplacement vers le bas
			//origine : noeud 'node'
			//destination : down node of 'node' -> nodeList.get(node.getListPosition()+m.getNbColonne())
			if( graph.getBottomNode(iterator.next()) != null){
				Edge e = new Edge(iterator.next(), graph.getBottomNode(iterator.next()), graph.getBottomNode(iterator.next()).getPoids() );
				tbPos = new Position[2];
				tbPos[0] = new Position(iterator.next().getPosition());
				tbPos[1] = new Position(graph.getBottomNode(iterator.next()).getPosition());
				edgeList.put( tbPos , e);
			}
			
			//déplacement vers la gauche
			//origine : noeud 'node'
			//destination : left node of 'node' -> nodeList.get(node.getListPosition()-1)
			//vérifier que la position soit supérieure à 0 pour éviter une exception dans le nodeList.getListPosition()
			if( graph.getLeftNode(iterator.next()) != null){
				Edge e = new Edge(iterator.next(), graph.getLeftNode(iterator.next()), graph.getLeftNode(iterator.next()).getPoids() );
				tbPos = new Position[2];
				tbPos[0] = new Position(iterator.next().getPosition());
				tbPos[1] = new Position(graph.getLeftNode(iterator.next()).getPosition());
				edgeList.put( tbPos , e);
			}
			
			//déplacement vers le haut
			//origine : noeud 'node'
			//destination : up node of 'node' -> nodeList.get(node.getListPosition()-m.getNbColonne())
			if( graph.getTopNode(iterator.next()) != null){
				Edge e = new Edge(iterator.next(), graph.getTopNode(iterator.next()), graph.getTopNode(iterator.next()).getPoids() );
				tbPos = new Position[2];
				tbPos[0] = new Position(iterator.next().getPosition());
				tbPos[1] = new Position(graph.getTopNode(iterator.next()).getPosition());
				edgeList.put( tbPos , e);
			}
		}
		return edgeList;
	}
		
	private void initialisationDijkstra(){
				
		//Initialisation de l'ensemble des noeuds visites
		this.dijkstraVisitedNodeList = new HashMap<Position, Node>(nodeList);
		dijkstraVisitedNodeList.clear();
		Position posMouse = new Position(nodeDepart.getPosition());
		dijkstraVisitedNodeList.put( posMouse, this.graph.getNodes().get(posMouse) );
		
		//Initialisation de l'ensemble des noeuds non visités
		this.dijkstraNonVistedNodeList = new HashMap<Position, Node>(nodeList);
		this.dijkstraNonVistedNodeList.remove(posMouse);
		Iterator<Node> iterator = this.dijkstraNonVistedNodeList.values().iterator();
		while(iterator.hasNext()){
			iterator.next().setPoids(-1);
		}
	}
	
	public Position conseillerDirection(){
		initialisationDijkstra();
		
		Iterator<Node> ite = dijkstraNonVistedNodeList.values().iterator();
		while(ite.hasNext()){
			if(ite.next().isVoisin(dijkstraVisitedNodeList.size()));
			this.rechercherVoisin(ite.next());
			this.rechercherNoeudPlusProche();
			
		}
		return directionProposee;
	}
	
	/**
	 * set destinationList with nodes whose elements are cheese
	 * @param m
	 */
	private void trouverNoeudArrive(){
		if(this.nodeList.containsValue(Cheese.class)){
			this.nodeArrivee = new ArrayList<Node>();
			Iterator<Node> iterator = this.nodeList.values().iterator();
			while(iterator.hasNext()){
				if(iterator.next().getLabel() == "cheese"){
					nodeArrivee.add(iterator.next());
				}
			}
		}
	}
	
	private Node rechercherNoeudPlusProche(){
		Iterator<Node> ite = voisinList.values().iterator();
		Node nodePlusProche = null;
		while(ite.hasNext()){
			if(nodePlusProche == null)
				nodePlusProche = ite.next();
			if(nodePlusProche.getPoids() > ite.next().getPoids())
				nodePlusProche = ite.next();
		}
		return nodePlusProche;
	}
	
	private HashMap<String, Node> rechercherVoisin(Node n){
		HashMap<String, Node> voisinList = new HashMap<String, Node>(4);
		Iterator<Edge> iterator = edgeList.values().iterator();
		while(iterator.hasNext()){
			if(this.graph.getRightNode(n) != null)
				voisinList.put("right", iterator.next().getDestination());
			if(this.graph.getLeftNode(n) != null)
				voisinList.put("left", iterator.next().getDestination());
			if(this.graph.getTopNode(n) != null)
				voisinList.put("top", iterator.next().getDestination());
			if(this.graph.getBottomNode(n) != null)
				voisinList.put("bottom", iterator.next().getDestination());
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
	private HashMap<Position, Node> getNodeList() {
		return nodeList;
	}

	/**
	 * @param nodeList
	 */
	private void setNodeList(HashMap<Position, Node> nodeList) {
		this.nodeList = nodeList;
	}

	/**
	 * @return current edge list of current graph
	 */
	private HashMap<Position[], Edge> getEdgeList() {
		return edgeList;
	}

	/**
	 * @param edgeList
	 */
	private void setEdgeList(HashMap<Position[], Edge> edgeList) {
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
	public ObjectMap getM() {
		return this.map;
	}
	
	/**
	 * @param map the map to set
	 */
	public void setM(ObjectMap map) {
		this.map = map;
	}

	/**
	 * @return the mouse
	 */
	public Mouse getMouse() {
		return mouse;
	}

	/**
	 * @param mouse the mouse to set
	 */
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
}
