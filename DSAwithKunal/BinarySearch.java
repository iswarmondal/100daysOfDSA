package DSAwithKunal;

public class BinarySearch {
    public static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = (arr.length - 1);

        while (start <= end) {

            int mid = start + ((end - start) / 2);

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[0] < arr[end]) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {

                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 4, 5, 6, 7 };
        int[] arr2 = { 9, 9, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(orderAgnosticBinarySearch(arr2, 9));
    }
}
