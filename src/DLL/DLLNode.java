package DLL;

import GenericSLL.Node;

public class DLLNode <E> extends Node<E>{
	
	private DLLNode<E> prevNode;

	public DLLNode(E initData) {
		super(initData);
		prevNode = null;
		//nextNode is null already;	
	}
	
	//setters and getters for nextNode (NN) inherited from Node class;
	//setters and getters for prevNode required;

	public void setPrevNode(DLLNode<E>prevNode) 
	{
		this.prevNode = prevNode;
	}

	public DLLNode<E> getPrevNode() 
	{
		return prevNode;
	}
	
	/*
	 * setData, getData and toString
	 * inherited from Node class
	 */

}
