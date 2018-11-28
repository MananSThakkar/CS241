package StackLL;

public interface StackInterface<E> {

	static final int DEFAULT_CAPACITY = 10; //public, private, protected, default
	public int size(); //how many items I have in the stack
	public E pop(); //give me the one on the top, and delete it
	public boolean put(E data); //insert new item (top)
	public E seek(); //give me the on the top, do not delete it
	public void clear(); //delete everything...
	public int getCapacity();
}
