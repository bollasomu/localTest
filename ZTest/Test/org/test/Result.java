package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Result {

	public static List<Long> maxMin(List<String> operations, List<Integer> x) {
	   
	    List<Long> result = new ArrayList<>();
	    
	    List<Integer> elements = new CopyOnWriteArrayList<Integer>();
	    
	     for(int i=0;i<x.size();i++){
	       
	    	 elements.add(x.get(i));
	    	 
	         if("push".equals(operations.get(i))){
	             Integer max = elements.stream().max(Integer::compare).get(); 
	             Integer min = elements.stream().min(Integer::compare).get(); 
	             long output = min * max;
	              
	              result.add(output);
	         }
	         else if("pop".equals(operations.get(i))){
	        	 
	        	 Integer value = elements.get(0);
	        	 for(Integer element : elements) {
	        		 
	        		 if(element.equals(value))
	        		 elements.remove(value);
	        		 
	        	 }
	        	
	        	 
	            Integer max = elements.stream().max(Integer::compare).get(); 
	             Integer min = elements.stream().min(Integer::compare).get(); 
	             long output = min * max;
	            
	             result.add(output);            
	            }
	        }
	    
	     return result;
	    }

	
	
	public static void main(String[] args) {

		List<String> operations = new ArrayList<>(); operations.add("push");operations.add("push");
		operations.add("push");
		operations.add("pop");
		
		List<Integer> x = new ArrayList<>();
		x.add(1);x.add(2);x.add(3);x.add(1);
		
		System.out.println(maxMin(operations,x));
		
		List<Integer> al = new ArrayList<>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(1); 
       
  
        // This makes a call to remove(Object) and  
        // removes element 1 
        al.remove(new Integer(1)); 
          
        // This makes a call to remove(Object) and  
        // removes element 2 
        al.remove(new Integer(1)); 
  
        System.out.println("Modified ArrayList : " + al); 

	}

}
