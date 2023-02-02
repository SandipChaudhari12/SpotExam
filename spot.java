public class BubbleSort {  
        public static void insertionSort(int array[]) {  
                int n = array.length;  
                for (int j = 1; j < n; j++) {  
                    int key = array[j];  
                    int i = j-1;  
                    while ( (i > -1) && ( array [i] > key ) ) {  
                        array [i+1] = array [i];  
                        i--;  
                    }  
                    array[i+1] = key;  
                } 

     public static void main(String[] args) {  
                 int arr[] ={50,30,20,60,80,10};  
                  
                 System.out.println("Before Bubble Sort");  
                 for(int i=0; i < arr.length; i++){  
                         System.out.print(arr[i] + " ");  
                 }  
                 System.out.println();  
                   
                 bubbleSort(arr);
                  
                 System.out.println("After Bubble Sort");  
                 for(int i=0; i < arr.length; i++){  
                         System.out.print(arr[i] + " ");  
                 } 
         }  
 }  