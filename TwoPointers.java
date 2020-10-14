import java.util.Arrays;
public class TwoPointers{
    
    public static void twopointers(int[] arr, int n, int num){
        Arrays.sort(arr);
        int x = 0;
        int y = n-1;
        
        int val1 = 0, val2 = 0, diff = Integer.MAX_VALUE;
        
        while(x < y){
            
            if(Math.abs(arr[x] + arr[y] - num) < diff){
                val1 = arr[x];
                val2 = arr[y];
                diff = Math.abs(arr[x] + arr[y] - num);
            }
            if(arr[x] + arr[y] > num){
                y--;
            }else{
                x++;
            }
        }
        System.out.println("Closest value : "+val1+" & "+val2);
        
        
    }

    public static void main(String []args){
        int[] arr = {12,89,-13,-54,43,7,99,23,51,9};
        int num = 24;
        int n = arr.length;
        twopointers(arr, n, num);
    }
}