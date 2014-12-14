package elements;

public class Wall extends Element{
	public Wall(){
		this.setLabel("wall");
		this.setMovingCost(0);
		this.setAccessible(false);
	}
}
