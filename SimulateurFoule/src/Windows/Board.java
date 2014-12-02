package Windows;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import map.Map;

public class Board extends JPanel {

	public static void initializeTileMap(Map mp) {
		
		char[][] tabCar = mp.getMapTab();
		
		// Jpanel pour l'affichage de la map
		JPanel maCarte = new JPanel();
		maCarte.setBackground(Color.PINK);
		GridBagLayout gridMap = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();	
		maCarte.setLayout(gridMap);
	
		// Test des valeurs r�cup�r�
		System.out.println(tabCar[0][1]);
		System.out.println(mp.getNbColonne()+1);
		System.out.println (mp.getNbLigne());
		
		// Parcour du tableau et affectation des images sur les cellules du GridLayout
		for (int y = 0; y < mp.getNbColonne() + 1 ; y++) {
			for (int i = 0; i < mp.getNbLigne(); i++) {
				if (tabCar[i][y] == '*') {
					
					gbc.gridx = y;
					gbc.gridy = i;
					gbc.gridwidth = 1;
					gbc.gridheight = 1;
					gbc.fill = GridBagConstraints.BOTH;
					gbc.weightx = 1;
					gbc.weighty = 1;
							
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.mur));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					
				}
				if (tabCar[i][y] == ' ') {
					
					gbc.gridx = y;
					gbc.gridy = i;
					gbc.gridwidth = 1;
					gbc.gridheight = 1;
					gbc.fill = GridBagConstraints.BOTH;
					gbc.weightx = 1;
					gbc.weighty = 1;
					
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.route));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					
				}
				if (tabCar[i][y] == 'G') {
					
					gbc.gridx = y;
					gbc.gridy = i;
					gbc.gridwidth = 1;
					gbc.gridheight = 1;
					gbc.fill = GridBagConstraints.BOTH;
					gbc.weightx = 1;
					gbc.weighty = 1;
					
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.herbe));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					
				}
				if (tabCar[i][y] == 'D') {
					
					gbc.gridx = y;
					gbc.gridy = i;
					gbc.gridwidth = 1;
					gbc.gridheight = 1;
					gbc.fill = GridBagConstraints.BOTH;
					gbc.weightx = 1;
					gbc.weighty = 1;
					
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.porte));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					
				}
				if (tabCar[i][y] == 'A') {
					
					gbc.gridx = y;
					gbc.gridy = i;
					gbc.gridwidth = 1;
					gbc.gridheight = 1;
					gbc.fill = GridBagConstraints.BOTH;
					gbc.weightx = 1;
					gbc.weighty = 1;
					
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setIcon(new ImageIcon(interfaces.LinuxGestionImages.fromage));
					gridMap.setConstraints(maCarte, gbc);
					maCarte.add(lblNewLabel, gbc);
					
				}
			}
		}
	    WindowGameInterface.panel_plateau.add(maCarte);
	}
}
