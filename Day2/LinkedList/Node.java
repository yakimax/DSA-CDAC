package Day2.LinkedList;

public class Node {
    public int data ;
    Node next ;

    Node(){}
    Node (int val ){
        this.data = val ;
    }
    Node (Node node ){
        this.next = node ;
    }
    Node (int val ,Node node ){
        this.data = val ;
        this.next = node ;
    }
    
    void setData( int val ) {
        this.data = val ;
    }
}

