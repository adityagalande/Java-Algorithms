import java.util.Arrays;
public class CountingSort{
    
    public static void countingsort(int[] arr, int n){
        int[] temp = new int[n];
        int[] count = new int[10];
        
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        
        for(int j=1; j<count.length; j++){
            count[j] += count[j-1];
        }
        
        for(int k=n-1; k>=0; k--){
            temp[--count[arr[k]]] = arr[k];
        }
        
        for(int l=0; l<n; l++){
            arr[l] = temp[l];
        }
        System.out.println("Counting Sort : "+Arrays.toString(arr));
    }
    
    public static void main(String []args){
    
        int[] arr = {8,4,2,5,1,0,7,6,1,2,3,7,5,4,8,2,7};
        int n = arr.length;
        countingsort(arr, n);
    }
}