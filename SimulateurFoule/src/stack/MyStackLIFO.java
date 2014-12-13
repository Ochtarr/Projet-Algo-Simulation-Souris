package stack;
import java.util.ArrayList;


public class MyStackLIFO {
	
	private ArrayList<StackElement> listElement;

	public MyStackLIFO(){
		this.listElement = new ArrayList<StackElement>();
	}
	
	
	/**
	 * Check if the stack is empty or not	
	 * @return true if stack is empty
	 */
	public boolean empty(){
		return (listElement.size()==0) ? true : false;
	}
	
	/**
	 * Push an element in current stack
	 * @param element
	 * @return element in stack or null if there was an error
	 */
	public StackElement push(StackElement element){
		if(element != null){
			this.listElement.add(element);
			return element;
		}
		return null;
	}
	
	/**
	 * remove the element at this top of this stack
	 * @return element which was removed
	 */
	public StackElement pop(){
		if(this.listElement.isEmpty() != true){
			StackElement elementSuppr= this.listElement.get(this.listElement.size()-1);
			this.listElement.remove(this.listElement.get(this.listElement.size()-1));
			return elementSuppr;
		}
		return null;
	}
	
	/**
	 * return the element at this top of this stack without removing it
	 * @return element which was removed
	 */
	public StackElement peek(){
		if(this.listElement.isEmpty() != true){
			return this.listElement.get(this.listElement.size()-1);
		}
		return null;
	}
	
	public int size(){
		int cmp = 0;
		for(int i=0;i<this.listElement.size();i++){
			cmp++;
		}
		return cmp;
	}
	
	/**
	 * Prints elements in queuing order
	 */
	public String toString(){
		String s = "\n\n";
		if(this.listElement.size()==0) return "La pile est vide";
		for(int i=0; i<this.listElement.size();i++){
			s += this.listElement.get(i).toString()+"\n";
		}
		return s;
	}
	
	/**
	 * @return the listElement
	 */
	public ArrayList<StackElement> getListElement() {
		return listElement;
	}

	/**
	 * @param listElement the listElement to set
	 */
	public void setListElement(ArrayList<StackElement> listElement) {
		this.listElement = listElement;
	}

}
