import elements.Arrival;
import Map.Map;

public class StartLinux {
	public static void main(String[] args) {
		String fichier = "src/ressource/map.txt";
		System.out.println("++++ GENERATION MAP CONSOLE ++++");
		Map oMap = new Map(fichier);
	}
}