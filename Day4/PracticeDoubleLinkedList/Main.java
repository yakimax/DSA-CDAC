package Day4.PracticeDoubleLinkedList ;

import Day4.DoublyLinkedList.DoublyLinkedList ;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList() ;
        list.insertNode(0,10) ;
        list.addLast( 20) ;
        list.addLast( 30) ;
        list.addLast( 40) ;
        list.addLast( 50) ;
        list.addLast( 60) ;
        list.addLast( 70) ;
        list.insertNode(3,1) ;
        list.insertNode(2,2) ;
        list.insertNode(1,3) ;
        list.displayList() ;
        list.displayListReverse() ;
    }
}
