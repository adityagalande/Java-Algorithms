import java.util.Arrays;
public class BubbleSort{
    
    public static void bubblesort(int[] arr, int n){
        int temp;
        boolean flag = true;
            
            while(flag){
                flag = false;
                    
                    for(int i=0; i<(n-1); i++){
                        
                        if(arr[i] > arr[i+1]){
                            temp = arr[i];
                            arr[i] = arr[i+1];
                            arr[i+1] = temp;
                            flag = true;
                        }
                    }
            }
            System.out.println("Bubble Sort : "+Arrays.toString(arr));
    }
    
    public static void main(String []args){
        int[] arr = {21,65,79,42,31,98,67,55,10,86,2};
        int n = arr.length;
        bubblesort(arr, n);
    }
}