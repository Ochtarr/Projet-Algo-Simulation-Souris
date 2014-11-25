package graph;

import java.util.ArrayList;

import interfaces.IGraph;

public class Graph implements IGraph {
	
	private ArrayList<Node> listNodes;
	private ArrayList<Edge> listEdges;
	
	/**
	 * Default Constructor. Do nothing
	 */
	public Graph(){
	}
	
	/**
	 * Constructor with nodes parameter
	 * @param listNodes
	 */
	public Graph(ArrayList<Node> listNodes){
		this.listNodes = listNodes;
		this.listEdges = new ArrayList<Edge>();
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

}
