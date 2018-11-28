package BinarySearchTree;

public class BinarySearchTreeTester {

	public static void main(String[] args) {
		
		//prepare a test array
		Integer dataArray[] = {8,3,10,1,6,4,7,14,13};
		
		//create a BST object
		BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();

		//insert all nodes into the tree
		bst1.insert(dataArray);
		
		//print the tree in preorder
		System.out.println();
		bst1.printInPreorder();
		
		System.out.println();
		System.out.println(bst1.findMin(bst1.getRoot()).getData());
		
		
		System.out.println();
		bst1.printInPreorder();
		
		System.out.println();
		bst1.printInorder();
		
		System.out.println();
		bst1.printInPostorder();
		
		bst1.remove(3);
		bst1.remove(10);
		
		System.out.println();
		bst1.printInPreorder();
		
		System.out.println();
		bst1.printInorder();
		
		System.out.println();
		bst1.printInPostorder();
	}

}
