package InsertionSort;

import java.util.Random;

public class InsertionSortTester {

	public static void main(String[] args) {
		
		int capacity = 10;		
		Random rgen = new Random();		
		Integer[] intArray = new Integer[capacity];
		
		for(int i=0; i<capacity; i++)
			intArray[i] = rgen.nextInt(capacity*3);
		
		InsertionSort<Integer> is1 = new InsertionSort<>();
		
		System.out.println("Before insertionSort");
		SortAlgorithms.printArray(intArray);
		
		is1.setData(intArray);
		is1.sort(intArray);
		
		Integer[] sortedIntArray = (Integer[]) is1.getData();
		
		System.out.println("After insertionSort");
		SortAlgorithms.printArray(sortedIntArray);
		

	}

}
