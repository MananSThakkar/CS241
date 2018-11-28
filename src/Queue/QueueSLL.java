package Queue;


public class QueueSLL<E> implements QueueInterface<E> {
	
	
	private int size;
	private int capacity;
	private Node<E> bottom;
	private Node<E> top;
	
	//constructors
	public QueueSLL() {
		top = bottom = null;
		capacity = DEFAULT_CAPACITY;
		size = 0;
	}
	
	public QueueSLL(int initCapacity) {
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
	public boolean enqueue(E Data) {
		if( size == 0) {
			Node<E> newNode = new Node<E>(Data); //create a new node to insert
			
			this.top = this.bottom = newNode;
			size++;
			return true;
			
		}else if(size <= capacity) {
			
			Node<E> newNode = new Node<E>(Data); //create a new node to insert
			bottom.setNextNode(newNode);
			bottom = newNode;
			size++;
			return true;
			
		}else {
			return false;
		}
	}
		

	@Override
	public E dequeue() {
		Node<E> Node = this.top;
        if (this.isEmpty()) {
            return null;
        } else {
            // Removing the second last element from the list
            if (this.bottom == null) {
                this.top = null;
            } else {
                // Set new head to next node, regardless of whether
                // it is a null pointer
                this.top = this.top.getNextNode();
            }
            // Lastly, decrement size of the queue
            this.size--;
        }
        return Node.getData();
		
		

		
	}

	@Override
	public boolean isEmpty() {
		return top == null;
		
	}

	@Override
	public boolean isFull() {		
		return bottom != null;
	}

	@Override
	public void clear() {
		top = null;
		size = 0;
		bottom = null;
		
	}	
	
	public String toString() {
		
		String returnThis = "";
		
		if(size != 0) {
			Node<E> printer = top;
			
			
			while(printer.getNextNode() != null) {
				returnThis += printer.getData() + ";";
				printer = printer.getNextNode();
			}
			returnThis += printer.getData() + ";";
			
			
			if(size == capacity) {
				System.out.println("The list is full!");
			}
			return returnThis;
			
		}else {
				System.out.println("The list is empty!");
			return returnThis;
		} 
		
		
	}
	

}
