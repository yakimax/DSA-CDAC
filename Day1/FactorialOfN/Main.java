package Day1.FactorialOfN ;
import java.util.* ;
public class Main {
    static int factorial(int idx){
        if( idx == 0 ){
            return 1 ;
        } 
        int val = idx * factorial(idx-1) ;
        return val ; 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt( ) ;
        System.out.println(factorial(n)) ;
    }
}
