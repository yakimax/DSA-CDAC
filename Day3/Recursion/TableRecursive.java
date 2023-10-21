package Day3.Recursion ;

public class TableRecursive {

    public static void printTable ( int forVal ,int idx ) {
        if ( idx > 10 ) {
           return ;
        }
        System.out.println(forVal + " * " + idx +" = " + idx*forVal ) ;
        printTable( forVal , idx+1 ) ;
    }
    public static void main(String[] args) {
        printTable(10,1) ;
    }
}
