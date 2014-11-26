import elements.Arrival;
import elements.Mouse;
import Map.Map;

public class Start {
	public static void main(String[] args) {
		String fichier = "src\\ressource\\map.txt";
		System.out.println("++++ GENERATION MAP CONSOLE ++++");
		Map oMap = new Map(fichier);
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
		//System.out.println("Nombre Colonnes : "+ oMap.getNbColonne());
		//System.out.println("Nombre Lignes : "+ oMap.getNbLigne());
	}
}