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

public class topSort {
    /*
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        ArrayList<DirectedGraphNode> result = new ArrayList<>();
        if(graph.isEmpty())
        	return result;
        
    	Map<DirectedGraphNode, Integer> mp = new HashMap<>();
        indegree(graph, mp);
        
        Queue<DirectedGraphNode> q = new LinkedList<DirectedGraphNode>();
        for(DirectedGraphNode node : graph) {
        	if(!mp.containsKey(node)) {
        		q.offer(node);
        		result.add(node);
        		//break;
        	}
        }
        
        while(!q.isEmpty()) {
        	DirectedGraphNode node = q.poll();
        	for(DirectedGraphNode it : node.neighbors) {
        		mp.put(it, mp.get(it)-1);
        		if(mp.get(it) == 0) {
        			q.offer(it);
        			result.add(it);
        		}
        	}
        	
        }
        
        return result;
    }
    
    private static void indegree(ArrayList<DirectedGraphNode> graph, Map<DirectedGraphNode, Integer> mp) {
    	for(DirectedGraphNode node : graph) {
    		for(DirectedGraphNode it : node.neighbors) {
    			if(mp.containsKey(it))
    				mp.put(it, mp.get(it)+1);
    			else
    				mp.put(it, 1);
    		}
    	}
    }
}