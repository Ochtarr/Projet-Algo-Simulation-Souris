package Navigation;

import Map.Map;
import positionnement.Position;

public class Navigation {
	
	private Map m;
	private Position directionProposee;

	/**
	 * @return the directionProposee
	 */
	public Position getDirectionProposee() {
		return directionProposee;
	}
	
	/**
	 * @param directionProposee the directionProposee to set
	 */
	public void setDirectionProposee(Position directionProposee) {
		this.directionProposee = directionProposee;
	}
	
	/**
	 * @return the m
	 */
	public Map getM() {
		return m;
	}
	
	/**
	 * @param m the m to set
	 */
	public void setM(Map m) {
		this.m = m;
	}
	
	
	
}
