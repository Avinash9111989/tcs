package com.Samsung.Set;

import java.util.*;  
class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
   Set<String> set=new TreeSet<>();  
           set.add("Four");    
           set.add("Two");    
           set.add("One");   
           set.add("Four");  
           set.add("Five");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  
