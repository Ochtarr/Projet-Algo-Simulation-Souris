package Windows;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import elements.Arrival;
import elements.Cheese;
import elements.Element;
import elements.Grass;
import elements.Ground;
import elements.Mouse;
import elements.Wall;
import Map.Map;

public class Board extends JPanel {
	private ArrayList<Element> listElement = new ArrayList<Element>();

	// Jpanel pour l'affichage de la map
	private JPanel maCarte = new JPanel();
	private GridBagLayout gridMap = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();	
	private Map tmpMap;
	public void initializeTileMap(Map mp) {
		
		char[][] tabCar = mp.getMapTab();
		tmpMap = mp;

		maCarte.setBackground(Color.WHITE);
		
		maCarte.setLayout(gridMap);
	
		// Test des valeurs recupere
		System.out.println(tabCar[0][1]);
		System.out.println(mp.getNbColonne()+1);
		System.out.println (mp.getNbLigne());
		
		// Parcour du tableau et affectation des images sur les cellules du GridLayout
		for (int y = 0; y < mp.getNbColonne() + 1 ; y++) {
			for (int i = 0; i < mp.getNbLigne(); i++) {
				System.out.println("Valeur X ="+i);
				System.out.println("Valeur Y ="+i);
				if (tabCar[i][y] == '*') {
					gbc.gridx = y;
					gbc.gridy = i;
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.mur));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					int[] currPos = {i,y};
					Wall wa = new Wall();
					wa.setCurrPosition(currPos);
					listElement.add(wa);
				}
				if (tabCar[i][y] == 'F') {
					gbc.gridx = y;
					gbc.gridy = i;
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.route));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					int[] currPos = {i,y};
					Ground gd = new Ground();
					gd.setCurrPosition(currPos);
					listElement.add(gd);
					
				}
				if (tabCar[i][y] == 'G') {
					gbc.gridx = y;
					gbc.gridy = i;
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.herbe));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					int[] currPos = {i,y};
					Grass gs = new Grass();
					gs.setCurrPosition(currPos);
					listElement.add(gs);
				}
				if (tabCar[i][y] == 'D') {
					gbc.gridx = y;
					gbc.gridy = i;
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.porte));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					int[] currPos = {i,y};
					Arrival al = new Arrival();
					al.setCurrPosition(currPos);
					listElement.add(al);
				}
				if (tabCar[i][y] == 'A') {
					gbc.gridx = y;
					gbc.gridy = i;
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.fromage));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					int[] currPos = {i,y};
					Cheese ce = new Cheese();
					ce.setCurrPosition(currPos);
					listElement.add(ce);
				}
			}
		}
	}
	public void paintSouris(Mouse mo){
		int x = mo.getCurrPosition()[1];
		int y = mo.getCurrPosition()[0];
		System.out.println("Position X DE LA SOURIS= "+x);
		System.out.println("Position Y DE LA SOURIS = "+y);
		gbc.gridx = x;
		gbc.gridy = y;
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.souris));
		gridMap.setConstraints(maCarte, gbc);
		maCarte.add(lblNewLabel, gbc);
		
		listElement.add(mo);
	}
	public JPanel getMaCarte() {
		return maCarte;
	}
	public void setMaCarte(JPanel maCarte) {
		this.maCarte = maCarte;
	}
	public ArrayList<Element> getListElement() {
		return listElement;
	}
	public void setListElement(ArrayList<Element> listElement) {
		this.listElement = listElement;
	}
}
