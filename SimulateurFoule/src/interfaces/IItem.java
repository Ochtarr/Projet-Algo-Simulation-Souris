package interfaces;

import java.awt.image.BufferedImage;

import positionnement.Position;

public interface IItem{
	public <V> V getLeftItem();
	public <V> V getTopLeftItem();
	public <V> V getRigthItem();
	public <V> V getTopRigthItem();
	public <V> V getTopItem();
	public <V> V getBottomLeftItem();
	public <V> V getBottomRigthItem();
	public <V> V getBottomItem();
	
	public Position[] getDirection();
	
	public void setDirection(Position[] direction);
	
	public BufferedImage getIcon();
	
	public void setIcon(String nameFile);
	
	public Position getPosition();
	
	public void setPosition(Position p);
	
	public int getMovingCost();
	
	public void setMovingCost(int movingCost);
}
