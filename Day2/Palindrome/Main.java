package Day2.Palindrome;

import java.util.*;



public class Main {

    public static boolean palindrome(String str ){
        if ( str.length() <= 1 ) {
            return true ;
        }
        if ( str.charAt(0) != str.charAt(str.length()-1) ) {
            return false ;
        }
        boolean a = palindrome(str.substring(1,str.length()-1) ) ;
        
        return a ;
    } 
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        String s = scn.nextLine() ;
        System.out.println( palindrome(s) ) ;
    }
}
