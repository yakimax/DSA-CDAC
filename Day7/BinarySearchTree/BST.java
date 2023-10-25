package Day7.BinarySearchTree ;

class Node {
    Node left , right ;
    int data ;
    Node ( ) {
        this.left = null ;
        this.right = null ;
    }
    Node ( int data ) {
        this.data = data ;
    }
}

public class BST {
    Node root ;
    public BST ( ){
        root = new Node ( ) ;
    }

    public Node insertdata(Node root, int key)
	{
		if(root == null)
		{
			// root = new Node(key) ;
			return root ;
		}
		if(key <= root.data){
			root.left = insertdata(root.left, key) ;
        }else{
			root.right = insertdata(root.right, key) ;
        }
        return root ;
	}
}
