package MidtermHashSetADT;

public interface LinkedHashSetNodeInterface <E>{
	//returns the information saved in the node
	    public E getInfo();
	//modify/set the info of the node
	    public void setInfo(E e);
	//returns next node reference
	    public LinkedHashSetNode<E> getNext();
	//set next node reference of the node
	    public void setNext(LinkedHashSetNode<E> l);
	//returns prev node reference
	    public LinkedHashSetNode<E> getPrev();    
	//set prev node reference of the node
	    public void setPrev(LinkedHashSetNode<E> l);
	}
