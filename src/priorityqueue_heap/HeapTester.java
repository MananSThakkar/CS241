package priorityqueue_heap;

public class HeapTester {

	public static void main(String[] args) {
		PQInterface<String> myHeap = new Heap<>(10);
		
		myHeap.enqueue("J");
		myHeap.enqueue("A");
		myHeap.enqueue("M");
		myHeap.enqueue("B");
		myHeap.enqueue("L");
		myHeap.enqueue("E");
		
		System.out.println(myHeap);
		System.out.println(myHeap.dequeue() + "\n");		
		System.out.println(myHeap);
		
		PQInterface<Integer> YourHeap = new Heap<>(10);
		
		YourHeap.enqueue(4);
		YourHeap.enqueue(12);
		YourHeap.enqueue(8);
		YourHeap.enqueue(10);
		YourHeap.enqueue(6);
		YourHeap.enqueue(14);
		
		System.out.println(YourHeap);
		System.out.println(YourHeap.dequeue() + "\n");
		System.out.println(YourHeap);
		
		System.out.println(YourHeap.dequeue() + "\n");
		System.out.println(YourHeap);
		
		YourHeap.enqueue(2);
		System.out.println(YourHeap);
	}

}
