package StackLL;

public class StackLL<E> implements StackInterface<E>{

	//data types
	private int size;
	private int capacity;
	private Node<E> bottom;
	private Node<E> top;
	
	//constructors
	public StackLL() {
		top = bottom = null;
		capacity = DEFAULT_CAPACITY;
		size = 0;
	}
	
	public StackLL(int initCapacity) {
		top = bottom = null;
		capacity = initCapacity;
		size = 0;
	}
	//methods
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public E pop() {
		//move to the node right before the top!
		Node<E> temp = bottom;
		while(temp.getNextNode() != top) {
			temp = temp.getNextNode();
		}
		//the loop breaks only when temp.getNextNode() == top
		E topData = top.getData();
		top = temp;
		top.setNextNode(null);
		
		return topData;
		//fix
	}

	@Override
	public boolean put(E data) {
		//if the stack is empty
		if( size == 0) {
			Node<E> newNode = new Node<E>(data); //create a new node to insert
			top = bottom = newNode;
			size++;
			return true;
		}else if(size < capacity) {
			//if the stack has some elements...
			Node<E> newNode = new Node<E>(data); //create a new node to insert
			top.setNextNode(newNode);
			top = newNode;
			size++;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public E seek() {
		return top.getData(); 
	}

	@Override
	public void clear() {
		top = bottom = null;
		size = 0;
		
	}

	@Override
	public int getCapacity() {
		return capacity;
	}


	public String toString()
	{
		Node<E> printer = bottom;
		String returnThis = "StackLL: ";
		if(top == null)
			return "empty";
		while(printer.getNextNode()!=null)
		{
			returnThis += printer.getData()+";";
			printer = printer.getNextNode();
		}
		returnThis += printer.getData();
		return returnThis;
	}
	
}
