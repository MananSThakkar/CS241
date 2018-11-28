package HashSetList;

public class HashSetWithCollisionDetection<E> {
	
	
	private Node<E> [] list;
	private int size;
	private int capacity;
	
	
	@SuppressWarnings("unchecked")
	public HashSetWithCollisionDetection(int capacity) {
		super();
		this.capacity = capacity;
		size = 0; 
		
		list = new Node[capacity]; //first create an Object array in defined size, then cast it to E
		
		//initialize the array
		for(int i=0; i<capacity;i++)
			list[i]=null;
		
	}

	
	public void printList() {
		for(int i=0; i<capacity; i++)
			if(list[i] != null)
				System.out.println(list[i]);
	}
	
	public int getSize() {return size;}
	
	
	public void add(E item) {
		if(contains(item))
			return;
		
		if(item == null)
			return;
		
		int location = item.hashCode() % capacity;
		
		Node<E> newNode = new Node<>(item);
		
		if(list[location] != null) {
			//if cell is not null, it means something has been inserted already!
			Node<E> head = list[location];
			
			while(head.getNextNode() != null) {
				//just move on to the last item...
				head = head.getNextNode();
			}
			//here, you're either at the end of the singly linked list
			//or, there was only one node..
			head.setNextNode(newNode);
			size++;
		}else {
			//the cell has nothing in it, empty...
			list[location] = newNode;
			size++;
			
		}
	}
	
	
	public boolean contains(E item) {
		
		if(item == null)
			return false;
		
		int location = item.hashCode() % capacity;
		if(list[location] == null)
			return false;
		
		if(list[location].getNextNode() != null) {
			//there is a singly linked list behind (attached to it)
			Node<E> head = list[location];
			while(head.getNextNode() != null) {
				if(list[location].getItem().equals(item))
					return true;
				head = head.getNextNode();
			}
			if(head.getItem().equals(item))
				return true;
			else
				return false;
		}else {
			//there is a node in the cell,
			//but, there is NO singly linked list attached to it
			return list[location].getItem().equals(item);
		}
	}
	

}

//this node is going to be a container for Student items,
//AND will be used to generate Singly Linked Lists IF there is
//a collision at a specific index (location)
class Node<E>{
	
	private E item;
	private Node<E> nextNode;
	
	
	public Node(E item) {
		this.item = item;
		nextNode = null;
	}
	
	public void setItem(E item) {
		this.item = item;
	}
	
	public E getItem() {
		return item;
	}
	
	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}
	
	public Node<E> getNextNode(){
		return nextNode;
	}
	
	
	public String toString() {
		return item.toString();
	}
}
