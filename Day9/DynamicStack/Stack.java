package Day9.DynamicStack ;

import Day2.LinkedList.* ;

 


public class Stack {
    LinkedList l = new LinkedList() ;
    int tosLimit = 100 ;
    int tos = -1 ;
    public boolean isEmpty ( ) {
        return tos == -1 ;
    }
    public boolean isFull ( ) {
        return tos == tosLimit ;
    }

    public boolean push (int val) {
        if( isFull( ) ) {
            System.out.println( "Stack Overflow" ) ;
            return false ;
        } else {
            tos++ ;
            if(tos==-1){
                l.addFirst(tos) ;
            }else{
                l.insertNode( tos, val) ;
            }
        }
        return true ;
    }

    public int pop ( ) {
        if(isEmpty()){
            System.out.println(" Stack is empty ") ;
        }  
        tos-- ;
        return l.removeLast().data ;
    }
}
