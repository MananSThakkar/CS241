package GenericSLL;


public class LinkedList<E> implements LinkedListInterface<E>
{
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public LinkedList() 
	{
		this.head = this.tail = null;
		size = 0;
	}

	@Override
	public void addNode(E data) 
	{
		Node<E> newNode = new Node<E>(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.setNextNode(newNode);
			tail = tail.getNextNode();
		}
		size++;
		/*this.tail.setNext(new Node(data));
		this.tail = tail.getNext();
		this.size++;*/
	}

	@Override
	public void removeNode() 
	{
		Node<E> n = head;
		if(n!=null)
		{
			if(size!=1)
			{
				while(n!=null)
				{
					if(n.getNextNode()==tail)
						break;
					n = n.getNextNode();
				}
				tail = n;
				tail.setNextNode(null);
			}
			else
			{
				head = null;
				tail = null;
			}
			size--;
		}
	}
	


	@Override
	public void clear() 
	{
		this.head = this.tail = null;
		size = 0;
	}

	@Override
	public Node<E> getHead() 
	{
		return this.head;
	}
	@Override
	public Node<E> getTail() 
	{
		return this.tail;
	}
	public String toString()
	{
		Node<E> printer = head;
		String returnThis = "";
		if(head == null)
			return "empty";
		while(printer.getNextNode()!=null)
		{
			returnThis += printer.getData()+";";
			printer = printer.getNextNode();
		}
		returnThis += printer.getData();
		return returnThis;
	}

	@Override
	public int search(E target) 
	{
		Node<E> temp = head;
		for(int i=0;i<size;i++)
		{
			if(temp.getData().equals(target))
				return i;
			else
				temp=temp.getNextNode();
		}
		return -1;
	}
}