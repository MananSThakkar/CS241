package StacksArray;


public class StackArrayTester {

	public static void main(String[] args) {
		
		StackArray<Integer> sa1 = new StackArray<Integer>(5);
		
		sa1.put(10);
		sa1.put(20);
		sa1.put(30);
		sa1.put(40);
		sa1.put(50);
		
		System.out.println(sa1);
		System.out.println("the top item: " + sa1.seek());
		System.out.println("pop the top: " + sa1.pop());
		System.out.println(sa1);
		
		sa1.clear();
		System.out.println(sa1);
		
		//testing the default constructor
		StackArray<Integer> sa2 = new StackArray<Integer>();
		for(int i = 0; i < 10; i++)
			sa2.put(i);
		
		System.out.println(sa2);
		
	}

}
