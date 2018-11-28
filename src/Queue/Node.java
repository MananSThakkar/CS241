package Queue;



public class Node<E> implements NodeInterface<E> {
	
	//data members
	private E Data;
	private Node<E> nextNode;
	
	//constructors
	public Node(E data2){
		Data = data2;
		nextNode = null;
	}
	
	//public methods
	public void setData(E data){
		this.Data = data;
	}
	
	public E getData(){
		return Data;
	}
	
	public void setNextNode(Node<E> nextNode){
		this.nextNode = nextNode;
	}
	
	public Node<E> getNextNode(){
		return nextNode;
	}
	
	public String toString(){
		return "Node Data: " + Data;
	}
	//helper methods


	
}
