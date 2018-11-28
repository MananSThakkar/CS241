package QueueArray;

public interface QueueInterface<E> {
	  E dequeue() throws QueueUnderflowException;
	  // Throws QueueUnderflowException if this queue is empty;
	  // otherwise, removes front element from this queue and returns it.
	  
	  boolean isEmpty();
	  // Returns true if this queue is empty; otherwise, returns false.
	  
	  void enqueue(E element) throws QueueOverflowException;
	  // Throws QueueOverflowException if this queue is full;
	  // otherwise, adds element to the rear of this queue.
	  
	  boolean isFull();
	  // Returns true if this queue is full; otherwise, returns false.
}
