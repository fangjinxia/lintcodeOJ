package test;


import java.util.*;
import java.lang.String;


public class ladderLength {
    /*
     * @param start: a string
     * @param end: a string
     * @param dict: a set of string
     * @return: An integer
     */
	public int ladderLength(String start, String end, Set<String> dict) {
        if(start.equals(end))
        	return 1;
       if(start == null && end == null)
       	return 0;
       if(dict.size() == 0)
       	return 0;
       
       int res = 1;
       dict.add(end);
       Queue<String> q = new LinkedList<>();
       Set<String> hash = new HashSet<>();
       hash.add(start);
       q.offer(start);
       while(!q.isEmpty()) {
       	res++;
       	int qLen = q.size();
       	for(int i = 0; i < qLen; ++i) {
       		String s = q.poll();
       		for(String str : getNextWords(s, dict)) {
	        		if(str.equals(end))
	        			return res;
	        		if(hash.contains(str))
	        			continue;
	        		q.offer(str);
	        		hash.add(str);
       		}
       	}
       }
       
       return 0;
       
   }
   
   private static Set<String> getNextWords(String s, Set<String> dict){
   	Set<String> res = new HashSet<String>();
   	for(int i = 0; i < s.length(); ++i) {
   		char[] chars = s.toCharArray();
   		for(char c = 'a'; c <= 'z'; ++c) {
   			chars[i] = c;
   			String tmp = new String(chars);
   			if(dict.contains(tmp)) {
   				res.add(tmp);
   			}
   		}
   	}
   	
   	return res;
   }
}