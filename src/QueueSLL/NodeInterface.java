package QueueSLL;



public interface NodeInterface<E> {

	//all public methods should be listed in an interface
	public void setData(E Data); //to set the value for data item in the node
	public E getData(); //read back the value of the data in the node
	public void setNextNode(Node<E> nextNode); //set the next node reference
	public Node<E> getNextNode(); //get the next node reference from the node...
}
