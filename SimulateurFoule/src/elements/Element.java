package elements;

import interfaces.IItem;

public abstract class Element<V> implements IItem<V> {
	/*
	 * Attributs
	 */
	private V position;
	
	/*
	 * Méthodes
	 */
	public V getPosition() {
		return position;
	}
	public void setPosition(V position) {
		this.position = position;
	}
	public V getIcone() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setIcone() {
		// TODO Auto-generated method stub
		
	}
	public V getLeftItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public V getTopLeftItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public V getRigthItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public V getTopRigthItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public V getTopItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public V getBottomLeftItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public V getBottomRigthItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public V getBottomItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
