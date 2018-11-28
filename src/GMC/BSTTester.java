/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GMC;

/**
 *
 * @author delikasif
 */
public class BSTTester {
    
    public static void main(String [] args){
    
        BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();
        bst1.insert(7);
        bst1.insert(3);
        bst1.insert(2);
        bst1.insert(8);
        bst1.insert(6);
        bst1.insert(14);
       
        
        //bst1.printTree();
        
        /*
        System.out.println("***");
        bst1.remove(2);
        bst1.printTree();
        
        System.out.println("***");
        bst1.remove(3);
        bst1.printTree();
        */
        
        System.out.println("*Traverse In Order*");
        bst1.traverseInOrder(bst1.getRoot());
        
        System.out.println("");
        
        System.out.println("*Traverse Pre Order*");
        bst1.traversePreOrder(bst1.getRoot());
        
        
        System.out.println("");
        
        System.out.println("*Traverse Post Order*");
        bst1.traversePostOrder(bst1.getRoot());
        
        System.out.println("");
        
        bst1.remove(3);
        System.out.println(bst1.getRoot());
        
        
    }
}
