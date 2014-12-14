package graph;

import interfaces.INode;
import positionnement.Position;

public class Node implements INode {
	
	private String label;
	private Position position;
	private int poids;
	private boolean accessible;
	
	/**
	 * default constructor
	 */
	public Node(){
	}
		
	/**
	 * Constructor with differents parameters
	 * @param label
	 * @param poids poids of node
	 * @param accessible boolean equals true if a mouse can be placed on this node
	 */
	public Node(String label, Position pos, int poids, boolean accessible){
		this.label = label;
		this.setPosition(pos);
		this.poids = poids;
		this.accessible = accessible;
	}
	
	/**
	 * constructor by copy - Copy all node'parameters to this node- 
	 * @param Node n
	 */
	public Node(Node n){
		this.label = n.label;
		this.poids = n.poids;
		this.accessible = n.accessible;
	}

	public String getLabel() {
		// TODO Auto-generated method stub
		return this.label;
	}

	public void setLabel(String label) {
		// TODO Auto-generated method stub
		this.label = label;
	}
	
	public boolean equals(Node n) {
		// TODO Auto-generated method stub
		super.equals(n);
		return n==this ? true : false;
	}
	
	public String toString(){
		return this.label;
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

	/**
	 * @return the accessible
	 */
	public boolean isAccessible() {
		return accessible;
	}

	/**
	 * @param accessible the accessible to set
	 */
	public void setAccessible(boolean accessible) {
		this.accessible = accessible;
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

}
