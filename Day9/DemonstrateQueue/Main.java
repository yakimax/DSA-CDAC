package Day9.DemonstrateQueue ;
import Day9.DynamicQueue.* ;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue() ;
        for ( int i = 0 ; i < 10 ; i++ ) {
            q.enqueue(i) ;
        }
        while( !q.isEmpty() ) {
            System.out.println(q.dequeue( )) ;
        }
    }
}
