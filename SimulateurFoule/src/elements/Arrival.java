package elements;


public class Arrival extends Element {
	// ATTRIBUTE PRIVATE
	private boolean[] tabPossibility = new boolean[7];
	private Mouse[] listMouse = new Mouse[7];
			
	//  CONSTRUCTOR
	public Arrival(){
		this.setNbDeplacement(0);
		initializeTabPos();
	}
	// Reinitialise le tableau de boolean de disponibilite
	public void checkAround(){
		int[] posNull = {0,0};
		int i = 0;
		for(Mouse m : listMouse){
			if(m == null){
				this.tabPossibility[i] = true;
			}
			i++;
		}
	}
	// FONCTIONS ET PROCEDURE
	public boolean[] getTabPossibility() {
		return tabPossibility;
	}
	public void setTabPossibility(boolean[] tab) {
		tabPossibility = tab;
	}
	public void initializeTabPos(){
		for(int i=0;i<7;i++){
			this.tabPossibility[i] = true;
		}
	}
	public int getPositionAccept(boolean[] tab){
		for(int i=0;i<7;i++){
			if(this.tabPossibility[i] == true){
				return i;
			}
		}
		return -1;
	}
	public void placeMouse(Mouse mo,int positionAccept){
		int[] tmpPos = new int[2];
		switch(positionAccept){
		case 0: 
			// CAS DU HAUT GAUCHE
			tmpPos[0] = this.getCurrPosition()[0]-1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]-1; //       Y position
			mo.setCurrPosition(tmpPos);
			this.tabPossibility[0] = false;
			listMouse[0] = mo;
			break;
		case 1: 
			// CAS DU HAUT
			tmpPos[0] = this.getCurrPosition()[0]+0; //       X position
			tmpPos[1] = this.getCurrPosition()[1]-1; //       Y position
			mo.setCurrPosition(tmpPos);
			this.tabPossibility[1] = false;
			listMouse[1] = mo;
			 break;
		case 2: 
			// CAS DU HAUT DROIT
			tmpPos[0] = this.getCurrPosition()[0]+1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]-1; //       Y position
			mo.setCurrPosition(tmpPos);
			this.tabPossibility[2] = false;
			listMouse[2] = mo;
			 break;
		case 3: 
			// CAS DU DROIT
			tmpPos[0] = this.getCurrPosition()[0]+1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+0; //       Y position
			mo.setCurrPosition(tmpPos);
			this.tabPossibility[3] = false;
			listMouse[3] = mo;
			break;
		case 4: 
			// CAS DU BAS DROIT
			tmpPos[0] = this.getCurrPosition()[0]+1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+1; //       Y position
			mo.setCurrPosition(tmpPos);
			this.tabPossibility[4] = false;
			listMouse[4] = mo;
			break;
		case 5: 
			// CAS DU BAS
			tmpPos[0] = this.getCurrPosition()[0]+0; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+1; //       Y position
			mo.setCurrPosition(tmpPos);
			this.tabPossibility[5] = false;
			listMouse[5] = mo;
			break;
		case 6: 
			// CAS DU BAS GAUCHE
			tmpPos[0] = this.getCurrPosition()[0]-1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+1; //       Y position
			mo.setCurrPosition(tmpPos);
			this.tabPossibility[6] = false;
			listMouse[6] = mo;
			 break;
		case 7: 
			// CAS GAUCHE
			tmpPos[0] = this.getCurrPosition()[0]-1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+0; //       Y position
			mo.setCurrPosition(tmpPos);
			this.tabPossibility[7] = false;
			listMouse[7] = mo;
			break;
		default: System.out.println("Error placeMouse"); break;
		}
	}
	public int addMouse(Mouse mo){
		if(getPositionAccept(this.tabPossibility) == -1){
			System.out.println("Il n'y a plus de place");
			return -1;
		}else{
			// Envoi de l'objet souris a la position libre
			placeMouse(mo,getPositionAccept(this.tabPossibility));
			return 1;
		}
		
	}
	public Mouse[] getListMouse() {
		return listMouse;
	}
	public void setListMouse(Mouse[] listMouse) {
		this.listMouse = listMouse;
	}
}
