package MidtermHashSetADT;

public interface LinkedHashSetInterface <E> {
	//adds a new node to the set with data e
	    //returns true if added, false otherwise
	    public void add(E e);
	//removes the node from the set with data e
	    //returns true if removed, false otherwise
	    public Object remove(E e);
	//checks the set if the item e is in
	    //returns true if set has e, false otherwise
	    public boolean contains(E e);
	//clears the set
	    public void clear();
	//returns true if there is at least one item in the set
	    //false otherwise
	    public boolean isEmpty();
	//returns the number of items in the set
	    public int size();
	}