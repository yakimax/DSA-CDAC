package Day2.LinkedList ;

class NodeNotFound extends Exception {
    public String toString(){
        return "NodeNotFound" ;
    }
} 


class Node {
    int data ;
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


public class LinkedList {
    Node head = null ;
    Node tail = null ;
    int size = 0 ;

    public void addFirst ( int val ) {
        if( head != null ) {
            System.out.println("Head already Exist") ;
        }else{ 
            Node node = new Node(val) ;
            head = node ;
            tail = node ;
            size++ ;
        }
    }

    public void addLast ( int val ) {
        if( tail != null ) {
            addNode(val) ;
        }else{ 
            addFirst(val) ;
        }
    }

    public Node getFirst () throws NodeNotFound{
        if( head != null ){ 
            return head ;
        }
        throw new NodeNotFound() ;
    }

    public Node getLast() throws NodeNotFound{
        if( tail != null ){ 
            return tail ;  
        }
        throw new NodeNotFound() ;
    }

    public void addNode ( int val ) {
        if ( head == null ) {
            addFirst(val) ;
        } else {
            Node node = new Node(val) ;
            tail.next = node ;
            tail = tail.next ;
            size++ ;
        }
    }
    
    public void insertNode(int afterIdx,int val) {
        if(t){

        }
    }

    public int size(){
        return size ;
    }

    public void displayList (){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + " -> ") ;
            if(temp.next == null){
                System.out.print("NULL") ;     
            }
            temp = temp.next ;
        }
    }
}
