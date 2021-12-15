public class LinearSearch {
    public static int linearSearch(int[] arr, int item, int n) {
        if (n == arr.length) {
            return -1;
        }

        if (arr[n] == item) {
            return n;
        } else {
            return linearSearch(arr, item, n + 1);
        }
    }

    public static void main(String[] args) {

    }
}
