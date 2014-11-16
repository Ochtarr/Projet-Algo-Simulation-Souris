package elements;

import interfaces.IElement;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Element implements IElement {

	private int MovingCost;
	private BufferedImage icon;

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

}
