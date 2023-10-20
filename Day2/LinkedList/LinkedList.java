package Day2.LinkedList ;

class NodeNotFound extends Exception{
    public String toString(){
        return "NodeNotFound" ;
    }
}



class Node {
    int data ;
    Node node ;
    Node(){}
    Node (int val ){
        this.data = val ;
    }
    Node (Node node ){
        this.node = node ;
    }
    
    Node (int val ,Node node ){
        this.data = val ;
        this.node = node ;
    }
    void setData( int val ) {
        this.data = val ;
    }
    void nextNode(Node node) {
        this.node = node ; 
    }
}

public class LinkedList {
    Node head = null ;
    Node tail = null ;
    int size = 0 ;


    void addFirst ( int val ) {
        if( head != null ) {

        }else{ 
            Node node = new Node(val) ;
            head = node ;
            size++ ;
        }
    }

    void addLast ( int val ) {
        if( head != null ) {

        }else{ 
            Node node = new Node(val) ;
            head = node ;
            size++ ;
        }
    }

    Node getFirst () throws NodeNotFound{
        if( head != null ){ 
            return head ;
        }
        throw new NodeNotFound() ;
    }

    Node getLast() throws NodeNotFound{
        if( tail != null ){ 
            return tail ;  
        }
        throw new NodeNotFound() ;
    }

    void addNode ( int val ) {
        if( head != null ) {
            System.out.println( "Head already exist" ) ;
        }
        if( head == null ) {
             
        }
    }
    
}
