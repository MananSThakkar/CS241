package Queue;


public class QueueSLLTester {
	public static void main(String[] args) {
		QueueSLL<Integer> sa1 = new QueueSLL<Integer>(10);
		
		System.out.println(sa1.toString());
		sa1.enqueue(1);
		sa1.enqueue(2);
		sa1.enqueue(3);
		sa1.enqueue(4);
		sa1.enqueue(5);
		sa1.enqueue(6);
		sa1.enqueue(7);
		sa1.enqueue(8);
		sa1.enqueue(9);
		sa1.enqueue(10);
		System.out.println(sa1);
		
		sa1.dequeue();	
		System.out.println(sa1);
		
		sa1.dequeue();	
		System.out.println(sa1);
		
		sa1.clear();	
		System.out.println(sa1);
		
		sa1.enqueue(7999);	
		System.out.println(sa1);
		
		
	
			
}
}