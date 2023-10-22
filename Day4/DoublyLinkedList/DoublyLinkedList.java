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
 
    void  addFirst ( int val ) { 
        Node node = new Node(val) ;
            if ( head == null ) { 
                head = tail = node ; 
            } else {
                node.next = head ;
                head.prev = node ;
                head = node ;
            }
    }

    void addLast ( int val ) {
        Node node = new Node() ;
        if (tail == null) {
            addFirst(val) ;
        }else {
            tail.next = node ;
            node.prev = tail ;
            tail = node ;
        }
    }

    void addNodeAt ( int idx , int val ) {
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
        }
    }

    void deleteFirst () {
        if ( head  == null ) {
            System.out.println(" Empty linkedlist " ) ;
        } else {
            head = head.next ;
        }
    }
}
