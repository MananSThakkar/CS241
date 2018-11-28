package MidtermHashSetADT;

public class LinkedHashSetNode<E> implements LinkedHashSetNodeInterface <E> {


	public static final int size = 0;
	private E e;
	LinkedHashSetNode<E> next;
	LinkedHashSetNode<E> prev;


	
	public LinkedHashSetNode(E e) 
	{
		this.e = e;
		this.next = null;
		this.prev = null;
	}

	@Override
	public E getInfo() {
		return e;
	}

	@Override
	public void setInfo(E e) {
		this.e = e;

	}

	@Override
	public LinkedHashSetNode<E> getNext() {
		return next;
	}

	@Override
	public void setNext(LinkedHashSetNode<E> l) {
		this.next = l;		
	}

	@Override
	public LinkedHashSetNode<E> getPrev() {
		return prev;
	}

	@Override
	public void setPrev(LinkedHashSetNode<E> l) {
		this.prev = l;		
	}

	@Override
	public String toString() {
		return (String) this.e+"";
	}

	
}
