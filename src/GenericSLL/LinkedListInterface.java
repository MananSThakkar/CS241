package GenericSLL;

public interface LinkedListInterface<E> 
{
	public void addNode(E data);
	public void removeNode();
	public void clear();
	public Node<E> getHead();
	public Node<E> getTail();
	public int search(E target);
}
