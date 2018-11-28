package StacksArray;

public interface StackInterface<AnyType> {

	
	public int size(); //how many items I have in the stack
	public AnyType pop(); //give me the one on the top, and delete it
	public boolean put(AnyType data); //insert new item (top)
	public AnyType seek(); //give me the on the top, do not delete it
	public void clear(); //delete everything...
	public int getCapacity();
}
