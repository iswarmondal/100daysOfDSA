package apnaCollege;

public class Recurssion1 {

    public static int calFactorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_nm1 = calFactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void fibonacci(int n, int a, int b) {

        if (n == 0) {
            return;

        }

        int sum = a + b;
        System.out.println(sum);
        fibonacci(n - 1, b, sum);
    }

    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;

        fibonacci(n, a, b);

    }
}
