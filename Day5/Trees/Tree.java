package Day5.Trees ;


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
    public Tree (int data) {
        this.root = new Node(data) ;
    }
    public Node getRoot() {
        return this.root ;
    }
    public void constructTree(int arr[]) {
        root.data = arr[0] ;
        Stack< Pair > st = new Stack<>() ;
        int i = 1 ;
        st.push ( new Pair(root,0) ) ;
        while ( st.size() > 0 && i < arr.length  ) { 
            Pair p = st.peek() ;
            if ( p.stage == 0 ) {
                p.stage++ ;
                if ( arr[i] == 0 ) {
                    p.node.left = null ;
                    i++ ;
                } else {  
                    Node temp = new Node( arr[i++] ) ;
                    p.node.left = temp ;
                    st.push( new Pair(temp,0) ) ;
                }
            } else if ( p.stage == 1 ) {
                p.stage++ ;
                if ( arr[i] == 0 ) {
                    p.node.right = null ;
                    i++ ;
                } else {
                    Node temp = new Node( arr[i++] ) ;
                    p.node.right = temp ;
                    st.push( new Pair(temp,0) ) ;
                }
            } else {
                st.pop() ;
            }
        }
    }
    public void display ( Node root ) {
        if(root == null) {
            System.out.println("null") ;
            return  ;
        }
        System.out.println(root.data) ;
        display ( root.left ) ;
        display ( root.right ) ;
    }
}
