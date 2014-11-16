package Windows;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import elements.Arrival;
import elements.Door;
import elements.Grass;
import elements.Wall;
import Map.Map;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
 
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
		 for(int y=0;y<mp.totalLineNumber+1;y++){
			 for(int i=0;i<mp.getLineNumber();i++){
				 if(tabCar[i][y] == '\n'){
					 System.out.println("Hello");
				 }
			 }
		 }
		//return tabMap;
	}
}
