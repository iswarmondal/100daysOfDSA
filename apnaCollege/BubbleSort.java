package apnaCollege;

public class BubbleSort {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 22, 3, 54, 4, 7, 84, 45, 78 };

        for (int n = 0; n < arr.length - 1; n++) {
            for (int j = 0; j < arr.length - 1 - n; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArr(arr);
    }
}
