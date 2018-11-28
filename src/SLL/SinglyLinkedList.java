package SLL;

public class SinglyLinkedList implements SinglyLinkedListInterface {
	
	//data members
	private Node head;
	private Node tail;
	private int size;
	//constructors
	public SinglyLinkedList(){
		head = tail = null;
	}
	
	//public methods
	public Node getHead(){
		return head;
	}
	
	public void addNode(int data){
		//move to the end of the list,
		//where the tail is referencing
		//and, create and attach a new node
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
		tail.setNextNode(newNode);
		tail = tail.getNextNode();
		}
	}
		
	public boolean removeNode(){
		if(head != null) {
			Node temp = head;
			while (temp.getNextNode() != null) {
					if (temp.getNextNode() == tail)
						break;
					temp = temp.getNextNode();
			}
			tail = temp;
			tail.setNextNode(null);
			size--;
			return true;
			}else {
				head = tail = null;
				size = 0;
				return true;

			}
	}
	
	// public void removeNode(int data){}
	
	public void clear(){
		head = null;
		size = 0;
		tail = null;
	}
	
	public String toString() {
		
		Node printer = head;
		String returnThis = "";
		if(size != 0 ) {
		
			
			while(printer.getNextNode() != null) {
				returnThis += printer.getData() + ";" ;
				printer = printer.getNextNode();
			}
		
			returnThis += printer.getData() + ";" ;
		
			return returnThis;
		}else {
			System.out.println("The list is empty!");
		}
		return returnThis;
	}
	//helper methods
}
