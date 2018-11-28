package big_o_notation;

import java.util.Scanner;
import java.util.Arrays;


public class O_N_Example1 {
    
    private static final int DEFAULT_ARRAY_SIZE = 10;
    private static final int DEFAULT_RANDOM_SIZE = 10;
    
    public static void main(String[] args) {

        //create and fill an array with random variables      
        int myArray[] = new int[DEFAULT_ARRAY_SIZE];
        int secondArray[] = new int[DEFAULT_ARRAY_SIZE * 2];
        
        for(int i=0; i<DEFAULT_ARRAY_SIZE; i++){
            //fill with random values
            myArray[i] = (int) (Math.random() * DEFAULT_RANDOM_SIZE);
            secondArray[i] = (int) (Math.random() * DEFAULT_RANDOM_SIZE);
        }
        
        //test1
        System.out.println("****Test 1****");
        System.out.println(contains(myArray, 2));
        
        //test2
        System.out.println("****Test 2****");
        printPairs(myArray);
        
        //test3
        System.out.println("****Test 3****");
        System.out.println(twoSteps(myArray));
        
        //test4
        System.out.println("****Test 4****");
        System.out.println(minMax1(myArray));
        
        System.out.println(minMax2(myArray));
        
        //test5
        System.out.println("****Test 5****");
        System.out.println("Two arrrays have " + 
                commonElementSize(myArray, secondArray) +
                " items in common");
        
        //test6
        System.out.println("****Test 6****");
        twoSteps2(myArray);
        
        //test7
        System.out.println("****Test 7****");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter search value:");
        int find = input.nextInt();
        
        //array needs to be sorted
        Arrays.sort(myArray);
        
        System.out.println("search for " + find);
        System.out.println("Search result (linear) : " + linearSearchArray(myArray, find));
        System.out.println("Search result: " + binarySearchArray(myArray, 0, myArray.length, find));
    }
    
    //TEST 1
    //O(N)
    public static boolean contains(int [] arr, int x){
        
        for(int target: arr){
            if(target == x){
                return true;
            }
        }
            
        return false;
    }
    
    //TEST 2
    //O(N2) N squared
    public static void printPairs(int [] arr){
        for(int x: arr){
            for(int y: arr){
                System.out.println(x + ":" + y);
            }
        }
    }
    
    
    //TEST 3
    //O(N+N)
    public static String twoSteps(int [] arr){
        String result = "";
        
        //step1
        for(int target: arr){
            result += target;
        }
        
        result += ";";
        
        //step2
        for(int i=DEFAULT_ARRAY_SIZE-1; i >= 0; i--){
            result += arr[i];
        }
            
        return result;
        
    }
    
    //TEST 4
    //O(N+N)
    public static String minMax1(int [] arr){
        int min = DEFAULT_RANDOM_SIZE + 1;
        int max = 0;
        
        for(int item: arr){
            min = Math.min(min, item);
        }
        
        for(int item: arr){
            max = Math.max(max, item);
        }
        
        return min + ":" + max;
    }
    
    //O(N)
    public static String minMax2(int [] arr){
        int min = DEFAULT_RANDOM_SIZE + 1;
        int max = 0;
        
        for(int item: arr){
            min = Math.min(min, item);
            max = Math.max(max, item);
        }    
        
        return min + ":" + max;
    }
    
    //TEST 5
    //is it O(N) or O(N*N) ?
    //O(i*j)
    public static int commonElementSize(int [] arr1, int [] arr2){
        int count = 0;
        for(int i: arr1){
            for(int j: arr2){
                if(i == j){
                    count ++;
                }
            }
        }
        return count;
    }
    
    //TEST 6
    //O(N + N*N) 
    public static void twoSteps2(int [] arr){
        int max = -1;
        
        //O(N)
        for(int i: arr){
            max = Math.max(max, i);
        }
        System.out.println("Max: " + max);
        
        //O(N*N)
        for(int j: arr){
            for(int k: arr){
                System.out.println(j + ":" + k);
            }
        }
    }
    
    //TEST 7
    //O(logn)
    private static int binarySearchArray(int[] a, int fromIndex, 
            int toIndex, int key) {
        
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
    
    public static int linearSearchArray(int [] arr, int find) {
    	
    		for(int itemCheck : arr) {
    			if(itemCheck == find)
    				return 1;
    			else
    				return -1;
    		}
			return find;
    }
}

