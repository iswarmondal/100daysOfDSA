package DSAwithKunal;

public class DSAwithKunal {

    public static void printFhib(int first, int second, int n) {

        if (n == 0) {
            return;
        }
        int currrentFib = first + second;
        System.out.println(currrentFib);
        printFhib(second, currrentFib, n - 1);
    }

    public static int fibo(int i) {

        if (i < 2) {
            return i;
        }
        return fibo(i - 1) + fibo(i - 2);
    }

    public static int factorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int sumOfTheDigits(int n) {

        if (n / 10 == 0) {
            return n;
        }
        return (n % 10) + sumOfTheDigits(n / 10);
    }

    public static int reverseTheNumbers(int n) {

        if (n / 10 == 0) {
            return n;
        }

        int m = (n % 10);
        return (m * 10) + reverseTheNumbers(n / 10);
    }

    public static boolean isPal(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPal(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    public static int numZero(String str) {

        int num = 0;

        if (str.length() == 0) {
            return num;
        }

        if (str.charAt(0) == '0') {
            num++;
        }

        return num += numZero(str.substring(1));
    }

    public static int toZero(int i) {
        int step = 0;

        if (i - 1 < 0) {
            return step;
        }

        if (i % 2 == 0) {
            step++;
            return step += toZero(i / 2);
        } else {
            step++;
            return step += toZero(i - 1);
        }
    }

    public static boolean isSorted(int[] arr, int n) {
        if (n == arr.length - 1) {
            return true;
        }

        return (arr[n] < arr[n + 1]) && (isSorted(arr, n + 1));
    }

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

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6, 7 };
        System.out.println(binSearch(arr, 7));
    }
}
