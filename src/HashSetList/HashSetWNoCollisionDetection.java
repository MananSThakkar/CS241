package HashSetList;

public class HashSetWNoCollisionDetection<E> {


	private E[] list; //the actual array holding all items
	private int capacity;
	private int size;
	
	
	@SuppressWarnings("unchecked")
	public HashSetWNoCollisionDetection(int capacity) {
		super();
		this.capacity = capacity;
		size = 0; 
		
		list = (E[]) new Object[capacity]; //first create an Object array in defined size, then cast it to E
		
		//initialize the array
		for(int i=0; i<capacity;i++)
			list[i]=null;
		
	}
	
	public E get(E item) {
		//we need to calculate the hash function, and get its index
		//and check that index, if it's there, return it
		int location;
		
		//find index
		location = item.hashCode() % capacity;
		E found = (E) list[location]; //get the item
		
		if(found != null)
			return found;
		else
			return null;
	}
	
	
	public boolean contains(E item) {
		
		if(item == null)
			return false;
		
		//calculate the index
		int location = item.hashCode() % capacity;
		
		if(list[location] == null)
			return false;
		
		if(list[location].equals(item))
			return true;
		else
			return false;
	}
	
	public void add(E item) {
		
		//make sure you're inserting a real item... :)
		if(item == null)
			return; //do nothing if there's nothing...
		
		//check if the item is already in the list
		if(contains(item)) 
			return; //if it's in, do nothing.
		

		
		int location = item.hashCode() % capacity;
		
		//now insert it
		list[location] = item;
		size++;
	}
	
	public void printList() {
		for(int i=0; i<capacity; i++)
			if(list[i] != null)
				System.out.println(list[i]);
	}
	
	public int getSize() {return size;}
}










