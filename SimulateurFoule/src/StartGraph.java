import java.util.ArrayList;

import positionnement.Position;

import graph.Edge;
import graph.Graph;
import graph.Node;

/**
 * classe temporaire
 * test des classes Graph, Edge, Node
 */
public class StartGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Node> listNodes = new ArrayList<Node>();
		listNodes.add( new Node("Paris") );
		listNodes.add( new Node("Marseille") );
		listNodes.add( new Node("Lyon") );
		listNodes.add( new Node("Strasbourg") );
		listNodes.add( new Node("Caen") );
		listNodes.add( new Node("Toulouse") );
		
		Graph g = new Graph(listNodes);
		
		g.addEdge( new Edge(listNodes.get(0), listNodes.get(3), 3) ); //Paris - Strasbourg vaut 3
		g.addEdge( new Edge(listNodes.get(3), listNodes.get(2), 2) ); //Strasbourg - Lyon vaut 2
		g.addEdge( new Edge(listNodes.get(2), listNodes.get(1), 2) ); //Lyon - Marseille vaut 2
		
		g.addEdge( new Edge(listNodes.get(0), listNodes.get(4), 2) ); //Paris - Caen vaut 2
		g.addEdge( new Edge(listNodes.get(4), listNodes.get(5), 3) ); //Caen - Toulouse vaut 3
		g.addEdge( new Edge(listNodes.get(5), listNodes.get(1), 3) ); //Toulouse - Marseille vaut 3
		
		
	}

}
