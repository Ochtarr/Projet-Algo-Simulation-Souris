package interfaces;

import graph.Node;

public interface INode<V> {
	
	/**
	 * retourne le poids du noeud
	 * @return node's value
	 */
	public V getValue();
	
	/**
	 * set value's node
	 * @param value
	 */
	public void setValue(V value);
	
	/**
	 * equals method extended from Object. Compare two references
	 * @param Node n
	 * @return boolean
	 */
	public boolean equals(Node<V> n);
	
	/**
	 * toString method extended from Object. Return a string base of this object 
	 * @return String
	 */
	public String toString();


}