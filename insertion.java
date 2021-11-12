
// Java program for implementation of Insertion Sort
 class Insertion {
    /*Function to sort array using insertion sort*/
    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; //unsort
            int j = i - 1;   // sort
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /// anather way .......................
    static int[] insert(int arr[]){
        
        for(int i=1; i< arr.length ; i++ ){
            int j = i;
            while((j>0) && (arr[j-1] > arr[j])){
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                j--;
            }
          
        }
        return arr;
    }
 
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5,8,4,7};
        int m = arr.length /2;
        System.out.println(m);
        insert(arr);

 
        printArray(arr);
    }
} /* This code is contributed by Rajat Mishra. */