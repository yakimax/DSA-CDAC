package Day10.BinarySearch;

public class Main {


    public static void binarySearch( int arr[] ,int key){
        int i = 0 ;
        int j = arr.length-1 ;
        while ( i <= j ) {
            int mid = i + (j-i)/2 ;
            if ( key < arr[mid] ) {
                j = mid - 1 ;
            } else if ( key > arr[mid] ) {
                i = mid + 1 ;
            } else {
                System.out.println("Found at index : " + mid ) ;
                return ;
            }
        }
        System.out.println(" Key not Found " ) ;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9} ;
        binarySearch(arr, 8);

    }
}
