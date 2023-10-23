// package Day5.Tree ;
import java.util.* ;
class Node {
    int data ;
    Node left,right ;
    Node ( ) {
        this.left = null ;
        this.right = null ;
    }
    Node ( Node left ,Node right ) {
        this.left = left ;
        this.right = right ;
    }
    Node (int val) {
        this.data = val ;
        this.left = null ;
        this.right = null ;
    }
}


public class Tree {
    Node root ;
    Tree ( ) {
        this.root = new Node() ;
    }
    void constructTree(int arr) {
        Stack  st = new Stack() ;
        st.push(root) ;
    }
}
