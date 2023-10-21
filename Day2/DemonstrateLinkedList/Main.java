package Day2.DemonstrateLinkedList;
import Day2.LinkedList.*;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList() ;
        list.addNode(10) ;
        list.addNode(20) ;
        list.addNode(30) ;
        list.addNode(40) ;
        list.addNode(80) ;
        list.addNode(70) ;
        list.insertNode(6,500) ;
        list.displayList() ;
    }
}
