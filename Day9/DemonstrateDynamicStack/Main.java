package Day9.DemonstrateDynamicStack ;

import Day9.DynamicStack.*;
public class Main {
    public static void main( String[] args ) {
        Stack st = new Stack() ;
        st.push ( 0 ) ;
        st.push ( 1 ) ;
        st.push ( 2 ) ;
        st.push ( 3 ) ;
        while(st.isEmpty()){
            System.out.println(st.pop()) ;
        }
    }
}
