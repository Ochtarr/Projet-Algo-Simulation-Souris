package interfaces;

public interface IPosition {
	
	/**
	 * @return abscisse position of current element
	 */
	public int getX();
	
	/**
	 * @return ordonnee position of current element
	 */
	public int getY();

	/**
	 * Set x position of current element
	 * @param x 
	 */
	public void setX(int x);
	
	/**
	 * Set y position of current element
	 * @param y
	 * @return
	 */
	public void setY(int y);

}
