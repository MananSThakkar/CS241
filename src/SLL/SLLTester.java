package SLL;

public class SLLTester {

	public static void main(String[] args) {
		SinglyLinkedList Sl1 = new SinglyLinkedList();
		System.out.println(Sl1.removeNode());
		
		Sl1.addNode(900);
		System.out.println(Sl1.removeNode());
		System.out.println(Sl1);

		for(int i = 0; i < 10; i++)
			Sl1.addNode(i);
			
		System.out.println(Sl1);
		
		Sl1.removeNode();
		System.out.println(Sl1);

		System.out.println(Sl1.removeNode());
		System.out.println(Sl1);

	}

}
