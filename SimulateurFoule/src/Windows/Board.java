package Windows;

import javax.swing.JPanel;
import Map.Map;
 
enum Tile {
	Road,Wall,Grass,Cheese,Door,Mouse
}
public class Board extends JPanel{
	private static final int twidth = 26; // tile width
	private static final int theight = 26; // tile height
	private Tile[][] map;
	public void generateGraphicMap(Map mp){
		 
	}
	public void initializeTileMap(Map mp){
		 Tile tabMap[][] = new Tile[50][50];
		 char[][] tabCar = mp.getMapTab();
		 for(int y=0;y<mp.getNbColonne()+1;y++){
			 for(int i=0;i<mp.nbLigne;i++){
				 if(tabCar[i][y] == '\n'){
					 System.out.println("Hello");
				 }
			 }
		 }
		//return tabMap;
	}
}
