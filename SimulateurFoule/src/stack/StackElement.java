package stack;

import positionnement.Position;

public class StackElement {
	
	private Position PositionElement;
	private int coutDeplacementElement;
	
	/**
	 * Constructor
	 */
	public StackElement(){
	}
	
	/**
	 * Constructor with parameters
	 * @param posElement
	 * @param coutDeplacement
	 */
	public StackElement(Position posElement, int coutDeplacement){
		PositionElement = new Position(posElement.getX(), posElement.getY());
		coutDeplacementElement = coutDeplacement;
	}
	
	/**
	 * @return the positionElement
	 */
	public Position getPositionElement() {
		return PositionElement;
	}
	
	/**
	 * @param positionElement the positionElement to set
	 */
	public void setPositionElement(Position positionElement) {
		PositionElement = positionElement;
	}
	
	/**
	 * @return the coutDeplacementElement
	 */
	public int getCoutDeplacementElement() {
		return coutDeplacementElement;
	}
	
	/**
	 * @param coutDeplacementElement the coutDeplacementElement to set
	 */
	public void setCoutDeplacementElement(int coutDeplacementElement) {
		this.coutDeplacementElement = coutDeplacementElement;
	}
	
	public String toString(){
		String s = "";
		s+= "Position : " + this.getPositionElement().toString() + " - Cout Deplacement : " + this.coutDeplacementElement;
		return s;
	}
	

}
