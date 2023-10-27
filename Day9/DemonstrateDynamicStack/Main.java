package Day9.DemonstrateDynamicStack ;

import Day9.DynamicStack.* ;
public class Main {
    public static void main ( String[] args ) {
        Stack st = new Stack() ;
        for ( int i = 0 ; i < 104 ; i++ ) {
            st.push(i) ;
        }
        while ( !st.isEmpty() ) {
            System.out.println(st.pop()) ;
        }
    }
}
