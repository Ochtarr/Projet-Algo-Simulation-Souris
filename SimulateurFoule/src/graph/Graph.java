package graph;

import java.util.ArrayList;

import interfaces.IGraph;

public class Graph implements IGraph {
	
	private ArrayList<Node<?>> listNodes;
	private ArrayList<Edge> listEdges;
	
	@Override
	public ArrayList<Node<?>> getNodes() {
		// TODO Auto-generated method stub
		return this.listNodes;
	}
	
	@Override
	public ArrayList<Edge> getEdges() {
		// TODO Auto-generated method stub
		return this.listEdges;
	}

}
