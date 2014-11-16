import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Map {
	public char[][] mapTab = new char[255][255];
	private boolean isValid = true;
	/*
	 * Constructeur de la map
	 */
	public Map(String file){
		String chaine="";
		try{
			InputStream ips=new FileInputStream(file); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			int cpLine = 0;
			int cpCol = 0;
			while ((ligne=br.readLine())!=null){
				char[] lineChar = ligne.toCharArray();	
				for(int i=0;i<lineChar.length;i++){
					mapTab[cpLine][cpCol] = lineChar[i];
					// Vérification ligne de mur
					if(mapTab[0][cpCol] != '*'){
						isValid = false;
						break;
					}
					if(mapTab[cpLine][0] != '*'){
						isValid = false;
						break;
					}
					if(cpLine == 0){
						if(lineChar[i] != '*' || lineChar[lineChar.length-1] != '*'){
							isValid = false;
							break;
						}
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
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println("KO - Initialisation de la Map ");
			System.out.println(e.toString());
		}
	}
	/*
	 * Récupérer la map
	 */
	public char[][] getMapTab(){
		return mapTab;
	}
	/*
	 * Créer une nouvelle Map
	 */
	public void setMapTab(String file){
		new Map(file);
	}
	public boolean isValid(){
		return isValid;
	}
}
