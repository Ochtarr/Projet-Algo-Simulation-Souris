package Windows;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import Map.Map;
import elements.Arrival;
import elements.Door;
import elements.Grass;
import elements.Wall;

@SuppressWarnings("serial")
public class Board extends JPanel{
	
	/**
	 * Default constructor
	 */
	public Board(){
	}
	
	public void generateGraphicMap(Graphics g,Map mp){
		int j = 0, r = 0;
		  char[][] tmpMap = mp.getMapTab();
		  for(int y=0;y<mp.lenght;y++){
		      for(int i = 0; i < mp.lenght; i++){
		          if(tmpMap[y][i] == '*') {
		        	  Wall wl = new Wall();
		              g.drawImage((Image)wl.getIcon(), j*21, r*21, this);
		              System.out.println("MUR : i, " + i + " j, " + j + " r, " + r);
		          }else if(tmpMap[y][i] == 'A'){
		        	  Arrival al = new Arrival();
		              g.drawImage((Image)al.getIcon(), j*21, r*21, this);
		              System.out.println("FROMAGE : i, " + i + " j, " + j + " r, " + r);
		          }else if(tmpMap[y][i] == 'D'){
		        	  Door dr = new Door();
		              g.drawImage((Image)dr.getIcon(), j*21, r*21, this);
		              System.out.println("PORTE : i, " + i + " j, " + j + " r, " + r);
		          }else if(tmpMap[y][i] == 'G'){
		        	  Grass gs = new Grass();
		              g.drawImage((Image)gs.getIcon(), j*21, r*21, this);
		              System.out.println("HERBE : i, " + i + " j, " + j + " r, " + r);
		          }else{
		        	  
		          }
		          r++;
		          j++;
			}
		  } 
	}
}
