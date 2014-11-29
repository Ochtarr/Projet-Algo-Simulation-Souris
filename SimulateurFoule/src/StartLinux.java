import java.awt.EventQueue;

import map.Map;
import Windows.WindowGameInterface;

public class StartLinux {
	public static void main(String[] args) {
		/**
		 * TEST FONCTIONNEMENT MAP
		 */
		String fichier = "src/ressource/map.txt";
		System.out.println("++++ GENERATION MAP CONSOLE ++++");
		final Map oMap = new Map(fichier);
		System.out.println("Nombre Colonnes : " + oMap.getNbColonne());
		System.out.println("Nombre Lignes : " + oMap.getNbLigne());

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowGameInterface frame = new WindowGameInterface(oMap);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}