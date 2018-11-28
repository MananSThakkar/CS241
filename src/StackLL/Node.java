package StackLL;


public class Node<E> implements NodeInterface<E>{
	private E data;
	private Node<E> next;

	
	public Node(E data) 
	{
		this.data = data;
		this.next = null;
	}

	@Override
	public void setData(E data) 
	{
		this.data = data;
	}

	@Override
	public E getData() 
	{
		return data;
	}

	@Override
	public void setNextNode(Node<E> NN) 
	{
		this.next = NN;
	}

	@Override
	public Node<E> getNextNode() 
	{
		return next;
	}
	
	public String toString()
	{
		return (String) this.data+"";
	}


}