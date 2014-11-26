package elements;

import interfaces.IElement;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Element implements IElement {

	private int MovingCost;
	private BufferedImage icon;
	private int[][] tabAround = new int[7][7];
	private int[] currPosition = {0,0};
	/* Valeur de Deplacement de la case
	*  Exemple : 
	*  Ground ( Terrain normaux ), valeur de deplacement = 1
	*  Grass ( Herbe ), valeur de deplacement  = 2
	*  Cheese ( Objectif de la souris ), valeur de deplacement = 1
	*  etc...
	*/
	private int nbDeplacement;
	/**
	 * return icon of current element
	 */
	public BufferedImage getIcon() {
		return this.icon;
	}

	/**
	 * Set icon (tile) for current element
	 * @param nameFile
	 */
	public void setIcon(String nameFile) {
		try {
			icon = ImageIO.read(new File((String) nameFile));
		} catch (IOException e) {
			e.printStackTrace();
			icon = null;
		}
	}

	/**
	 * @return the movingCost
	 */
	public int getMovingCost() {
		return MovingCost;
	}

	/**
	 * @param movingCost the movingCost to set
	 */
	public void setMovingCost(int movingCost) {
		MovingCost = movingCost;
	}

	public int[][] getTabAround() {
		return tabAround;
	}

	public void setTabAround(int[][] tabAround) {
		this.tabAround = tabAround;
	}

	public int[] getCurrPosition() {
		return currPosition;
	}

	public void setCurrPosition(int[] currPosition) {
		this.currPosition = currPosition;
	}

	public int getNbDeplacement() {
		return nbDeplacement;
	}

	public void setNbDeplacement(int nbDeplacement) {
		this.nbDeplacement = nbDeplacement;
	}

}
