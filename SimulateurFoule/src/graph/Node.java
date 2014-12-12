package graph;

import interfaces.INode;
import positionnement.Position;

public class Node implements INode {
	
	private String label;
	private Position position;
	private int listPosition;
	private int poids;
	
	/**
	 * default constructor
	 */
	public Node(){
	}
		
	public Node(String label, Position position, int listPosition, int poids){
		this.label = label;
		this.position = position;
		this.listPosition = listPosition;
		this.poids = poids;
	}
	
	/**
	 * constructor by copy - Copy all node'parameters to this node- 
	 * @param Node n
	 */
	public Node(Node n){
		this.label = n.label;
		this.position = n.position;
		this.listPosition = n.listPosition;
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

	public int getListPosition() {
		// TODO Auto-generated method stub
		return this.listPosition;
	}
	
	public int getListPosition(Position p) {
		// TODO Auto-generated method stub
		return this.listPosition;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

}
