package positionnement;

import interfaces.IPosition;

public class Position implements IPosition{
	
	private int x;
	private int y;

	public Position(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = x;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y = y;
	}

}
