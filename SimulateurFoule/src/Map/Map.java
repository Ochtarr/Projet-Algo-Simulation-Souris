package Map;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Map {
	public char[][] mapTab = new char[50][50];
	private boolean isValid = true;
	public int lenght = 0;
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
				int len = lineChar.length-1;
				for(int i=0;i<=len;i++){
					/*
					 * Vérification Mur - partie un  
					 */
					if(cpLine ==0 || cpLine == len){
						for(int y =0;y<=len;y++){
							if(lineChar[y] != '*'){
								isValid = false;
							}
						}
					}
					mapTab[cpLine][cpCol] = lineChar[i];
					this.lenght += 1;
					/*
					 * Vérification Mur - partie deux  
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
				System.out.println("KO - Map non correctement formée");
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
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int mapLenght) {
		this.lenght = mapLenght;
	}
}
