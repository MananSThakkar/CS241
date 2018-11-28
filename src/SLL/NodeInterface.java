package SLL;

public interface NodeInterface {

	//all public methods should be listed in an interface
	public void setData(int data); //to set the value for data item in the node
	public int getData(); //read back the value of the data in the node
	public void setNextNode(Node nextNode); //set the next node reference
	public Node getNextNode(); //get the next node reference from the node...
}
