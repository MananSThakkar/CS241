package StacksArray;

public class StackArray<AnyType> implements StackInterface<AnyType>{

	//data members
	private int size;
	private int capacity;
	private Object [] theStack; //this is a reference only
	static final int DEFAULT_CAPACITY = 10; //public, private, protected, default
	
	
	//constructors
	//default constructor
	@SuppressWarnings("unchecked")
	public StackArray() {
		size = 0;
		capacity = DEFAULT_CAPACITY;
		theStack = (AnyType[])new Object[capacity];
	}
	
	@SuppressWarnings("unchecked")
	public StackArray(int initCapacity) {
		size = 0;
		capacity = initCapacity;
		theStack = (AnyType[])new Object[capacity];
	}
	//public methods
	@Override
	/**
	 * returns the number of elements 
	 * in the stack
	 */
	public int size() {
		return size;
	}

	@Override
	@SuppressWarnings("unchecked")
	public AnyType pop() {
		AnyType temp = (AnyType) theStack[size-1];
		theStack[size-1] = null;
		return temp;
	}

	@Override
	public boolean put(AnyType data) {		
		//make sure, the stack is not full
		if(size < capacity) {
			theStack[size] = data;
			size++;
			return true;
		}else {
			return false;
		}
		
		
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public AnyType seek() {
		return (AnyType) theStack[size-1];
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		theStack = null; //all gone! a safe method but not really required!
		theStack = (AnyType[])new Object[capacity];
	}

	@Override
	public int getCapacity() {
		return capacity;
	}	
	
	
	public String toString() {
		//for(Object item:  theStack) {
			//iterable data structures!
			
		//}
		String result = "";
		for(int i=0; i<size; i++) {
			result += theStack[i];
		}
		return result;
	}
	
	
	//helper methods
}
