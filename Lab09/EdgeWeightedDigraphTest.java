import java.util.*;
public class EdgeWeightedDigraphTest {
	public static void main(String[] args) {
		DirectedEdge d = new DirectedEdge(9,6,3);
        DirectedEdge a = new DirectedEdge(2,4,1);
        DirectedEdge b = new DirectedEdge(6,4,9);
        DirectedEdge c = new DirectedEdge(5,4,2);
        DirectedEdge e = new DirectedEdge(3,2,7);
        DirectedEdge f = new DirectedEdge(1,3,4);
        DirectedEdge h = new DirectedEdge(7,2,4);
        DirectedEdge i = new DirectedEdge(4,6,4);
        DirectedEdge j = new DirectedEdge(0,4,4);
         
        EdgeWeightedDigraph g = new EdgeWeightedDigraph(10);
        g.addEdge(d);
        g.addEdge(a);
        g.addEdge(b);
        g.addEdge(c);
        g.addEdge(e);
        g.addEdge(f);
        g.addEdge(h);
        g.addEdge(i);
        g.addEdge(j);
    
        System.out.print(g.toString());

    	assert(g.V() == 10);

    	System.out.println("\nAll Test Cases Passed.");
    	
	}
}