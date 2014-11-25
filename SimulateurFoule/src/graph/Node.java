package graph;

import positionnement.Position;
import interfaces.INode;

public class Node implements INode {
	
	private String label;
	private Position position;
	
	/**
	 * default constructor
	 */
	public Node(){
	}
	
	/**
	 * constructor with value parameter
	 * @param value
	 */
	public Node(String label){
		this.label = label;
	}
	
	public Node(String label, Position position){
		this.label = label;
		this.position = position;
	}
	
	/**
	 * constructor by copy - Copy all node'parameters to this node- 
	 * @param Node n
	 */
	public Node(Node n){
		this.label = n.label;
	}

	public String getLabel() {
		// TODO Auto-generated method stub
		return this.label;
	}

	public void setLabel(String label) {
		// TODO Auto-generated method stub
		this.label = label;
	}

	/**
	 * @return position of current element
	 */
	public Position getPosition() {
		return this.position;
	}

	/**
	 * Set position of current element
	 * @param position
	 */
	public void setPosition(Position p) {
		this.position = p;
	}
	
	public boolean equals(Node n) {
		// TODO Auto-generated method stub
		super.equals(n);
		return n==this ? true : false;
	}
	
	public String toString(){
		return this.label;
	}

}
