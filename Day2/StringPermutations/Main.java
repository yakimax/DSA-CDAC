package Day2.StringPermutations ; 

public class Main{

    public static void  permute( String str ,String res) {
        if(str.length()==0) {
            System.out.println(res) ;
            return ;
        } 
        for( int i = 0 ;  i < str.length() ; i++ ) {
            String c = "" + str.charAt(0) ;
            String ros = str.substring(1 ) ;
            String result = res+c ;
            permute(ros, result) ;
        }
        return ;
    }
    public static void main( String[] args ) {
        String s = "abc" ;
        permute(s,  "") ;
    }
}