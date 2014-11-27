import elements.Arrival;
import elements.Mouse;
import Map.Map;

public class Start {
	public static void main(String[] args) {
		/**
		 * TEST FONCTIONNEMENT MAP
		 */
			String fichier = "src\\ressource\\map.txt";
			System.out.println("++++ GENERATION MAP CONSOLE ++++");
			Map oMap = new Map(fichier);
			System.out.println("Nombre Colonnes : "+ oMap.getNbColonne());
			System.out.println("Nombre Lignes : "+ oMap.getNbLigne());
		
		/**
		 * TEST FONCTIONNEMENT DES ENTREES ET SORTIE DES SOURIS AUTOUR DE LA PORTE
		 */
			// AJOUT D'UN OBJET PORTE AVEC INITIALISATION DE SA POSITION
			Arrival oArr = new Arrival();
			int[] currPos = {15,15};
			oArr.setCurrPosition(currPos);
			// TEST SOURIS A LA POSITION HAUT GAUCHE
			Mouse mouse = new Mouse();
			oArr.addMouse(mouse);
			System.out.println("Coordonnée Souris HAUT GAUCHE \n=> X = "+mouse.getCurrPosition()[0] + " Y = " + mouse.getCurrPosition()[1]);
			// TEST SOURIS A LA POSITION HAUT
			Mouse mouse2 = new Mouse();
			oArr.addMouse(mouse2);
			System.out.println("Coordonnée Souris HAUT \n=> X = "+mouse2.getCurrPosition()[0] + " Y = " + mouse2.getCurrPosition()[1]);
			// TEST SOURIS A LA POSITION HAUT DROITE
			Mouse mouse3 = new Mouse();
			oArr.addMouse(mouse3);
			System.out.println("Coordonnée Souris HAUT DROITE \n=> X = "+mouse3.getCurrPosition()[0] + " Y = " + mouse3.getCurrPosition()[1]);
			// TEST SOURIS A LA POSITION DROITE
			Mouse mouse4 = new Mouse();
			oArr.addMouse(mouse4);
			System.out.println("Coordonnée Souris DROITE \n=> X = "+mouse4.getCurrPosition()[0] + " Y = " + mouse4.getCurrPosition()[1]);
			// TEST SOURIS A LA POSITION BAS DROITE
			Mouse mouse5 = new Mouse();
			oArr.addMouse(mouse5);
			System.out.println("Coordonnée Souris BAS DROITE \n=> X = "+mouse5.getCurrPosition()[0] + " Y = " + mouse5.getCurrPosition()[1]);
			// TEST SOURIS A LA POSITION BAS
			Mouse mouse6 = new Mouse();
			oArr.addMouse(mouse6);
			System.out.println("Coordonnée Souris BAS \n=> X = "+mouse6.getCurrPosition()[0] + " Y = " + mouse6.getCurrPosition()[1]);
			// TEST SOURIS A LA POSITION BAS GAUCHE
			Mouse mouse7 = new Mouse();
			oArr.addMouse(mouse7);
			System.out.println("Coordonnée Souris BAS GAUCHE \n=> X = "+mouse7.getCurrPosition()[0] + " Y = " + mouse7.getCurrPosition()[1]);
			
			// ON ENLEVE UNE SOURIS EN METTANT UN OBJET NULL DANS LA LISTE DES SOURIS 
			oArr.getListMouse()[0] = null;
			oArr.getListMouse()[3] = null;
			// ON CHECK LES ELEMENTS AUTOUR DE LA PORTE
			oArr.checkAround();
			// ON AFFICHE LES NOUVELLES PLACES LIBRES ( ICI DEUX A TRUE) 
			for(int u = 0;u<7;u++){
				System.out.println(oArr.getTabPossibility()[u]);
			}
		
	}
}