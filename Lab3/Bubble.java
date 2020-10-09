import java.util.*;
public class Bubble{
    public static void Bubbleup(int arr[]){
     int n = arr.length;  
    int temp = 0;  
    for(int i=0; i < n; i++){  
        for(int j=1; j < (n-i); j++){  
            if(arr[j-1] > arr[j]){  
                 
                temp = arr[j-1];  
                arr[j-1] = arr[j];  
                arr[j] = temp;  
                 }  
             }  
        }  
    }
    public static void main(String[] args){
     
    Scanner obj=new Scanner(System.in);  
    System.out.print("Size of an element: ");  
    int n=obj.nextInt();   
    
    int[] array = new int[n];  
    System.out.println("Enter the elements of the array: ");  
    
    for(int i=0; i<n; i++)  
    {  
          array[i]=obj.nextInt();   
    }  
        System.out.println("Array elements are: ");   
        for (int i=0; i<n; i++)   
            {  
                System.out.println(array[i]);  ;

           } 
           System.out.println("Unsorted Array: "); 
           for(int i:array)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        
        
        System.out.println("Sorted Array: ");  
        Bubbleup(array);
         for(int i:array)
        {
            System.out.print(i +" ");
        }     
           
     }
}