package test;


import java.util.*;
import java.lang.String;


  class DirectedGraphNode {
      int label;
      ArrayList<DirectedGraphNode> neighbors;
      DirectedGraphNode(int x) {
          label = x;
          neighbors = new ArrayList<DirectedGraphNode>();
      }
  };
 


public class hasRoute {
    /*
     * @param graph: A list of Directed graph node
     * @param s: the starting Directed graph node
     * @param t: the terminal Directed graph node
     * @return: a boolean value
     */
    public boolean hasRoute(ArrayList<DirectedGraphNode> graph, DirectedGraphNode s, DirectedGraphNode t) {
        Set<DirectedGraphNode> visited = new HashSet<>();
        return dfs(graph, s, t, visited);
    }
    
    
    private static boolean dfs(ArrayList<DirectedGraphNode> graph, DirectedGraphNode s, DirectedGraphNode t, Set<DirectedGraphNode> visited) {
    	if(s == t)
    		return true;
    	
    	if(s == null || t == null)
    		return false;
    	visited.add(s);
    	for(DirectedGraphNode node : s.neighbors) {
    		if(visited.contains(node))
    			continue;
    		if(dfs(graph, node, t, visited))
    			return true;
    	}
    	
    	return false;
    }
} 