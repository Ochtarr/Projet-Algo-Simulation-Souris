import elements.Arrival;
import map.Map;

public class StartLinux {
	public static void main(String[] args) {
		String fichier = "src/ressource/map.txt";
		System.out.println("++++ GENERATION MAP CONSOLE ++++");
		Map oMap = new Map(fichier);
		/*
		Arrival oArr = new Arrival();
		System.out.println(oArr.addMouse());
		System.out.println("Nombre Colonnes : "+ oMap.getNbColonne());
		System.out.println("Nombre Lignes : "+ oMap.getNbLigne());
		*/
	}
}