// Java implementation of ShellSort
class ShellSort
{
	/* An utility function to print array of size n*/
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
    static void sort(int arr[]){
        int n = arr.length;
        for(int gap=n/2; gap>0; gap /=2){
            for(int out=gap; out<n; out++){
                int temp = arr[out];
                int in =out;
                while(in>=gap && arr[in-gap] > temp){
                    arr[in]=arr[in-gap];
                }
                arr[in]= temp;

            }
        }


     }


		public static void main(String args[])
	{
		int arr[] = {12, 34, 54, 2, 3};
		System.out.println("Array before sorting");
		printArray(arr);

		ShellSort ob = new ShellSort();
		sort(arr);

		System.out.println("Array after sorting");
		printArray(arr);
	}
}
/*This code is contributed by Rajat Mishra */
