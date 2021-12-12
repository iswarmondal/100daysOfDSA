package questions;

public class findInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[0] < arr[end]) {

                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int ans(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);

        int try1 = binSearch(arr, target, 0, peak);
        if (try1 == -1) {
            int try2 = binSearch(arr, target, peak, (arr.length - 1));

            if (try2 != -1) {
                System.out.println(try2);
                return try2;
            }
        } else {
            return try1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 4 };
        System.out.println(ans(arr, 6));
    }
}
