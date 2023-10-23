// package Day5.Tree ;


import java.util.* ;
class Node {
    int data ;
    Node left , right ;
    Node ( ) {
        this.left = null ;
        this.right = null ;
    }
    Node ( Node left , Node right ) {
        this.left = left ;
        this.right = right ;
    }
    Node ( int val ) {
        this.data = val ;
        this.left = null ;
        this.right = null ;
    }
}

class Pair {
    int stage ;
    Node node ;
    Pair ( Node node , int stage ) {
        this.stage = stage ;
        this.node = node ;
    }
}

public class Tree {
    Node root ;
    Tree ( ) {
        this.root = new Node() ;
    }
    Tree (int data) {
        this.root = new Node(data) ;
    }
    void constructTree(int arr[]) {
        Stack< Pair > st = new Stack<>() ;
        int i = 0 ;
        st.push ( new Pair(root,0) ) ;
        while ( st.size() > 0 ) {
            Pair p = st.pop() ;
            if ( p.stage == 0 ) {
                p.stage++ ;
                Node temp = new Node( arr[i++] ) ;
                p.node.left = temp ;
                st.push(p) ;
            } else if ( p.stage == 1 ) {
                p.stage++ ;
                Node temp = new Node( arr[i++] ) ;
                p.node.right = temp ;
                st.push(p) ;
            } else {
                
            }
        }
    }
}
