public class QuickSort {
    // Print array function
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Quick sort function
    public static void quickSort(int arr[], int si, int ei) {
        // Base case..
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei); // This gives Pivot index
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    // Partition function
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // last element
        int i = si-1; // This will help for making place for smaller elements
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Now find the correct place for pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 7, 4, 9, 6};
        quickSort(arr, 0, arr.length-1);

        printArr(arr);
    }
}