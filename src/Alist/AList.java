package Alist;
public class AList<E> implements List<E> {

	//data members
	private static final int defaultSize = 5;
	private int listSize;
	private int curr;
	
	//this is the most important data member here:
	private E[] listArray;
	
	//constructors
	@SuppressWarnings("unchecked")
	public AList(){
		listSize = curr = 0;
		listArray = (E[]) new Object[defaultSize];
	}
	
	@SuppressWarnings("unchecked")
	public AList(int size){
		listSize = curr = 0;
		listArray = (E[]) new Object[size];
	}
	
	//public methods
	public void clear(){
		listSize = curr = 0;
	}
	
	public void insert(E item){
		//we need an exception thrown here
		//to make sure that the list capacity
		//is not going to be exceeded
		
		//shifting up
		for(int i = listSize; i > curr; i--){
			listArray[i] = listArray[i-1];
		}
		listArray[curr] = item;
		listSize++;
	}
	
	//just add it to the end
	//watch out!!!! do not exceed 
	//the list's capacity!!!
	public void append(E item){
		listArray[listSize++] = item;
	}
	
	//remove the current element
	public E remove(){
		if((curr < 0) || (curr >= listSize))
			return null;
		E item = listArray[curr];
		
		//shifting down
		for(int i = curr; i < listSize-1; i++)
			listArray[i] = listArray[i+1];
		
		listSize--;
		return item;
	}
	
	public void moveToStart(){
		curr = 0;
	}
	
	public void moveToEnd(){
		curr = listSize;
	}
	
	public void prev(){
		if(curr != 0)
			curr--;
	}
	
	public void next(){
		if(curr < listSize)
			curr++;
	}
	
	public int length(){
		return listSize;
	}
	
	public int currPos(){
		return curr;
	}
	
	//throw an exception here
	//if pos < 0 or pos > listSize
	public void moveToPos(int pos){
		curr = pos;
	}
	
	public E getValue(){
		return listArray[curr];
	}
	
	//assuming E has its own toString() implemented!!!
	public String toString(){
		String str = "";
		for(E item: listArray){
			str += item;
		}
		return str;
	}
	
	//helper methods (private)
}
