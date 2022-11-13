package Assignments;

import java.util.*;

public class SecondSmallestInArrayExample2{
	
public static int getSecondSmallest(Integer[] a, int total){
	
List<Integer> list=Arrays.asList(a); 

Collections.sort(list);

int element=list.get(1);  
return element;  
} 

public static void main(String args[]){ 
	
Integer a[]={1,2,5,6,3,2,5,0};  


System.out.println("Second Smallest: "+getSecondSmallest(a,6));  


}  

}
