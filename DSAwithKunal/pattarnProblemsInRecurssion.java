package DSAwithKunal;

public class pattarnProblemsInRecurssion {
    public static void triangle(int r, int c) {
        if (r == 0)
            return;

        if (r > c) {
            triangle(r, c + 1);
            System.out.print("*");
        } else {
            triangle(r - 1, 0);
            System.out.println();
        }
    }

    public static void revTriangle(int r, int c) {
        if (r == 0)
            return;

        if (r > c) {
            System.out.print("*");
            revTriangle(r, c + 1);
        } else {
            System.out.println();
            revTriangle(r - 1, 0);
        }
    }

    public static void main(String[] args) {
        triangle(3, 0);
    }
}
