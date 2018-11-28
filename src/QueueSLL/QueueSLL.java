package QueueSLL;

public class QueueSLL<E> implements QueueInterface<E> {
	
	
	 private final int DEFAULT_SIZE = 10; // default capacity
	  private E[] queue;              // array that holds queue elements
	  private int capacity;    // number of elements n the queue
	  private int front;          // index of front of queue
	  private int rear;               // index of rear of queue
	
	  
	  @SuppressWarnings("unchecked")
	public QueueSLL(){
		  front = 0;
		  rear = DEFAULT_SIZE - 1;
		  capacity = 0;
		  queue = (E[]) new Object[DEFAULT_SIZE]; 
	  }
	  
	  @SuppressWarnings("unchecked")
	public QueueSLL(int initSize){
		  front = 0;
		  rear = initSize - 1;
		  capacity = 0;
		  queue = (E[]) new Object[initSize]; 
	  }
	  

	@Override
	public E dequeue() throws QueueUnderflowException {
		  // Throws QueueUnderflowException if this queue is empty;
		  // otherwise, removes front element from this queue and returns it.
		if (isEmpty())
			throw new QueueUnderflowException("Dequeue attempted on empty queue.");
		else    {
			E toReturn = queue[front];
		    queue[front] = null;
		    front = (front + 1) % queue.length;
		    capacity --;
		    return toReturn;
		}
	}

	@Override
	public boolean isEmpty() {
		
		return capacity == 0;
	}

	public void enqueue(E cat) throws QueueOverflowException {
	// Throws QueueOverflowException if this queue is full;
	// otherwise, adds element to the rear of this queue.
		if (isFull())
			throw new QueueOverflowException("Enqueue attempted on a full queue.");
		else   {
			rear = (rear + 1) % queue.length;
			queue[rear] = cat;
			capacity++;
		    }		
	}

	@Override
	public boolean isFull() {
		
		return capacity == queue.length;
	}
	
	public String toString() {
		
		String result = "";
		for(E item: queue) {
			result += item;
		}
		return result;	
	}

	

}
