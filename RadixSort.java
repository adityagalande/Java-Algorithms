import java.util.Arrays;
public class RadixSort{
    
    public static void radixsort(int[] arr, int n){
        
        int max=0;
        for(int m=0; m<n; m++){
            if(max < arr[m]){
                max = arr[m];
            }
        }
        
        for(int pos=1; max/pos>0; pos *=10){
            countingsort(arr,n,pos);
        }
        System.out.println("Radix Sort : "+Arrays.toString(arr));
    }
    
    public static void countingsort(int[] arr, int n, int pos){
        int[] temp = new int[n];
        int[] count = new int[10];
        
        for(int i=0; i<n; i++){
            count[(arr[i]/pos)%10]++;
        }
        
        for(int j=1; j<10; j++){
            count[j] +=count[j-1]; 
        }
        
        for(int k=n-1; k>0; k--){
            temp[--count[(arr[k]/pos)%10]] = arr[k];
        }
        
        for(int l=0; l<n; l++){
            arr[l] = temp[l];
        }
    }
    public static void main(String []args){
        int[] arr = {321,897,672,324,761,109,542,219,987};
        int n = arr.length;
        radixsort(arr, n);
    }
}