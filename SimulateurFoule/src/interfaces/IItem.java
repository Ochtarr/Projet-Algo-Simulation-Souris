package interfaces;

public interface IItem <V>{
	public V getLeftItem();
	public V getTopLeftItem();
	public V getRigthItem();
	public V getTopRigthItem();
	public V getTopItem();
	public V getBottomLeftItem();
	public V getBottomRigthItem();
	public V getBottomItem();
	public V[] getDirection();
	public void setDirection(V[] direction);
	public V getIcon();
	public void setIcon(V nameFile);
}
