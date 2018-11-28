package priorityqueue_heap;

//the queue hold objects of class E that extends Comparable.
//only comparable objects will be accepted
//the queue is bounded, it can be full so it will throw exceptions,
//when it's empty and full
//duplicates are accepted
public interface PQInterface <E extends Comparable<E>>{
	
	//queue is empty?
	boolean isEmpty();
	
	//queue is full?
	boolean isFull();
	
	//add new element, throw PQOverFlow exception if full
	void enqueue(E item);
	
	//remove and return element
	//throw PQUnderFlow if empty
	E dequeue();
}
