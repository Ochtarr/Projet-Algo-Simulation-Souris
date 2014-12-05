package Windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Map.Map;

public class LinuxWindowGameInterface extends JFrame {
	
	// Appel du fichier Texte
	private static String fichier = "Projet-Algo-Simulation-Souris\\SimulateurFoule\\src\\ressource\\map.txt";
	// Cr�ation d'un objet Map avec le fichier en param�tre
	public static Map oMap = new Map(fichier);
	private JPanel contentPane;
	public static JPanel panel_plateau = new JPanel();
	private JTextField textField_Porte1;
	private JTextField textField_Porte2;
	private JTextField textField_Vitesse;

	//Main temporaire pour tester la vue
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinuxWindowGameInterface frame = new LinuxWindowGameInterface(oMap);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LinuxWindowGameInterface(Map mp) {
		
		setTitle("Mouse Run");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Dimension du bouton Lancer
	    int width = 150;
	    int height = 40;
	    Dimension dim = new Dimension(width, height);
	    
		//Dimension des zone de textes
	    int width_text = 1;
	    int height_text = 30;
	    Dimension dim_text = new Dimension(width_text, height_text);
	    
	    
		//Jpanel affichage plateau de jeu
		panel_plateau.setBackground(Color.WHITE);
		contentPane.add(panel_plateau, BorderLayout.CENTER);
		
		// Initialisation de la map avec images
		Windows.Board.initializeTileMap(mp);
				
		//Jpanel pour les informations
		JPanel panel_infos = new JPanel();
		panel_infos.setBackground(new Color(222, 184, 135));
		contentPane.add(panel_infos, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_infos = new GridBagLayout();
		gbl_panel_infos.columnWidths = new int[]{0, 0, 0};
		gbl_panel_infos.rowHeights = new int[] {0, 0, 0};
		gbl_panel_infos.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_infos.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_infos.setLayout(gbl_panel_infos);
		
			//Jpanel avec affichage des informations/scores
			JPanel panel_score = new JPanel();
			panel_score.setBackground(new Color(210, 180, 140));
			GridBagConstraints gbc_panel_score = new GridBagConstraints();
			gbc_panel_score.ipadx = 1;
			gbc_panel_score.ipady = 30;
			gbc_panel_score.fill = GridBagConstraints.BOTH;
			gbc_panel_score.gridx = 0;
			gbc_panel_score.gridy = 0;
			panel_infos.add(panel_score, gbc_panel_score);
			GridBagLayout gbl_panel_score = new GridBagLayout();
			gbl_panel_score.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel_score.rowHeights = new int[] {0, 0, 0};
			gbl_panel_score.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_score.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			panel_score.setLayout(gbl_panel_score);
			
				//Label pour le TOUR
				JLabel label_Tour = new JLabel("TOUR : ");
				label_Tour.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_label_Tour = new GridBagConstraints();
				gbc_label_Tour.weighty = 1.0;
				gbc_label_Tour.insets = new Insets(0, 10, 0, 5);
				gbc_label_Tour.gridx = 0;
				gbc_label_Tour.gridy = 1;
				panel_score.add(label_Tour, gbc_label_Tour);
				
				//Label pour afficher l'information sur le tour
				//Mis � 1 de base pour test, a changer plus tard avec les donn�es dynamiques
				JLabel label_Info_Tour = new JLabel("0");
				label_Info_Tour.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_label_Info_Tour = new GridBagConstraints();
				gbc_label_Info_Tour.insets = new Insets(0, 0, 0, 5);
				gbc_label_Info_Tour.gridx = 1;
				gbc_label_Info_Tour.gridy = 1;
				panel_score.add(label_Info_Tour, gbc_label_Info_Tour);
				
				//Label pour les DEPLACEMENTS
				JLabel label_Deplacements = new JLabel("DEPLACEMENTS :");
				label_Deplacements.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_label_Deplacements = new GridBagConstraints();
				gbc_label_Deplacements.insets = new Insets(0, 10, 0, 5);
				gbc_label_Deplacements.gridx = 3;
				gbc_label_Deplacements.gridy = 1;
				panel_score.add(label_Deplacements, gbc_label_Deplacements);
				
				//Label pour afficher l'information sur le deplacements total
				//Mis � 30 de base pour test, a changer plus tard avec les donn�es dynamiques
				JLabel label_Info_Deplacements = new JLabel("0");
				label_Info_Deplacements.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_label_Info_Deplacements = new GridBagConstraints();
				gbc_label_Info_Deplacements.insets = new Insets(0, 0, 0, 5);
				gbc_label_Info_Deplacements.gridx = 4;
				gbc_label_Info_Deplacements.gridy = 1;
				panel_score.add(label_Info_Deplacements, gbc_label_Info_Deplacements);
				
				//Label pour les souris en deplacements
				JLabel lblSourisEnDeplacement = new JLabel("SOURIS EN DEPLACEMENT :");
				lblSourisEnDeplacement.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_lblSourisEnDeplacement = new GridBagConstraints();
				gbc_lblSourisEnDeplacement.insets = new Insets(0, 10, 0, 5);
				gbc_lblSourisEnDeplacement.gridx = 6;
				gbc_lblSourisEnDeplacement.gridy = 1;
				panel_score.add(lblSourisEnDeplacement, gbc_lblSourisEnDeplacement);
				
				//Label pour afficher l'information sur le nombre de souris en deplacements
				//Mis � 4 de base pour test, a changer plus tard avec les donn�es dynamiques
				JLabel label_Info_Souris_En_Deplacement = new JLabel("0");
				label_Info_Souris_En_Deplacement.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_label_Info_Souris_En_Deplacement = new GridBagConstraints();
				gbc_label_Info_Souris_En_Deplacement.insets = new Insets(0, 0, 0, 5);
				gbc_label_Info_Souris_En_Deplacement.gridx = 7;
				gbc_label_Info_Souris_En_Deplacement.gridy = 1;
				panel_score.add(label_Info_Souris_En_Deplacement, gbc_label_Info_Souris_En_Deplacement);
				
				//Label pour le nombre de souris arriv�es
				JLabel label_Souris_Arrivees = new JLabel("SOURIS ARRIVEES :");
				label_Souris_Arrivees.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_label_Souris_Arrivees = new GridBagConstraints();
				gbc_label_Souris_Arrivees.insets = new Insets(0, 10, 0, 5);
				gbc_label_Souris_Arrivees.gridx = 9;
				gbc_label_Souris_Arrivees.gridy = 1;
				panel_score.add(label_Souris_Arrivees, gbc_label_Souris_Arrivees);
				
				//Label pour afficher l'information sur le nombre de souris arriv�es
				//Mis � 2 de base pour test, a changer plus tard avec les donn�es dynamiques
				JLabel label_Info_Souris_Arrivee = new JLabel("0");
				label_Info_Souris_Arrivee.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_label_Info_Souris_Arrivee = new GridBagConstraints();
				gbc_label_Info_Souris_Arrivee.gridx = 10;
				gbc_label_Info_Souris_Arrivee.gridy = 1;
				panel_score.add(label_Info_Souris_Arrivee, gbc_label_Info_Souris_Arrivee);
			
			//Jpanel pour l'affichage des informations li� au jeu et au bouton Lancer
			JPanel panel_lancer = new JPanel();
			panel_lancer.setBackground(new Color(205, 133, 63));
			GridBagConstraints gbc_panel_lancer = new GridBagConstraints();
			gbc_panel_lancer.fill = GridBagConstraints.BOTH;
			gbc_panel_lancer.gridx = 1;
			gbc_panel_lancer.gridy = 0;
			panel_infos.add(panel_lancer, gbc_panel_lancer);
			GridBagLayout gbl_panel_lancer = new GridBagLayout();
			gbl_panel_lancer.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel_lancer.rowHeights = new int[]{0, 0, 0};
			gbl_panel_lancer.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_lancer.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			panel_lancer.setLayout(gbl_panel_lancer);
			
				//Label pour la PORTE1
				JLabel lblPorte = new JLabel("PORTE 1");
				GridBagConstraints gbc_lblPorte = new GridBagConstraints();
				gbc_lblPorte.insets = new Insets(10, 0, 0, 5);
				gbc_lblPorte.gridx = 0;
				gbc_lblPorte.gridy = 0;
				panel_lancer.add(lblPorte, gbc_lblPorte);
				
				//Champ text pour nombre de souris PORTE1
				textField_Porte1 = new JTextField();
				//Texte de base pour test avant l'affichage dynamique
				textField_Porte1.setText("1");
				GridBagConstraints gbc_textField_Porte1 = new GridBagConstraints();
				gbc_textField_Porte1.insets = new Insets(0, 5, 0, 0);
				gbc_textField_Porte1.weighty = 1.0;
				gbc_textField_Porte1.weightx = 1.0;
				gbc_textField_Porte1.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_Porte1.gridx = 0;
				gbc_textField_Porte1.gridy = 1;
				panel_lancer.add(textField_Porte1, gbc_textField_Porte1);
				textField_Porte1.setColumns(5);
				textField_Porte1.setPreferredSize(dim_text);
				
				//Label pour la PORTE2
				JLabel label_Porte2 = new JLabel("PORTE 2");
				GridBagConstraints gbc_label_Porte2 = new GridBagConstraints();
				gbc_label_Porte2.insets = new Insets(10, 0, 0, 5);
				gbc_label_Porte2.gridx = 2;
				gbc_label_Porte2.gridy = 0;
				panel_lancer.add(label_Porte2, gbc_label_Porte2);
				
				//Champ text pour nombre de souris PORTE2
				textField_Porte2 = new JTextField();
				//Texte de base pour test avant l'affichage dynamique
				textField_Porte2.setText("1");
				GridBagConstraints gbc_textField_Porte2 = new GridBagConstraints();
				gbc_textField_Porte2.weighty = 1.0;
				gbc_textField_Porte2.weightx = 1.0;
				gbc_textField_Porte2.insets = new Insets(0, 5, 0, 5);
				gbc_textField_Porte2.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_Porte2.gridx = 2;
				gbc_textField_Porte2.gridy = 1;
				panel_lancer.add(textField_Porte2, gbc_textField_Porte2);
				textField_Porte2.setColumns(5);
				textField_Porte2.setPreferredSize(dim_text);
				
				//Label pour la VITESSE
				JLabel lblVitesse = new JLabel("VITESSE");
				GridBagConstraints gbc_lblVitesse = new GridBagConstraints();
				gbc_lblVitesse.insets = new Insets(10, 0, 0, 5);
				gbc_lblVitesse.gridx = 4;
				gbc_lblVitesse.gridy = 0;
				panel_lancer.add(lblVitesse, gbc_lblVitesse);
				
				//Champ text pour la vitesse des souris
				textField_Vitesse = new JTextField();
				//Texte de base pour test avant l'affichage dynamique
				textField_Vitesse.setText("300");
				GridBagConstraints gbc_textField_Vitesse = new GridBagConstraints();
				gbc_textField_Vitesse.weighty = 1.0;
				gbc_textField_Vitesse.weightx = 1.0;
				gbc_textField_Vitesse.insets = new Insets(0, 5, 0, 5);
				gbc_textField_Vitesse.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_Vitesse.gridx = 4;
				gbc_textField_Vitesse.gridy = 1;
				panel_lancer.add(textField_Vitesse, gbc_textField_Vitesse);
				textField_Vitesse.setColumns(5);
				textField_Vitesse.setPreferredSize(dim_text);
				
				//Bouton Lancer le jeu
				JButton btn_Lancer = new JButton("LANCER");
				btn_Lancer.setForeground(new Color(255, 255, 255));
				btn_Lancer.setBackground(new Color(139, 69, 19));
				btn_Lancer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

					}
				});
				GridBagConstraints gbc_btn_Lancer = new GridBagConstraints();
				gbc_btn_Lancer.insets = new Insets(0, 10, 10, 10);
				gbc_btn_Lancer.gridx = 6;
				gbc_btn_Lancer.gridy = 1;
				panel_lancer.add(btn_Lancer, gbc_btn_Lancer);
				btn_Lancer.setPreferredSize(dim);
	}

}
