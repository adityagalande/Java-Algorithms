import java.util.*;
class BubbleSort{
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many element you want to enter : ");
        int limit = scan.nextInt();
        
        int[] array = new int[limit];
            
                for(int i=0;i<array.length;i++){
                    System.out.println("Enter Number : ");
                    array[i]=scan.nextInt();
                }
        
                for(int i=0;i<array.length;i++){
                    System.out.print(array[i]+" ");
                }
                boolean flag=true;
                int temp;
                while(flag){
                    flag=false;
                    
                    for(int i=0;i<array.length-1;i++){
                    
                        if(array[i] < array[i+1]){
                            temp=array[i];
                            array[i]=array[i+1];
                            array[i+1]=temp;
                            flag=true;
                        }
                        
                    }
                    
                }
                System.out.println("\nSorted Array : ");
                for(int i=0;i<array.length;i++){
                    System.out.print(array[i]+" ");
                }
     }
}