package Day3.StaticClass ;

class First {
    static class Node {
        int a ;
        Node node ;
        void myfun () {
            // final static int a = 0 ;
            System.out.println(a) ;
        }
    }
}

public class Main {
    public static void main ( String[] args ) {
        First f = new First() ;
        
    }
}
