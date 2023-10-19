package Day1.FibonacciSeries ;

import java.util.Scanner;

public class Main { 
    static int fibonacci(int idx){ 
        if( idx <= 2 ){
            return 1 ;
        }
        return fibonacci(idx-1)+fibonacci(idx-2)  ;
    } 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt( ) ;
        System.out.print ("fibonacci val of  " + n + " index is : ") ;
        int val = fibonacci(n) ;
        System.out.println(val) ;
    }
}
