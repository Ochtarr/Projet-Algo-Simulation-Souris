package graph;

import interfaces.INode;

public class Node<V> implements INode<V> {
	
	private V value;
	
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

	public boolean equals(Node<V> n) {
		// TODO Auto-generated method stub
		super.equals(n);
		return n==this ? true : false;
	}
	
	public String toString(){
		String s = "";
		s+="Value : "+this.value+"/n";
		return s;
	}
}
