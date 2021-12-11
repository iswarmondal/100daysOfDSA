package questions;

public class findInInfiniteArray {
    public static int find(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return find(arr, target, start, end);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
        System.out.println(ans(arr, 5));
    }
}
