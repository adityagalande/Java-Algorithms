import java.util.Arrays;
public class InseretionSort{
    
    public static void insertionsort(int[] arr, int n){
        int temp, j;
            
            for(int i=1; i<n; i++){
                temp = arr[i];
                j=i;
                
                    while(j>0 && arr[j-1] > temp){
                        arr[j] = arr[j-1];
                        j--;
                    }
                arr[j] = temp;
            }
            System.out.println("Inseretion Sort : "+Arrays.toString(arr));
    }
    public static void main(String []args){
        int[] arr = {96,56,42,12,29,43,86,21,3,73,66};
        int n = arr.length;
        insertionsort(arr, n);
    }
}