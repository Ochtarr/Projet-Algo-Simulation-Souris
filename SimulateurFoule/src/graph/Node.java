package graph;

import positionnement.Position;
import interfaces.INode;

public class Node<V> implements INode<V> {
	
	private V value;
	private Position[] listPositionNeighbors;
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
	public Node(V value){
		this.value = value;
	}
	
	/**
	 * constructor by copy - Copy all node'parameters to this node- 
	 * @param Node n
	 */
	public Node(Node<V> n){
		this.value = n.value;
	}

	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

	public void setValue(V value) {
		// TODO Auto-generated method stub
		this.value = value;
	}
	
	/**
	 * @return Position of each current node's neighbors
	 */
	public Position[] getDirection() {
		return this.listPositionNeighbors;
	}

	/**
	 * @param listPositionNeighbors - Set Position of each current node's neighbors
	 */
	public void setDirection(Position[] listPositionNeighbors) {
		this.listPositionNeighbors = listPositionNeighbors;
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
	
	public boolean equa	public V getLeftItem() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public V getRightItem() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public V getTopItem() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public V getBottomItem() {
		// TODO Auto-generated method stub
		return null;
	}ls(Node<V> n) {
		// TODO Auto-generated method stub
		super.equals(n);
		return n==this ? true : false;
	}
	
	public String toString(){
		String s = "";
		s+="Value : "+this.value+"/n";
		return s;
	}

	public Position getLeftPosition() {
		// TODO Auto-generated method stub
		return new Position();
	}

	public Position getRightPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	public Position getTopPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	public Position getBottomPosition() {
		// TODO Auto-generated method stub
		return null;
	}

}
