package elements;

public class Arrival extends Element {
	// ATTRIBUTE PRIVATE
	private boolean[] tabPossibility = new boolean[7];
	
	//  CONSTRUCTOR
	public Arrival(){
		this.setNbDeplacement(0);
		initializeTabPos();
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
		int[] tmpPos = new int[1];
		switch(positionAccept){
		case 0: {
			// CAS DU HAUT GAUCHE
			tmpPos[0] = this.getCurrPosition()[0]-1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]-1; //       Y position
			mo.setCurrPosition(tmpPos);
		}
		case 1: {
			// CAS DU HAUT
			tmpPos[0] = this.getCurrPosition()[0]+0; //       X position
			tmpPos[1] = this.getCurrPosition()[1]-1; //       Y position
			mo.setCurrPosition(tmpPos);
		}
		case 2: {
			// CAS DU HAUT DROIT
			tmpPos[0] = this.getCurrPosition()[0]+1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]-1; //       Y position
			mo.setCurrPosition(tmpPos);
		}
		case 3: {
			// CAS DU DROIT
			tmpPos[0] = this.getCurrPosition()[0]+1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+0; //       Y position
			mo.setCurrPosition(tmpPos);
		}
		case 4: {
			// CAS DU BAS DROIT
			tmpPos[0] = this.getCurrPosition()[0]+1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+1; //       Y position
			mo.setCurrPosition(tmpPos);
		}
		case 5: {
			// CAS DU BAS
			tmpPos[0] = this.getCurrPosition()[0]+0; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+1; //       Y position
			mo.setCurrPosition(tmpPos);
		}
		case 6: {
			// CAS DU BAS GAUCHE
			tmpPos[0] = this.getCurrPosition()[0]-1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+1; //       Y position
			mo.setCurrPosition(tmpPos);
		}
		case 7: {
			// CAS GAUCHE
			tmpPos[0] = this.getCurrPosition()[0]-1; //       X position
			tmpPos[1] = this.getCurrPosition()[1]+0; //       Y position
			mo.setCurrPosition(tmpPos);
		}
		default: System.out.println("Error placeMouse"); break;
		}
		tabPossibility[positionAccept] = false;
	}
	public int addMouse(){
		if(getPositionAccept(this.tabPossibility) == -1){
			System.out.println("Il n'y a plus de place");
			return -1;
		}else{
			Mouse mo = new Mouse();
			// Envoi de l'objet souris a la position libre
			placeMouse(mo,getPositionAccept(this.tabPossibility));
			
			return 1;
		}
		
	}
}
