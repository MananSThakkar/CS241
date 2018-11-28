package QueueSLL;


public class QueueSLLTester {
	public static void main(String[] args) {
		QueueSLL<Cat> sa1 = new QueueSLL<Cat>(5);
		Cat cat1 = new Cat("Foo", 2, "blue");
		Cat cat2 = new Cat("Moo", 3, "black");
		Cat cat3 = new Cat("Doo", 4, "white");
		
		sa1.enqueue(cat1);
		System.out.println(cat1);
		
		sa1.enqueue(cat2);
		System.out.println(cat2);
		
		sa1.enqueue(cat3);
		System.out.println(cat3);
		
	}			
}
