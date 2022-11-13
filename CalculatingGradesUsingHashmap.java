package Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class CalculatingGradesUsingHashmap {

	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
		    int s = sc.nextInt();
		    HashMap<String, Integer> hm = new HashMap<String, Integer>();
		    for (int i = 0; i < s; i++) {
		    String name = sc.next();
		    int number = sc.nextInt();
		    hm.put(name, number);
		    }
		    TreeMap<String, String> tm = new TreeMap<String, String>();
		    tm = display(hm);
		    Iterator<String> it = tm.keySet().iterator();
		    for (int i = 0; i < s; i++) {
		    	  String n = it.next();
		    	    String fac = tm.get(n);
		    	    System.out.println(n);
		    	    System.out.println(fac);
		    }
		    	    }
		    public static TreeMap<String, String> display(HashMap<String, Integer> hm) {
		        TreeMap<String, String> tm = new TreeMap<String, String>();
		        Iterator<String> it = hm.keySet().iterator();
		        while (it.hasNext()) {
		        String id = it.next();
		        int mark = hm.get(id);
		        if (mark >= 90) tm.put(id, "GOLD");
		        else if(mark >= 80 && mark<90) tm.put(id, "Silver");
		        else if(mark>= 70 && mark<80) tm.put(id, "Bronze");
		        else if(mark < 60) tm.put(id, "No Medal");
		        else tm.put(id, "No Medal");
		        }
		        return tm;
		        }
		        }
	