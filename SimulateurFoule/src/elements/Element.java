package elements;

import interfaces.IItem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import positionnement.Position;

public abstract class Element implements IItem {

	private int MovingCost;
	private Position position;
	private BufferedImage icon;
	private Position[] direction;

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
	 * @return Position of each current node's neighbors
	 */
	public Position[] getDirection() {
		return this.direction;
	}

	/**
	 * @param direction - Set Position of each current node's neighbors
	 */
	public void setDirection(Position[] direction) {
		this.direction = direction;
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

	public <V> V getLeftItem() {
		return null;
	}

	public <V> V getTopLeftItem() {
		return null;
	}

	public <V> V getRigthItem() {
		return null;
	}

	public <V> V getTopRigthItem() {
		return null;
	}

	public <V> V getTopItem() {
		return null;
	}

	public <V> V getBottomLeftItem() {
		return null;
	}

	public <V> V getBottomRigthItem() {
		return null;
	}

	public <V> V getBottomItem() {
		return null;
	}

}
