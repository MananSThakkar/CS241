package SLL;

public class Node implements NodeInterface {
	
	//data members
	private int data;
	private Node nextNode;
	
	//constructors
	public Node(int data2){
		data = data2;
		nextNode = null;
	}
	
	//public methods
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setNextNode(Node nextNode){
		this.nextNode = nextNode;
	}
	
	public Node getNextNode(){
		return nextNode;
	}
	
	public String toString(){
		return "Node Data: " + data;
	}
	//helper methods
}
