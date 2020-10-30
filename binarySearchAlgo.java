public class binarySearchAlgo{
    
    public static int binarySearch(int[] arr, int n, int key){
        int l = 0;
        int r = n;
        int mid  = 0;
        
        while(l<r){
           int mid = (l+r-1)/2;
            
            if(key == arr[mid]){
                return mid;//arr[mid];
            }else if(key > arr[mid]){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
return -1;
    }

     public static void main(String []args){
         int[] arr = {2, 7, 18, 21, 23, 29, 34, 51, 54, 76, 90,88};
         int n = arr.length;
         int key = 7;
         System.out.println(binarySearch(arr, n, key));
     }
}