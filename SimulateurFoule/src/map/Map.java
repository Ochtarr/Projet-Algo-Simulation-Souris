package Map;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

enum Tile {
	Road,Wall,Grass,Cheese,Door,Mouse
}
public class Map {
	public char[][] mapTab = new char[50][50];
	private boolean isValid = true;
	public int totalCaractere = 0;
	private int nbColonne;
	public int nbLigne = 0;
	/*
	 * Constructeur de la map
	 */
	public Map(String file){
		setNbLigne(getNumberLine(file));
		// Declaration Attributs
		String chaine="";
		String ligne;
		int cpLine = 0;
		int cpCol = 0;
		try{
			InputStream ips=new FileInputStream(file); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			while ((ligne=br.readLine())!=null){
				char[] lineChar = ligne.toCharArray();
				int len = lineChar.length-1;
				setNbColonne(len);
				for(int i=0;i<=len;i++){
					/*
					 * Verification Mur - partie un  
					 */
					if(cpLine ==0 || this.nbLigne-1 == cpLine){
						for(int y =0;y<=len;y++){
							if(lineChar[y] != '*'){
								isValid = false;
							}
						}
					}
					mapTab[cpLine][cpCol] = lineChar[i];
					this.totalCaractere += 1;
					/*
					 * Verification Mur - partie deux  
					 */
					if(lineChar[0] != '*' || lineChar[len] != '*'){
						isValid = false;
					}
					System.out.print(mapTab[cpLine][cpCol]);
					cpCol++;
				}
				System.out.println("");
				cpCol = 0;
				cpLine++;
				chaine+=ligne;
			}
			if(this.isValid()){
				System.out.println("Initialisation de la Map - OK");
			}else{
				System.out.println("KO - Map non correctement formee");
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println("KO - Initialisation de la Map ");
			System.out.println(e.toString());
		}
	}
	/*
	 * Recuperer la Map
	 * return char[][]
	 */
	public char[][] getMapTab(){
		return mapTab;
	}
	/*
	 * Creer une nouvelle Map
	 */
	public void setMapTab(String file){
		new Map(file);
	}
	/*
	 * Verifie si la carte est bien formee
	 * return Boolean
	 */
	protected boolean isValid(){
		return isValid;
	}
	/*
	 * Recupere le nombre d'elements dans le tableau
	 * Return Int
	 */
	public int getTotalCaractere() {
		return totalCaractere;
	}
	/*
	 * Renvoi tous les caractères de la map
	 */
	protected void setTotalCaractere(int mapLenght) {
		this.totalCaractere = mapLenght;
	}
	/*
	 * Retourne le nombre de colonnes
	 */
	public int getNbColonne() {
		return nbColonne;
	}
	public void setNbColonne(int nbCara) {
		this.nbColonne = nbCara;
	}
	public int getNbLigne() {
		return this.nbLigne;
	}
	public void setNbLigne(int nb){
		this.nbLigne = nb;
	}
	/*
	 * Setter Colonnes
	 */
	protected void setTotalLineNumber(int nbColonne) {
		this.nbColonne = nbColonne;
	}
	/*
	 * Recupere le nombre de ligne du fichier
	 * Return Int
	 */
	public int getNumberLine(String f){
		try{
			InputStream ips=new FileInputStream(f); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			
			String ligne;
			int nbLine = 0;
			while ((ligne=br.readLine())!=null){
				nbLine++;
			}
			return nbLine;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}
