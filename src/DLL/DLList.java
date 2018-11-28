package DLL;


public class DLList<E> {

	//data members
	private DLLNode<E> dllist, tail;
	
	
	//constructors
	public DLList() {
		dllist = tail = null;
	}
	
	//methods
	//first add method, which adds the item to the end of the list
	//or, if the list empty, just add the first node
	public void add(E newData) {
		//lets create a new DLLNode for this data
		DLLNode<E> newNode = new DLLNode<E>(newData);
		
		//if the list is completely empty, 
		//newNode will be the first node in the list
		if(dllist == null) {
			dllist = newNode;
			tail = newNode;
		}else {
			//the list has at least one node, so add it
			//to the TAIL!!!
			tail.setNextNode(newNode); //1
			newNode.setPrevNode(tail); //2
			tail = newNode; //update the tail
			
		}
	}
	
	public void add(E newData, E targetData) {
		
		DLLNode<E> newNode = new DLLNode<E>(newData);
		
		//now, find the location to insert the new node
		DLLNode<E> searchResult = search(targetData);
		
		if(searchResult != null) {
			//that means something has found!
			if(searchResult != tail) {
				//if the data found somewhere in the middle of the list
				
				//attach newNode's prevNode to the list
				newNode.setPrevNode(searchResult); 
				
				//attach newNode's nextNode to the list
				newNode.setNextNode(searchResult.getNextNode());
				
				//break the original bonds in the list
				//and update them with the newNode
				searchResult.setNextNode(newNode);
				((DLLNode<E>) newNode.getNextNode()).setPrevNode(newNode);
			}else {
				//if the target is found at the end!
				this.add(newData);
			}
		}
	}
	
	public DLLNode<E> search(E targetData){
		DLLNode<E> location;
		location = dllist; //set the location to the first node!
		
		//if the list empty
		if(dllist == null) {
			return null; //nothing to return, list is empty
		}else {
			//if the list is not empty, do the actual search!
			while(location != null) {
				if(location.getData().equals(targetData))
				{
					return location; //it is found!
				}
				else
					location = (DLLNode<E>) location.getNextNode();
			}
		}
		return null;
	}
	
	public E remove(E targetData){
		DLLNode<E> location;
		location = dllist; //set the location to the first node!
		
		//if the list empty
		if(dllist == null) {
			return null; //nothing to return, list is empty
		}else {
			//if the list is not empty, do the actual search!
			while(location != null) {
				if(location.getData().equals(targetData))
				{
					if(location==dllist)
					{
						if(location==tail)
						{
							dllist = tail = null;
							return location.getData();
						}
						((DLLNode<E>) location.getNextNode()).setPrevNode(location.getPrevNode());
						dllist = (DLLNode<E>) location.getNextNode();
						return location.getData();
					}
					else
					{
						location.getPrevNode().setNextNode(location.getNextNode());
						((DLLNode<E>) location.getNextNode()).setPrevNode(location.getPrevNode());
						return location.getData();
					}
				}
				else
					location = (DLLNode<E>) location.getNextNode();
			}
		}
		return null;
	}
	
	public boolean isEmpty()
	{
		return dllist == null;
	}
	public String toString() {
		//go through list,
		//collect and pack all data into one string
		DLLNode<E> parser = dllist;
		String result = "";
		
		while(parser != null) {
			result += parser.getData();
			parser = (DLLNode<E>) parser.getNextNode();
		}
		
		return result;
	}
}
