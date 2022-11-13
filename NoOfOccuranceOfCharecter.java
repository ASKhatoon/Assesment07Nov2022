package Assignments;

import java.io.*;
import java.util.*;
	
	
	public class NoOfOccuranceOfCharecter {
		
	   static void countCharacters(String inputStr){
		   
	      HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
	      
	      char[] strArray = inputStr.toCharArray();
	      for (char c : strArray){
	         if (myMap.containsKey(c)){
	            myMap.put(c, myMap.get(c) + 1);
	         }else{
	            myMap.put(c, 1);
	         }
	      }
	      for (Map.Entry entry : myMap.entrySet()){
	         System.out.println(entry.getKey() + " " + entry.getValue());
	      }
	   }
	   public static void main(String[] args){
	      String myString = "Apple"
	      		+ "";
	      System.out.println("The occurence of every character in the string is ");
	      countCharacters(myString);
	   }
	}


