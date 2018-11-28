package GMC;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>>{
    
    private AnyType element;
    private BinaryNode<AnyType> left;
    private BinaryNode<AnyType> right;
    private BinaryNode<AnyType> root;
    
    public BinarySearchTree( ){ root = null; }
    
    public void makeEmpty( ){ root = null; }
    public boolean isEmpty( ){ return root == null; }
    public BinaryNode<AnyType> getRoot(){return root;}

    public void insert( AnyType x ){ root = insert( x, root ); }
    public void remove( AnyType x ){ root = remove( x, root ); }

    /**
   * Print the tree contents in sorted order.
   */
   public void printTree( ){
   
       if( isEmpty( ) )
           System.out.println( "Empty tree" );
       else
            printTree( root );
   }
   
   /**
   * Internal method to print a subtree in sorted order.
   * @param t the node that roots the subtree.
   */
   private void printTree( BinaryNode<AnyType> t ) {
        if( t != null ) {
            printTree( t.left );
            System.out.println( t.element );
            printTree( t.right );
       }
   }




    
    private boolean contains( AnyType x, BinaryNode<AnyType> t ){

        if( t == null )
            return false;
        
        int compareResult = x.compareTo( t.element );
        
        if( compareResult < 0 )
            return contains( x, t.left );
        else if( compareResult > 0 )
            return contains( x, t.right );
        else
            return true; // Match
    }
    

       /**
    * Internal method to find the smallest item in a subtree.
    * @param t the node that roots the subtree.
    * @return node containing the smallest item.
    */
    private BinaryNode<AnyType> findMin( BinaryNode<AnyType> t ){
        if( t == null )
            return null;
        else if( t.left == null )
            return t;

        return findMin( t.left );
    }


        /**
    * Internal method to find the largest item in a subtree.
    * @param t the node that roots the subtree.
    * @return node containing the largest item.
    */
    private BinaryNode<AnyType> findMax( BinaryNode<AnyType> t ){
        if( t != null )
            while( t.right != null )
                t = t.right;
        return t;
    }

    
        /**
    * Internal method to insert into a subtree.
    * @param x the item to insert.
    * @param t the node that roots the subtree.
    * @return the new root of the subtree.
    */
    private BinaryNode<AnyType> insert( AnyType x, BinaryNode<AnyType> t ){
        if( t == null )
            return new BinaryNode<>( x, null, null );

        int compareResult = x.compareTo( t.element );

        if( compareResult < 0 )
            t.left = insert( x, t.left );
        else if( compareResult > 0 )
        t.right = insert( x, t.right );
        else; // Duplicate; do nothing

        return t;
    }


    /**
    * Internal method to remove from a subtree.
    * @param x the item to remove.
    * @param t the node that roots the subtree.
    * @return the new root of the subtree.
    */
    private BinaryNode<AnyType> remove( AnyType x, BinaryNode<AnyType> t ){
        if( t == null )
            return t;
        // Item not found; do nothing

        int compareResult = x.compareTo( t.element );
        if( compareResult < 0 )
            t.left = remove( x, t.left );
        else if( compareResult > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ){
             // Two children
            t.element = findMin( t.right ).element;
            t.right = remove( t.element, t.right );
        }else
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }



    public void traverseInOrder(BinaryNode<AnyType> node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.element);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(BinaryNode<AnyType> node) {
        if (node != null) {
            System.out.print(" " + node.element);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(BinaryNode<AnyType> node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.element);
        }
    }



    //the node class
    public static class BinaryNode<AnyType>{

            private AnyType element;
            private BinaryNode<AnyType> left;
            private BinaryNode<AnyType> right;

        // Constructors
        public BinaryNode( AnyType theElement ){ 
            this( theElement, null, null );
        }

        public BinaryNode( AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt ){
            element = theElement; left = lt; right = rt;
        }
    }
}
