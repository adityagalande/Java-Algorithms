// Java code for linearly search x in arr[]. If x 
// is present then return its index position, otherwise 
// return Element not found! 
public class linearSearch{
    
    public static void linearSearch(int[]arr, int n, int x){
        
        int i;
        for(i=0; i<n; i++){
            if(arr[i] == x){
                System.out.println("Element at index position "+(i+1));
                break;
            }
        }
        
        if(i == n){
            System.out.println("Element not found!");
        }
    }

     public static void main(String []args){
        int[] arr = { 3, 4, 1, 7, 5 }; 
        int n = arr.length;
        int x = 7;
        linearSearch(arr, n, x);
     }
}