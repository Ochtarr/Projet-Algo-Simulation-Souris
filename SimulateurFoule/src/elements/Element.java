package elements;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import interfaces.IItem;

public abstract class Element<V> implements IItem<V> {
	/*
	 * Attributs
	 */
	private V position;
	private V icon;
	private V[] direction;
	
	/*
	 * Méthodes
	 */
	public V getPosition() {
		return (V)position;
	}
	public void setPosition(V position) {
		this.position = position;
	}
	public V getIcon() {
		return icon;
	}
	public void setIcon(V nameFile) {
		try {
			icon =  (V)ImageIO.read(new File((String)nameFile));
		} catch (IOException e) {
			e.printStackTrace();
			icon = null;
		}
	}
	public V getLeftItem() {
		return null;
	}
	public V getTopLeftItem() {
		return null;
	}
	public V getRigthItem() {
		return null;
	}
	public V getTopRigthItem() {
		return null;
	}
	public V getTopItem() {
		return null;
	}
	public V getBottomLeftItem() {
		return null;
	}
	public V getBottomRigthItem() {
		return null;
	}
	public V getBottomItem() {
		return null;
	}
	public V[] getDirection() {
		return (V[])direction;
	}
	public void setDirection(V[] direction) {
		this.direction = direction;
	}
}
