package Day2.LinkedList ;
import Day2.LinkedList .* ;

class NodeNotFound extends Exception {
    public String toString(){
        return "NodeNotFound" ;
    }
}

 


public class LinkedList {
    public Node head = null ;
    public Node tail = null ;
    public int size = 0 ;

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

    public Node getFirst () throws NodeNotFound {
        if( head != null ){ 
            return head ;
        }
        throw new NodeNotFound() ;
    }

    public Node getLast() throws NodeNotFound {
        if( tail != null ){ 
            return tail ;  
        }
        throw new NodeNotFound() ;
    }

    public Node removeLast () {
        if ( head == tail ) {
            Node last = tail ;
            head = tail = null ;
            return last ;
        }
        Node temp = head ;
        while(temp.next.next != null) {
            temp = temp.next ;
        }
        Node last = temp.next ;
        temp.next = null ;
        tail = temp ;
        return last ;
    }

    public Node removeFirst() {
        Node rem = null ;
        if(head == null) {
            System.out.println("List is Empty");
            return rem ;
        }
        if ( head == tail ) {
            rem = head ;
            head = tail = null ; 
        }else if ( head != null ) {
            rem = head ;
            head = head.next ;
         }
         return rem ;
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
        if(tail == null || size < afterIdx ) {
            System.out.println(" Invalid " ) ;
        }else{ 
            Node temp = head ;
            int index = 1 ;
            while ( temp.next != null && index != afterIdx ) {
                temp = temp.next ;
                index++ ;
            }
            Node node = new Node(val) ;
            Node temp2 = temp.next ;
            temp.next = node ;
            node.next = temp2 ;
        }

    }

    public int size() {
        return size ;
    }

    public void displayList () { 
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
