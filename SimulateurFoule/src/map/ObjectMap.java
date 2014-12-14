package map;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

import elements.Cheese;
import elements.Door;
import elements.Element;
import elements.Grass;
import elements.Ground;
import elements.Wall;

import positionnement.Position;

public class ObjectMap {

	private HashMap<Position, Element> map;
	private Iterator<Element> iteratorCollectionMap;
	private int nbLigne;
	private int nbColonne;
	private int capacity;
	
	/**
	 * Constructs map 
	 * @param tbCharMap
	 * @param nbLigne
	 * @param nbColonne
	 */
	public ObjectMap(Map tbCharMap, int nbLigne, int nbColonne){
		this.nbColonne = nbColonne;
		this.nbLigne = nbLigne;
		this.capacity = nbLigne*nbColonne;
		this.map = new HashMap<Position, Element>(capacity);
		for(int i=0; i<tbCharMap.getNbLigne(); i++){
			for(int j=0; j<tbCharMap.getNbColonne(); j++){
				switch(tbCharMap.getMapTab()[i][j]){
					case '*':
						Wall wall = new Wall();
						this.map.put(new Position(i,j), wall);
						
					case 'F':
						Ground ground = new Ground();
						this.map.put(new Position(i,j), ground);
						
					case 'G':
						Grass grass = new Grass();
						this.map.put(new Position(i,j), grass);
						
					case 'D':
						Door door = new Door();
						this.map.put(new Position(i,j), door);
						
					case 'A':
						Cheese cheese = new Cheese();
						this.map.put(new Position(i,j), cheese);
				}
			}
		}
	}
	
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Update current map and set giving new element at specified position
	 * @param position position to replace
	 * @param elementARemplacer element which replace
	 * @return elementRemplace element which was at this position
	 */
	public Element updateObjectMap(Position position, Element elementARemplacer){
		if( this.map.containsKey(position) ){
			Element elementRemplace = this.map.get(position);
			this.map.put(position, elementARemplacer);
			return elementRemplace;
		}
		return null;
	}
	
	/**
	 * return position list of each element which is in current map
	 * @param element researched element
	 * @return listPosition
	 */
	public ArrayList<Position> rechercherElement(Element element){
		if(this.map.containsValue(element.getClass())){
			ArrayList<Position> listPosition = new ArrayList<Position>();
			iteratorCollectionMap = this.map.values().iterator();
			while(iteratorCollectionMap.hasNext()){
				if(this.map.values().getClass()== element.getClass()){
					Position p = new Position(((Element) iteratorCollectionMap.next()).getCurrPosition()[0], ((Element) iteratorCollectionMap.next()).getCurrPosition()[1]);
					listPosition.add(p);
				}
			}
			return listPosition;
		}
		return null;	
	}
	
	/**
	 * return element at specified position
	 * @param position
	 * @return element
	 */
	public Element rechercherElement(Position position){
		if(this.map.containsValue(position))
			return this.map.get(position);
		return null;
	}
	
	/**
	 * @return the map
	 */
	public HashMap<Position, Element> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(HashMap<Position, Element> map) {
		this.map = map;
	}

	public int getNbLigne() {
		return nbLigne;
	}

	public int getNbColonne() {
		return nbColonne;
	}
}
