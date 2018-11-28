package SortAlgorithms;

import java.util.Random;

import java.util.ArrayList;


public class SortAlgorithms {

	public static void main(String[] args) {
		
		int capacity = 100;		
		Random rgen = new Random();		
		Integer [] intArray = new Integer[capacity];
		
		for(int i=0; i<capacity; i++)
			intArray[i] = rgen.nextInt(capacity*3);
		
		//Objects to test Object Sort with different algorithms
		Student [] studentArray = new Student[4];
		
		Student s1 = new Student("John","Jay",3.5,"U12345");
		Student s2 = new Student("John","Smith",3.5,"U22345");
		Student s3 = new Student("John","Xavier",3.5,"U12346");
		Student s4 = new Student("John","Porter",3.5,"U32345");
	
		studentArray[0] = s1;
		studentArray[1] = s2;
		studentArray[2] = s3;
		studentArray[3] = s4;
		
		/*
		
		//insertion sort test
		System.out.println("Insertion Sort");
		System.out.println();
		System.out.println("Before insertionSort");
		printArray(intArray);
		insertionSort(intArray);
		System.out.println();
		System.out.println("After insertionSort");
		printArray(intArray);	
		System.out.println();
		System.out.println("Before insertionSort (Student)");
		printArray(studentArray);
		insertionSort(studentArray);
		System.out.println();
		System.out.println("Before insertionSort (Student)");
		printArray(studentArray);
		System.out.println();
		
		*/
		/*
		
		//shell sort test
		System.out.println("Shell Sort");
		System.out.println();
		System.out.println("Before shellSort");
		printArray(intArray);
		insertionSort(intArray);
		System.out.println();
		System.out.println("After shellSort");
		printArray(intArray);
		System.out.println();
		System.out.println("Before insertionSort (Student)");
		printArray(studentArray);
		shellsort(studentArray);
		System.out.println();
		System.out.println("Before insertionSort (Student)");
		printArray(studentArray);
		System.out.println();
		
		*/
		/*
		
		//heapsort test
		System.out.println("Heap Sort");
		System.out.println();
		System.out.println("Before HeapSort");
		printArray(intArray);
		heapsort(intArray);
		System.out.println();
		System.out.println("After HeapSort");
		printArray(intArray);
		System.out.println();
		System.out.println("Before HeapSort (Student)");
		printArray(studentArray);
		heapsort(studentArray);
		System.out.println();
		System.out.println("Before HeapSort (Student)");
		printArray(studentArray);
		System.out.println();		
	
		*/
		/*
		 	
		//mergesort test
		System.out.println("Merge Sort");
		System.out.println();
		System.out.println("Before MergeSort");
		printArray(intArray);
		mergeSort(intArray);
		System.out.println();
		System.out.println("After MergeSort");
		printArray(intArray);
		System.out.println();
		System.out.println("Before Merge Sort (Student)");
		printArray(studentArray);
		mergeSort(studentArray);
		System.out.println();
		System.out.println("Before MergeSort (Student)");
		printArray(studentArray);
		System.out.println();	
		
		*/
		/*
		
		//quick sort test
		System.out.println("Quick Sort");
		System.out.println();
		System.out.println("Before QuickSort");
		printArray(intArray);
		quicksort(intArray);
		System.out.println();
		System.out.println("After QuickSort");
		printArray(intArray);
		System.out.println();
		System.out.println("Before Quick Sort (Student)");
		printArray(studentArray);
		quicksort(studentArray);
		System.out.println();
		System.out.println("Before QuickSort (Student)");
		printArray(studentArray);
		System.out.println();

		*/
		
// ****************************************************************** Divide and Merge ****************************************************************** //
		
				//divide your array into three subarrays; 30,30,40
				//sort first 30 with insertion sort
				//second with heap sort
				//third with shell sort
				//and finally, merge it all with a fast sort algorithm	
		
		Integer [] intArrayPart1 = new Integer[30];
		Integer [] intArrayPart2 = new Integer[30];
		Integer [] intArrayPart3 = new Integer[40];
		
		for(int i=0;i<intArray.length;i++) {
			if(i <= 29 && i >= 0)
				intArrayPart1[i] = intArray[i];
			
			if(i < 60 && i >= 30)
				intArrayPart2[i-30] = intArray[i];
			
			if( i >= 60)
				intArrayPart3[i-60] = intArray[i];
		}
		System.out.println("Before Sorting:");
		
		System.out.println("Array 1:");
		printArray(intArrayPart1);
		System.out.println("Length: " + intArrayPart1.length);
		System.out.println();
		System.out.println("Array 2:");
		printArray(intArrayPart2);
		System.out.println("Length: " + intArrayPart2.length);
		System.out.println();
		System.out.println("Array 3:");
		printArray(intArrayPart3);
		System.out.println("Length: " + intArrayPart3.length);
		System.out.println();	
		
		
		System.out.println("After Sorting:");
		
		System.out.println("Array 1:");
		System.out.println("Insertion Sort:");
		insertionSort(intArrayPart1);
		printArray(intArrayPart1);
		System.out.println("Length: " + intArrayPart1.length);
		System.out.println();
		System.out.println("Array 2:");
		System.out.println("Heap Sort:");
		heapsort(intArrayPart2);
		printArray(intArrayPart2);
		System.out.println("Length: " + intArrayPart2.length);
		System.out.println();
		System.out.println("Array 3:");
		System.out.println("Shell Sort:");
		shellsort(intArrayPart3);
		printArray(intArrayPart3);
		System.out.println("Length: " + intArrayPart3.length);
		System.out.println();
		
		Integer[] intTwoArray = combine1(intArrayPart1, intArrayPart2);
		
		Integer[] intFullArray = combine(intTwoArray, intArrayPart3);
			
		System.out.println("Full Array Before quick sort: Array 1 + Array 2 + Array 3");
		printArray(intFullArray );
		System.out.println("Length: " + intFullArray.length);
		System.out.println();
		System.out.println("Full Array After quick sort");
		quicksort(intFullArray);
		printArray(intFullArray);
		System.out.println("Length: " + intFullArray.length);
	}
	
	public static Integer[] combine1(Integer[] intArrayPart1, Integer[] intArrayPart2){
		int length = intArrayPart1.length + intArrayPart2.length;
		Integer[] result = new Integer[length];
		System.arraycopy(intArrayPart1, 0, result, 0, intArrayPart1.length);
        System.arraycopy(intArrayPart2, 0, result, intArrayPart1.length, intArrayPart2.length);

        return result;
    }
	
	public static Integer[] combine(Integer[] intTwoArray, Integer[] intArrayPart3){
		int length = intTwoArray.length + intArrayPart3.length;
		Integer[] result = new Integer[length];
		System.arraycopy(intTwoArray, 0, result, 0, intTwoArray.length);
        System.arraycopy(intArrayPart3, 0, result, intTwoArray.length, intArrayPart3.length);
        return result;
    }

// ****************************************************************** END ****************************************************************** //

    public static <AnyType extends Comparable<? super AnyType>>
    void insertionSort( AnyType [ ] a ){
        int j;

        for( int p = 1; p < a.length; p++ )
        {
            AnyType tmp = a[ p ];
            for( j = p; j > 0 && tmp.compareTo( a[ j - 1 ] ) < 0; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }
    }
    
    
    public static <AnyType extends Comparable<? super AnyType>>
    void shellsort( AnyType [ ] a )
    {
        int j;

        for( int gap = a.length / 2; gap > 0; gap /= 2 )
            for( int i = gap; i < a.length; i++ )
            {
                AnyType tmp = a[ i ];
                for( j = i; j >= gap &&
                            tmp.compareTo( a[ j - gap ] ) < 0; j -= gap )
                    a[ j ] = a[ j - gap ];
                a[ j ] = tmp;
            }
    }
    
    /**
     * Internal method for heapsort.
     * @param i the index of an item in the heap.
     * @return the index of the left child.
     */
    private static int leftChild( int i )
    {
        return 2 * i + 1;
    }
    
    
    /**
     * Internal method for heapsort that is used in deleteMax and buildHeap.
     * @param a an array of Comparable items.
     * @index i the position from which to percolate down.
     * @int n the logical size of the binary heap.
     */
    private static <AnyType extends Comparable<? super AnyType>>
    void percDown( AnyType [ ] a, int i, int n )
    {
        int child;
        AnyType tmp;

        for( tmp = a[ i ]; leftChild( i ) < n; i = child )
        {
            child = leftChild( i );
            if( child != n - 1 && a[ child ].compareTo( a[ child + 1 ] ) < 0 )
                child++;
            if( tmp.compareTo( a[ child ] ) < 0 )
                a[ i ] = a[ child ];
            else
                break;
        }
        a[ i ] = tmp;
    }
    
    /**
     * Standard heapsort.
     * @param a an array of Comparable items.
     */
    public static <AnyType extends Comparable<? super AnyType>>
    void heapsort( AnyType [ ] a )
    {
        for( int i = a.length / 2 - 1; i >= 0; i-- )  /* buildHeap */
            percDown( a, i, a.length );
        for( int i = a.length - 1; i > 0; i-- )
        {
            swapReferences( a, 0, i );                /* deleteMax */
            percDown( a, 0, i );
        }
    }

    /**
     * Method to swap to elements in an array.
     * @param a an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    public static <AnyType> void swapReferences( AnyType [ ] a, int index1, int index2 )
    {
        AnyType tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }
    
    
    

    
    /**
     * Mergesort algorithm.
     * @param a an array of Comparable items.
     */
    public static <AnyType extends Comparable<? super AnyType>>
    void mergeSort( AnyType [ ] a )
    {
        @SuppressWarnings("unchecked")
		AnyType [ ] tmpArray = (AnyType[]) new Comparable[ a.length ];

        mergeSort( a, tmpArray, 0, a.length - 1 );
    }

    /**
     * Internal method that makes recursive calls.
     * @param a an array of Comparable items.
     * @param tmpArray an array to place the merged result.
     * @param left the left-most index of the subarray.
     * @param right the right-most index of the subarray.
     */
    private static <AnyType extends Comparable<? super AnyType>>
    void mergeSort( AnyType [ ] a, AnyType [ ] tmpArray,
               int left, int right )
    {
        if( left < right )
        {
            int center = ( left + right ) / 2;
            mergeSort( a, tmpArray, left, center );
            mergeSort( a, tmpArray, center + 1, right );
            merge( a, tmpArray, left, center + 1, right );
        }
    }

    /**
     * Internal method that merges two sorted halves of a subarray.
     * @param a an array of Comparable items.
     * @param tmpArray an array to place the merged result.
     * @param leftPos the left-most index of the subarray.
     * @param rightPos the index of the start of the second half.
     * @param rightEnd the right-most index of the subarray.
     */
    private static <AnyType extends Comparable<? super AnyType>>
    void merge( AnyType [ ] a, AnyType [ ] tmpArray, int leftPos, int rightPos, int rightEnd )
    {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd )
            if( a[ leftPos ].compareTo( a[ rightPos ] ) <= 0 )
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            else
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];

        while( leftPos <= leftEnd )    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];

        while( rightPos <= rightEnd )  // Copy rest of right half
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];

        // Copy tmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- )
            a[ rightEnd ] = tmpArray[ rightEnd ];
    }

    
    //quick sort
    /**
     * Quicksort algorithm.
     * @param a an array of Comparable items.
     */
    public static <AnyType extends Comparable<? super AnyType>>
    void quicksort( AnyType [ ] a )
    {
        quicksort( a, 0, a.length - 1 );
    }
    
    private static final int CUTOFF = 3;



    /**
     * Return median of left, center, and right.
     * Order these and hide the pivot.
     */
    private static <AnyType extends Comparable<? super AnyType>>
    AnyType median3( AnyType [ ] a, int left, int right )
    {
        int center = ( left + right ) / 2;
        if( a[ center ].compareTo( a[ left ] ) < 0 )
            swapReferences( a, left, center );
        if( a[ right ].compareTo( a[ left ] ) < 0 )
            swapReferences( a, left, right );
        if( a[ right ].compareTo( a[ center ] ) < 0 )
            swapReferences( a, center, right );

            // Place pivot at position right - 1
        swapReferences( a, center, right - 1 );
        return a[ right - 1 ];
    }

    /**
     * Internal quicksort method that makes recursive calls.
     * Uses median-of-three partitioning and a cutoff of 10.
     * @param a an array of Comparable items.
     * @param left the left-most index of the subarray.
     * @param right the right-most index of the subarray.
     */
    private static <AnyType extends Comparable<? super AnyType>>
    void quicksort( AnyType [ ] a, int left, int right )
    {
        if( left + CUTOFF <= right )
        {
            AnyType pivot = median3( a, left, right );

                // Begin partitioning
            int i = left, j = right - 1;
            for( ; ; )
            {
                while( a[ ++i ].compareTo( pivot ) < 0 ) { }
                while( a[ --j ].compareTo( pivot ) > 0 ) { }
                if( i < j )
                    swapReferences( a, i, j );
                else
                    break;
            }

            swapReferences( a, i, right - 1 );   // Restore pivot

            quicksort( a, left, i - 1 );    // Sort small elements
            quicksort( a, i + 1, right );   // Sort large elements
        }
        else  // Do an insertion sort on the subarray
            insertionSort( a, left, right );
    }
    
    /**
     * Internal insertion sort routine for subarrays
     * that is used by quicksort.
     * @param a an array of Comparable items.
     * @param left the left-most index of the subarray.
     * @param right the right-most index of the subarray.
     */
    private static <AnyType extends Comparable<? super AnyType>>
    void insertionSort( AnyType [ ] a, int left, int right )
    {
        for( int p = left + 1; p <= right; p++ )
        {
            AnyType tmp = a[ p ];
            int j;

            for( j = p; j > left && tmp.compareTo( a[ j - 1 ] ) < 0; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }
    }

    public static <AnyType> void printArray(AnyType [] anyTypeArray) {
    	for(int i=0; i<anyTypeArray.length; i++)
    		System.out.print(anyTypeArray[i] + ";");
    	System.out.println();
    }




}
