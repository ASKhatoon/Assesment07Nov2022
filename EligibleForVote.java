package exceptions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EligibleForVote {

	public static void main(String[] args) {
				
				HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
				
				hashMap.put(17, " EmpId : 101");
				hashMap.put(18, " EmpId : 102");
				hashMap.put(23, " EmpId : 103");
				hashMap.put(14, " EmpId : 104");
				try {
				System.out.println(hashMap);
				
				
				Set<Integer> keys = hashMap.keySet();
				
				Iterator<Integer> itr = keys.iterator();
				
				while(itr.hasNext()) {
					int key = itr.next();
					System.out.println("Age : "+key + "\t" + hashMap.get(key));
															
				if(key<18) {
					throw new InvalidAgeException("Not eligible for vote");
				} else {
					System.out.println("Eligible for voting");

				}
				
		}
				}
		catch(Exception e) {
			System.out.println(e);
		}
	
			}

}

