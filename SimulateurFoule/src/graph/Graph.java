package graph;

import java.util.ArrayList;

import interfaces.IGraph;

public class Graph implements IGraph {
	
	private ArrayList<Node<?>> listNodes;
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
	public Graph(ArrayList<Node<?>> listNodes){
		this.listNodes = listNodes;
	}
	public ArrayList<Node<?>> getNodes() {
		// TODO Auto-generated method stub
		return this.listNodes;
	}
	
	public ArrayList<Edge> getEdges() {
		// TODO Auto-generated method stub
		return this.listEdges;
	}

}
