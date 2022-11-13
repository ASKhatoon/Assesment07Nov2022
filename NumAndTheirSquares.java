package Assignments;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;

public class NumAndTheirSquares {
	public static HashMap method(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int n: array) {
			map.put(n,n*n);
		}
		return map;
	}
	public static void main(String []args) {

		int array[] = new int[] {1,2,3,4,5,6,7,8,9};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println(key +"  :  "+map.get(key));
		}
}
}								
