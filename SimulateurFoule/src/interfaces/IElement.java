package interfaces;

import java.awt.image.BufferedImage;

public interface IElement{

	public BufferedImage getIcon();
	
	public void setIcon(String nameFile);
	
	public int getMovingCost();
	
	public void setMovingCost(int movingCost);
}
