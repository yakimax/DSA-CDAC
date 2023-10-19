package Day1.FactorialOfN ;
public class Main {
    static int fibonacci(int idx){ 
        if( idx <= 2 ){
            return 1 ;
        }
        return fibonacci(idx-1)+fibonacci(idx-2)  ;
    }
    public static void main(String[] args) {
        int val = fibonacci(5) ;
        System.out.println(val) ;
    }
}
