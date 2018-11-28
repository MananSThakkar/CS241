package GMC;

import java.util.*;

public class ListADT {
	
	public static void main(String args[]){
		
		List<String> l1 = new ArrayList<>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("one");
		System.out.println(l1);

		List<String> l2 = new LinkedList<>();
		l2.add("one");
		l2.add("two");
		l2.add("three");
		l2.add("four");
		l2.add("one");
		System.out.println(l2);

		
	}

}
