package Day4.DoublyLinkedList ;


class Node {
    int data ;
    Node next ,prev ;
    Node( ){
        this.next = null ;
        this.prev = null ;
    }
    Node ( int data ) {
        this.data = data ;
    }
}


public class DoublyLinkedList {
    Node head = null ;
    Node tail = null ;
    int size ;
    
 
    public void  addFirst ( int val ) { 
        Node node = new Node(val) ;
            if ( head == null ) { 
                head = tail = node ; 
            } else {
                node.next = head ;
                head.prev = node ;
                head = node ;
            }
        size++ ;
    }


    public void addLast ( int val ) {
        Node node = new Node(val) ;
        if (tail == null) {
            addFirst(val) ;
        }else {
            tail.next = node ;
            node.prev = tail ;
            tail = node ;
            size++ ;
        }
    }
    
    
    public void insertNode ( int idx , int val ) {
        Node node = new Node(val) ;
        if ( head == null || idx == 0 ) {
            addFirst(val) ;
        } else if ( idx == size ) {
             addLast(val) ;
        } else {
            Node temp = head ;
            while( idx > 1 ) {
                idx-- ;
                temp = temp.next ;
            }
            Node after = temp.next ;
            temp.next = node ;
            node.prev = temp ;
            node.next = after ;
            after.prev = node ;
            size++ ; 
        }
    }


    public void deleteFirst () {
        if ( head  == null ) {
            System.out.println(" Empty linkedlist " ) ;
        } else {
            head = head.next ;
            head.prev = null ;
        }
    }


    public void deleteLast () {
        if ( tail  == null ) {
            System.out.println(" Empty linkedlist " ) ;
        } else {
            tail = tail.prev ;
            tail.next = null ;
        }
    }

    
    public void deleteNode(int idx){
        if( head == null ){
            System.out.println("Empty list") ; 
        } else if ( idx > size ) {
            System.out.println("Invalid") ;
        } else if (size==idx) {
            deleteLast();
        } else { 
            Node temp = head ;
            while (idx > 1) {
                idx++ ;
                temp = temp.next ;
            } 
            temp.next = temp.next.next ;
            temp.next.prev = temp ;
        }
    }

    
    public void displayList(){
        Node temp = head ;
        while ( temp != null ) {
            System.out.print(temp.data + "->") ;
            temp = temp.next ;
        }
        System.out.println("null" ) ;
    }
    
    
    public void displayListReverse(){
        Node temp = tail ;
        while ( temp != null ) {
            System.out.print( temp.data + "->"  ) ;
            temp = temp.prev ;
        }
        System.out.print ("null" ) ;
    }
}
