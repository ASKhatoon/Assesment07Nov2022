package Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "Arsheen");
		hashMap.put(0, "Akshita");
		hashMap.put(4, "Kalyani");
		hashMap.put(3, "Ramya");
		hashMap.put(2, "Soumya");
		
		System.out.println(hashMap);
		
Set<Integer> keys = hashMap.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + "\t" + hashMap.get(key));
		}

		}

}
