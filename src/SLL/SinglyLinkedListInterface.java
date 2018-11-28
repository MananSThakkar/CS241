package SLL;

public interface SinglyLinkedListInterface {

	public Node getHead();//returns the head reference of the list
	public void addNode(int data); //create and add a new node with the data given
	public boolean removeNode(); //removes the last node by default
	//public void removeNode(int data); //find the node with data, and remove it
	public void clear();
}

