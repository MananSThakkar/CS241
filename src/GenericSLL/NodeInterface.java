package GenericSLL;

public interface NodeInterface<E> 
{
	public void setData(E Data);
	public E getData();
	public void setNextNode(Node<E> NN);
	public Node<E> getNextNode();
}
