public class SearchInRotatedSearchArray {
    public static int search(int arr[], int tar, int si, int ei) {
        // Base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;
        // Target found...
        if (arr[mid] == tar) {
            return mid;
        }

        // Case 01 : Line 01
        if (arr[si] <= arr[mid]) {
            // case a : left part
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);
            }
            else {
                // case b : right part
                return search(arr, tar, mid+1, ei);
            }
        }
        // Case 02 : Line 02
        else {
            // case c : right part
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            } else {
                // case d : left part
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
