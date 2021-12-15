import java.util.Arrays;

public class BubbleSort {

    static void bubble(int[] arr) {
        boolean swaped = false;

        // Run this the number of elements times
        for (int i = 0; i < arr.length; i++) {
            // for each step the heaviest element will sink to the last of the array
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swaped = true;
                }
            }

            if (!swaped)
                break;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
