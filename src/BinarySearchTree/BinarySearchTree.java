package BinarySearchTree;

//<E extends Comparable<E>>: means that Generic types
//that this BST accepts as nodes, HAS TO BE comparable
//we define our constraints here in the class signature.
//<E extends Comparable<E>>: means that Generic Types
//that this BST accepts as nodes, HAS TO BE comparable
//we define our constraint here in the class signature
public class BinarySearchTree <E extends Comparable<E>>{

	//data members
	private int size;
	private BSTNode<E> root;
	
	//constructors
	public BinarySearchTree() {
		size = 0;
		root = null;
	}
	
	public BinarySearchTree(E data) {
		//add a node to the tree immediately
		root = new BSTNode<E>(data);
	}
	
	//public methods
	public void clear() {
		root = null;
		size = 0; //update the number of elements in the tree
	}
	
	
	public boolean isEmpty() {
		return root == null; // alternative return size==0;
	}
	
	public BSTNode<E> getRoot(){
		return root;
	}
	
	public void setRoot(BSTNode<E> root) {
		this.root = root;
		System.out.println("this will never be called!!!");
	} 
	
	public boolean contains(E data) {
		return contains(data, root);
	}
	
	public boolean contains(E data, BSTNode<E> myRoot) {
		
		//my tree (myRoot) is empty
		if( myRoot == null)
			return false;
		
		//now, we need to figure out if we need to go left, or right
		int result = data.compareTo(myRoot.getData());
		
		if(result < 0) //go to left
			return contains(data, myRoot.getLeftNode());
		else if(result > 0)
			return contains(data, myRoot.getRightNode());
		else
			return true;			
	}
		
	//adding items into the BST
	//this is the wrapper method for the one which takes a node, and data
	public void insert(E data) {
		root = insert(data, root);
		size++;
	}
	
	//this is another insert method 
	//to test the BST easily
	//instead of inserting items one by one manually,
	//we can pass an array of items, and insert all 
	public void insert(E [] dataArray) {
		for(E data: dataArray) {
			root = insert(data, root);
			size++;
		}
	}
	
	public BSTNode<E> insert(E data, BSTNode<E> myRoot){
		if(myRoot == null) {
			//if the tree is empty
			//or the spot is found
			return new BSTNode<>(data, null, null);
		}
		
		//tree is not empty, we need to decide if 
		//we want to go to left or right subtree
		int result = data.compareTo(myRoot.getData());
		
		if(result < 0) {
			//the value we're trying to add needs to be added
			//to the LEFT subtree
			myRoot.setLeftNode(insert(data, myRoot.getLeftNode()));
		}else {
			//the value we're trying to add needs to be added
			//to the RIGHT subtree
			myRoot.setRightNode(insert(data, myRoot.getRightNode()));
		}
		
		return myRoot;
	}
	
	//this is the wrapper method for the actual remove method
	public void remove(E data) {
		root = remove(data, root);	
	}
	
	public BSTNode<E> remove(E data, BSTNode<E> myRoot) {
		if(myRoot == null)
			return null; //the tree is empty... nothing to remove.
		
		//go left or right?
		int result = data.compareTo(myRoot.getData());
		
		if(result < 0) {
			//going down on the LEFT subtree, trying to find
			//the node to remove
			myRoot.setLeftNode(remove(data, myRoot.getLeftNode()));
		}else if(result >0) {
			//going down on the RIGHT subtree, trying to find
			//the node to remove
			
			myRoot.setRightNode(remove(data, myRoot.getRightNode()));
			
		}else if(myRoot.getLeftNode() != null && myRoot.getRightNode() != null) {
			//left and right nodes exist, 
			//the node we're trying remove has TWO children!!
			
			//first, find the minimum value within the RIGHT
			//subtree
			myRoot.setData(findMin(myRoot.getRightNode()).getData());
			
			myRoot.setRightNode(remove(myRoot.getData(), myRoot.getRightNode()));
		}else {
			//it has only one child on the left hand side
			if(myRoot.getLeftNode() != null)
				 myRoot = myRoot.getLeftNode();
			else
				myRoot = myRoot.getRightNode();			
		}	
		return myRoot;	
	}
	
	//we don't need to compare any values of any nodes here,
	//because, if we just go down to the last node 
	//on the left hand side, it is THE MINimum value
	//by design...
	public BSTNode<E> findMin(BSTNode<E> rootOfTheSubtree){
		if(rootOfTheSubtree == null)
			return null;
		else if(rootOfTheSubtree.getLeftNode() == null)
			return rootOfTheSubtree;
		else
			return findMin(rootOfTheSubtree.getLeftNode());
	}
	
	//we want to print the whole tree in Preorder mode
	public void printInPreorder() {
		this.printInPreorder(root);
	}
	
	public void printInPreorder(BSTNode<E> myRoot) {
		System.out.print(myRoot.getData() + "_");
		
		//print starting from the left node
		if(myRoot.getLeftNode() != null)
			printInPreorder(myRoot.getLeftNode());
		
		//then do the right hand side
		if(myRoot.getRightNode() != null)
			printInPreorder(myRoot.getRightNode());		
	}
	
	//we want to print the whole tree in Inorder mode
		public void printInorder() {
			this.printInorder(root);
		}
		
		public void printInorder(BSTNode<E> myRoot) {
				
			//print starting from the left node
			if(myRoot.getLeftNode() != null)
				printInorder(myRoot.getLeftNode());
			
			System.out.print(myRoot.getData() + "_");
			
			//then do the right hand side
			if(myRoot.getRightNode() != null)
				printInorder(myRoot.getRightNode());		
		}	
		
		//we want to print the whole tree in Postorder mode
				public void printInPostorder() {
					this.printInPostorder(root);
				}
				
				public void printInPostorder(BSTNode<E> myRoot) {
						
					//print starting from the left node
					if(myRoot.getLeftNode() != null)
						printInPostorder(myRoot.getLeftNode());
					
					
					//then do the right hand side
					if(myRoot.getRightNode() != null)
						printInPostorder(myRoot.getRightNode());	
					
					System.out.print(myRoot.getData() + "_");
					
				}	
}
