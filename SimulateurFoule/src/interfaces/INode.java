package interfaces;

import positionnement.Position;
import graph.Node;

public interface INode {
	
	/**
	 * @return node's label
	 */
	public String getLabel();
	
	/**
	 * set label's node
	 * @param label
	 */
	public void setLabel(String label);
	
	/**
	 * equals method extended from Object. Compare two references
	 * @param Node n
	 * @return boolean
	 */
	public boolean equals(Node n);
	
	/**
	 * toString method extended from Object. Return a string base of this object 
	 * @return String
	 */
	public String toString();
	
	public Position getPosition();
	
	public void setPosition(Position p);
	
}
