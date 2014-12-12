package positionnement;

import interfaces.IPosition;

public class Position implements IPosition{
	
	private int x;
	private int y;
	
	public Position() {
		// TODO Auto-generated constructor stub
	}

	public Position(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
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
	
	public String toString(){
		return "x:"+ this.getX() + "/y:" + this.getY();
	}

}
