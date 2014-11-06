import Map.Map;
public class Start {
	public static void main(String[] args) {
		String fichier = "src\\ressource\\map.txt";
		Map oMap = new Map(fichier);
		System.out.println(oMap.lenght);
	}
}
