package DSA_CDAC.Recursion_practice.String_Subsequences ;
import java.util.* ;

//  Edge cases/Test cases

public class Main {

    static Set<String>s = new HashSet<>() ;
    //Recurssive Approach : using two strings
    public static List<String> stringSubsequences_recursion_twoStrings( String str , String ans ) {
        if( str.length() == 0 ) {                   //base condition
            List<String>l = new ArrayList<>() ;
            l.add(ans) ;
            return l ;
        }
        char ch = str.charAt(0) ;
        List<String> left = stringSubsequences_recursion_twoStrings(str.substring(1),ans) ;
        List<String> right = stringSubsequences_recursion_twoStrings(str.substring(1),ans+ch) ;
        left.addAll(right) ;
        return left ;
    }

    //Recurssive Approach : using sets
    public static void stringSubsequences_recursion_sets(String str) {
        if( str.length() == 0 ) {                   //base condition
            return ;
        }
        s.add(str) ;
        stringSubsequences_recursion_sets(str.substring(0,str.length()-1)) ;
        stringSubsequences_recursion_sets(str.substring(1,str.length())) ;
    }

    //Iterative Approach
    public static void stringSubsequences_iterative ( String str ) {

    }

    public static void main(String[] args) {
        String str ;
        Scanner scn = new Scanner(System.in) ;
        System.out.print("Enter String : ") ;
        str = scn.next() ;
        // stringSubsequences_recursion_sets(str) ;
        // Iterator itr = s.iterator() ;
        // System.out.print("[") ;
        // while(itr.hasNext()){
        //     System.out.print(itr.next()+ ",") ;
        // }
        // System.out.print("]") ;
        System.out.println(stringSubsequences_recursion_twoStrings(str,"")) ;
    }
}