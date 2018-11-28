package priorityqueue_heap;

import java.util.ArrayList;

public class Heap <E extends Comparable<E>>implements PQInterface<E> {

	private ArrayList<E> elements; //queue elements
	private int lastIndex;
	private int MaxIndexOfHeap;
	
	public Heap(int maxSize) {
		elements = new ArrayList<E>(maxSize);
		lastIndex = -1;
		MaxIndexOfHeap = maxSize - 1;

	}
	
	
	public boolean isEmpty() {
		return (lastIndex == -1); //nothing has inserted
	}
	
	public boolean isFull() {
		return (lastIndex == MaxIndexOfHeap);
	}
	
	public void enqueue(E element) throws PQOverFlowException{
		if(lastIndex == MaxIndexOfHeap)
			throw new PQOverFlowException("Priority Queue is Full");
		else {
			lastIndex++;
			elements.add(lastIndex, element);
			bubleUp(element); //re-organize the heap
		}
			
	}
	

	
	
	
	public E dequeue() throws PQUnderFlowException{
		E hold; //element to be removed
		E toMove; //element to be bubled down
		
		if(lastIndex == -1)
			throw new PQUnderFlowException("Priority Queue is Empty");
		else {
			hold = elements.get(0);
			toMove = elements.remove(lastIndex);
			lastIndex--;
			if(lastIndex != -1)
				bubleDown(toMove);
			return hold;
		}
	}
	
	
	//current last index position is "empty"
	private void bubleUp(E element) {
		
		int hole = lastIndex;
		
		while((hole > 0) & 
				element.compareTo(elements.get((hole - 1) / 2)) < 0){
			
			//move hole's parent down and them move hole up
			elements.set(hole,  elements.get((hole-1)/2));
			hole = (hole - 1 )/2;
		}
		
		//place element into final hole
		elements.set(hole, element);
	}
	
	private void bubleDown(E element) {
		int hole = 0;
		int newHole; //index where hole should move to
		
		newHole = newHole(hole, element); //find next hole
		while(newHole != hole) {
			elements.set(hole, elements.get(newHole)); //move element up
			hole = newHole;
			newHole = newHole(hole, element);
			
		}
		elements.set(hole, element);
	}
	
	private int newHole(int hole, E element) {
		
		int left = (hole * 2) + 1;
		int right = (hole * 2) +2;
		
		
		if(left > lastIndex)
			//hole has no children
			return hole;
		
		else if(left == lastIndex) {
				//hole has left child only
				if(element.compareTo(elements.get(left))<0) {
					//element < left child
					return left;
				}else {
					//element >= left child
					return hole;
				}
		}
		else
		//hole has two children
		if(elements.get(left).compareTo(elements.get(right)) > 0) {
			//left child < right child
			if(elements.get(right).compareTo(element) >= 0)
				//right child <= element
				return hole;
			else
				//element < right child
				return right;
		}else {
			//left child >= right child
			if(elements.get(left).compareTo(element) >= 0)
				//left child <= element
				return hole;
			else
				//element < left child
				return left;
		}
	}
	
	public String toString() {
		String theHeap = new String("The heap: \n");
		for(int i =0; i <= lastIndex ; i++)
			theHeap = theHeap + i + ". " + elements.get(i) + "\n"; 
		
		return theHeap;
	}
}

