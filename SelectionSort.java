import java.util.Arrays;
public class SelectionSort{
    
    public static void selectionsort(int[] arr, int n){
        int temp = 0;
        int min;
            
            for(int i=0; i< n-1; i++){
                min = i;
                    for(int j=i+1; j<n; j++){
                        if(arr[j] < arr[min]){
                            min = j;
                        }
                    }
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            
            System.out.println("Sorted Array : "+Arrays.toString(arr));
    }

    public static void main(String []args){
        int[] arr = {64,25,12,22,11,90,1,72,86,34};
        int n = arr.length;
        selectionsort(arr, n);
    }
}