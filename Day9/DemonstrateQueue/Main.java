package Day9.DemonstrateQueue ;
import Day9.DynamicQueue.* ;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue() ;
        // q.enqueue(10) ;
        // q.enqueue(20) ;
        // q.enqueue(30) ;
        // q.enqueue(40) ;
        // // System.out.println ( q.front.data ) ;
        // System.out.println ( q.dequeue() ) ;
        // System.out.println ( q.dequeue() ) ;
        // System.out.println ( q.dequeue() ) ;
        // System.out.println ( q.dequeue() ) ;
 
        for(int i = 0 ; i < 10 ; i++){
            q.enqueue(i);
        }
        while(!q.isEmpty()){
            System.out.println(q.dequeue( )) ;
        }
    }
}
