
// /* 
// Java program for Merge Sort 
// class MergeSort
// {
//     Merges two subarrays of arr[].
//     First subarray is arr[l..m]
//     Second subarray is arr[m+1..r]
//     void merge(int arr[], int l, int m, int r)
//     {
//         Find sizes of two subarrays to be merged
//         int n1 = m - l + 1;
//         int n2 = r - m;
 
//         /* Create temp arrays */
//         int L[] = new int[n1];
//         int R[] = new int[n2];
 
//         /*Copy data to temp arrays*/
//         for (int i = 0; i < n1; ++i)
//             L[i] = arr[l + i];
//         for (int j = 0; j < n2; ++j)
//             R[j] = arr[m + 1 + j];
 
//         /* Merge the temp arrays */
 
//         Initial indexes of first and second subarrays
//         int i = 0, j = 0;
 
//         Initial index of merged subarry array
//         int k = l;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             }
//             else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }
 
//         /* Copy remaining elements of L[] if any */
//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }
 
//         /* Copy remaining elements of R[] if any */
//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }
 
//     Main function that sorts arr[l..r] using
//     merge()
//     void sort(int arr[], int l, int r)
//     {
//         if (l < r) {
//             Find the middle point
//             int m =l+ (r-l)/2;
 
//             Sort first and second halves
//             sort(arr, l, m);
//             sort(arr, m + 1, r);
 
//             Merge the sorted halves
//             merge(arr, l, m, r);
//         }
//     }
 
//     /* A utility function to print array of size n */
//     static void printArray(int arr[])
//     {
//         int n = arr.length;
//         for (int i = 0; i < n; ++i)
//             System.out.print(arr[i] + " ");
//         System.out.println();
//     }
 
//     Driver code
//     public static void main(String args[])
//     {
//         int arr[] = { 12, 11, 13, 5, 6, 7 };
 
//         System.out.println("Given Array");
//         printArray(arr);
 
//         MergeSort ob = new MergeSort();
//         ob.sort(arr, 0, arr.length - 1);
 
//         System.out.println("\nSorted array");
//         printArray(arr);
//     }
// }
// This code is contributed by Rajat Mishra 



import java.util.Arrays;

class merge{
    
    static int[] mergesort(int[] array){
        int n = array.length;
        if(n <= 1){
            return array;
        }
        int midpoint = n/2;
        int left[] = new int[midpoint];
        int[] right;
        if(n % 2 ==0){
            right = new int[midpoint];
        }else{
            right = new int[midpoint+1];
        }
        for(int i=0; i<midpoint; i++){
            left[i] = array[i];
        }
        for(int j=0; j< right.length; j++){
            right[j] = array[midpoint+j];
        }
        int result[] = new int[n];
        left = mergesort(left);
        right = mergesort(right);
        result = merge(left, right);

        return result;
    }
    static int[] merge(int[] left, int[] right){

        int result[] = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer=rightPointer=resultPointer=0;
        while(leftPointer < left.length || rightPointer < right.length){
            if(leftPointer < left.length && rightPointer<right.length){
                if(left[leftPointer] < right[rightPointer]){

                    result[resultPointer++] = left[leftPointer++];
                }else{

                    result[resultPointer++] = right[rightPointer++];
                }
            }
            else if(leftPointer< left.length){
                result[resultPointer++] = left[leftPointer++];
            }
            else if(rightPointer< right.length){
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

    public static void main(String[] args){

        int arr[] = {7,5,6,4,3,1,2,8,5,9};

        System.out.println(Arrays.toString( mergesort(arr)));

    }
}



