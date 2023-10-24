package Day6.DemonstrateTree ;
import Day5.Trees.* ;
public class Main {
    public static void main( String[] args ) {
        int arr[] = {50,25,12,0,0,37,30,0,0,0,75,62,0,70,0,0,87,0,0} ;
        Tree t = new Tree(50) ;
        t.constructTree(arr) ;
        t.display( t.getRoot() ) ;
    }
}
