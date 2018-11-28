package QueueSLL;



public interface QueueInterface<E> {
	
	
	static final int DEFAULT_CAPACITY = 10;
	
	public void enqueue(E Data) throws QueueOverflowException;
	
	public E dequeue() throws QueueUnderflowException;
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	
}
