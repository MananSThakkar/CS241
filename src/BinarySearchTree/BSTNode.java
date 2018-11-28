package BinarySearchTree;

public class BSTNode<E extends Comparable<E>> implements Comparable<BSTNode<E>> {

	//data members
	private BSTNode<E> left;
	private BSTNode<E> right;
	private E data;
	
	//constructors
	public BSTNode(E data) { 
		this(data, null, null);
	}
	
	public BSTNode(E data, BSTNode<E> right, BSTNode<E> left) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	public void setLeftNode(BSTNode<E> left) {
		this.left = left;
	}

	public BSTNode<E> getLeftNode() {
		return left;
	}

	public void setRightNode(BSTNode<E> right) {
		this.right = right;
	}

	public BSTNode<E> getRightNode() {
		return right;
	}

	public void setData(E data) {
		this.data = data;
	}

	public E getData() {
		return data;
	}
	
	@Override
	public int compareTo(BSTNode<E> otherNode) {
		return this.data.compareTo(otherNode.getData());
	}
	
	
	@Override
	public String toString() {
		return data.toString(); 
	
	}
	
}
