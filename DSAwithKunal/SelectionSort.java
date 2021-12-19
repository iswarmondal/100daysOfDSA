import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum numver in the remaining array and swap it with the
            // currend index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int j = 0; j <= last; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 73, 4 };
        System.out.println(Arrays.toString(arr));
    }
}
