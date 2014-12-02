import positionnement.Position;
import stack.StackElement;
import stack.myStack;


/**
 * classe temporaire
 * test des classes StackElement, myStack
 */
public class StartStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackElement element1 = new StackElement(new Position(0,0), 0);
		StackElement element2 = new StackElement(new Position(2,1), 1);
		StackElement element3 = new StackElement(new Position(3,2), 1);
		StackElement element4 = new StackElement(new Position(4,3), 1);
		StackElement element5 = new StackElement(new Position(5,4), 1);
		StackElement element6 = new StackElement(new Position(6,5), 1);
				
		myStack pile = new myStack();
		System.out.println(pile.empty());
		pile.push(element1);
		System.out.println(pile.size());
		pile.push(element2);
		pile.push(element3);
		pile.toString();
		System.out.println(pile.peek().toString());
		pile.pop();
		System.out.println(pile.toString());
		pile.push(element4);
		pile.push(element5);
		System.out.println(pile.toString());
		pile.push(element6);
		System.out.println(pile.peek());
		
		
		
		
		
	}

}
