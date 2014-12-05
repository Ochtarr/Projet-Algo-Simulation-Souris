package Windows;

import java.awt.Container;

public class RefreshMap extends Thread{
	private Container currJFrame;
	
	public RefreshMap(Container jFrame){
		this.currJFrame=jFrame;
		start();
	}
	public void run(){
		try{
			currJFrame.repaint();
			sleep(40);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
