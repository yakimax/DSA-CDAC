package Day9.DynamicQueue ;
import Day2.LinkedList.* ;

public class Queue {
    int size = -1 ;
    static final int maximSize = 100 ;
    LinkedList list = new LinkedList() ;
    public Node front = null ;
    public Node rear = null ;

    public boolean isEmpty ( ) {
        return front == null  ? true : false ;
    }

    public boolean isFull ( ) {
        return size == maximSize ;
    }

    public void enqueue ( int val ) { 
        if(isFull()){
            System.out.println("Max Size Limit Reached") ;
            return ;
        }
        if ( list.head == null ) {
            list.addFirst ( val ) ;
            front = rear = list.head ;
        } else { 
            list.addNode ( val ) ;
            rear = list.tail ;
        }
    }

    public int dequeue ( ) {
        if ( isEmpty() ) {
            System.out.println("Empty Queue") ;
        } else {
            try {
                Node rem = list.removeFirst() ;
                if(rem != null){
                    front = list.head ;
                    return rem.data ;                     
                }
            } catch ( Exception e ) {
                System.err.println(" Queue Empty " ) ;
            }
        }
        return 0 ;
    }
}
