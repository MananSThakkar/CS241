package Queue;



public interface QueueInterface<E> {
	
	
	static final int DEFAULT_CAPACITY = 10;
	
	public boolean enqueue(E Data);
	
	public E dequeue();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public void clear();

	public int size();
	
}
