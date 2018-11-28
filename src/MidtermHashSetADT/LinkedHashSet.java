package MidtermHashSetADT;



public class LinkedHashSet<E> implements LinkedHashSetInterface <E> {
	
	private static final int DEFAULT_CAPACITY = 10;
	private LinkedHashSetNode <E>lhset, tail, head;
	private int size;
	@SuppressWarnings("unused")
	private int capacity;
	
	public LinkedHashSet() {
		lhset = tail = head = null;
		capacity = DEFAULT_CAPACITY;
		size = 0;
	}

	public LinkedHashSetNode<E> search(E targetData) {	
		
		LinkedHashSetNode<E> location;		
		
			if(!isEmpty()) {
			
				location = (LinkedHashSetNode<E>) lhset;		
			
				do {
					location = (LinkedHashSetNode<E>) location.getNext();
				
					if(location.getInfo().equals(targetData)) {
					
						return location;
					}				
					
				}while((LinkedHashSetNode<E>)location.getNext() != null);
			}
			return null;
	}
	

	public void add(E e) {
		LinkedHashSetNode<E> newNode = new LinkedHashSetNode<E>(e);
		
		//if the list is completely empty, 
		//newNode will be the first node in the list
		if(lhset == null) {
			lhset = newNode;
			tail = newNode;
			size++;
		}else {
			//the list has at least one node, so add it
			//to the TAIL!!!
			tail.setNext(newNode); //1
			newNode.setPrev(tail); //2
			tail = newNode; //update the tail
			size++;
		}
	}
	
	public void add(E e, E targetData) {
		
		LinkedHashSetNode<E> newNode = new LinkedHashSetNode<E>(e);
		
		//now, find the location to insert the new node
		LinkedHashSetNode<E> searchResult = search(targetData);
		
		if(searchResult != null) {
			//that means something has found!
			if(searchResult != tail) {
				//if the data found somewhere in the middle of the list
				
				//attach newNode's prevNode to the list
				newNode.setPrev(searchResult); 
				//attach newNode's nextNode to the list
				newNode.setNext(searchResult.getNext());
				
				//break the original bonds in the list
				//and update them with the newNode
				searchResult.setNext(newNode);
				((LinkedHashSetNode<E>) newNode.getNext()).setPrev(newNode);
			}else {
				//if the target is found at the end!
				size++;
				this.add(e);
			}			
		}
	}

	@Override
	public Object remove(E e) {	
		
		LinkedHashSetNode<E> current = search(e);
		
		if(current ==null) {
			return null;
		}
		LinkedHashSetNode<E> prev = current.prev;
		LinkedHashSetNode<E> next = current.next;
		
		if(prev == null) {
			this.head = current.next;
			this.head.prev=null;
		}
		
		if(next == null) {
			this.tail=current.prev;
			this.tail.next = null;
		}
		
		if (prev != null || next != null) {
			LinkedHashSetNode<E> temp = current.prev;
			temp.next = current.next;
			temp = current.next;
			temp.prev = current.prev;
			
		}
		size--;
		return current;
	}
		

	public boolean contains(E e) {
		LinkedHashSetNode<E> exists = search(e);
		
		if(exists != e) {
			return true;
		}
			return false ;
		
	}

	

	@Override
	public void clear() {
		this.lhset = null;
		System.out.println("THE LIST IS EMPTY");
		size = 0;
		
	}

	@Override
	public boolean isEmpty() {
		if(lhset==null) {
			return true;
		}
		else
		return false;
	}

	@Override
	public int size() {
		return size;
	}
	
public String toString() {
		
	LinkedHashSetNode<E> parser = lhset;
		 
		String result ="";
		
		while(parser != null) {
			result += parser.getInfo();
			parser = (LinkedHashSetNode<E>) parser.getNext();
		}
		
		return result;
		
	}

}
