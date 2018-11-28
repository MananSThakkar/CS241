package BinarySearchTree;


public class BSTNodeTester {

	public static void main(String[] args) {

		//test node with primitive types
		BSTNode<Integer> bst1 = new BSTNode<>(5);
		BSTNode<Integer> bst2 = new BSTNode<>(10);
		BSTNode<Integer> bst3 = new BSTNode<>(3);
		
		BSTNode<String> str1 = new BSTNode<>("John");
		BSTNode<String> str2 = new BSTNode<>("Xeon");
		BSTNode<String> str3 = new BSTNode<>("Abby");
		
		System.out.println(bst1.compareTo(bst2));
		System.out.println(bst1.compareTo(bst3));
		System.out.println();
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		
	}

}
