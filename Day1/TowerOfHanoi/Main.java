package Day1.TowerOfHanoi ;

public class Main{

    public static void toi(int n,char src,char dest,char aux){
        if(n==0){
            return  ;
        }
        toi(n-1,src,aux,dest) ;
        System.out.println("Moving ring "+n+" From rod "+src+" to rod "+dest) ;
        toi(n-1,aux,dest,src) ;
        // System.out.println("Moving ring "+n+" From rod"+src+"to rod"+dest) ;
    }

    public static void main( String[] args ) {
        toi(3,'A','C','B') ;
    }
}