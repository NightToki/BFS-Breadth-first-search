import java.util.*;
import java.util.Random;
  
public class BFSv2 {
	
	    private int V;   // No. of vertices
	    private LinkedList<Integer> adj[]; //Adjacency Lists
	 
	    // Constructor
	    BFSv2(int v)
	    {
	        V = v;
	        adj = new LinkedList[v];
	        for (int i=0; i<v; ++i)
	            adj[i] = new LinkedList();
	    }
	 
	    // Function to add an edge into the graph
	    void addEdge(int v,int w)
	    {
	        adj[v].add(w);
	    }
	 
	    // prints BFS traversal from a given source s
	    void BFS(int s)
	    {

	        boolean visited[] = new boolean[V];
	 
	        // Create a queue for BFS
	        LinkedList<Integer> queue = new LinkedList<Integer>();
	 
	        // Mark the current node as visited and enqueue it
	        visited[s]=true;
	        queue.add(s);
	 
	        while (queue.size() != 0)
	        {
	            // Dequeue a vertex from queue and print it
	            s = queue.poll();
	            System.out.print(s+" ");
	 
	            // Get all adjacent vertices of the dequeued vertex s
	            // If a adjacent has not been visited, then mark it
	            // visited and enqueue it
	            Iterator<Integer> i = adj[s].listIterator();
	            while (i.hasNext())
	            {
	                int n = i.next();
	                if (!visited[n])
	                {
	                    visited[n] = true;
	                    queue.add(n);
	                }
	            }
	        }
	    }
	 
	    // Driver method to
	    public static void main(String args[])
	    {
	    	BFSv2 g = new BFSv2(8);
	    	g.addEdge(0,2);
	    	g.addEdge(0, 3);
	    	g.addEdge(2, 1);
	    	g.addEdge(2, 3);
	    	g.addEdge(1, 4);
	    	g.addEdge(3, 4);
	    	g.addEdge(5, 4);
	    	g.addEdge(5, 3);
	    	g.addEdge(5, 6);

	    	
	     
	 
	        System.out.println("Following is Breadth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.BFS(0);
	    }
	}