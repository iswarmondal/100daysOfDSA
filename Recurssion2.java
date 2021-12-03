public class Recurssion2 {

    public static int first = -1;
    public static int last = -1;

    public static void printHanoiTower(int n, String sourse, String helper, String dest) {

        if (n == 0) {
            return;
        }

        printHanoiTower(n - 1, sourse, dest, helper);

        System.out.println("Move \"" + n + "\" from " + sourse + " --> " + dest);

        printHanoiTower(n - 1, helper, sourse, dest);

    }

    public static void reverseString(String a, int n) {

        int len = (a.length()) - (n + 1);

        if (len == -1) {
            return;
        }
        System.out.println(a.charAt(len));

        reverseString(a, n + 1);
    }

    public static void firstAndLastOccurance(String a, char b, int n) {

        if (n >= a.length()) {
            return;
        }

        char c = a.charAt(n);

        if (c == b) {

            if (first == -1) {
                first = n;
            } else {
                last = n;
            }

        }
        firstAndLastOccurance(a, b, n + 1);

    }

    // public static boolean checkIfIncreasing(int arr[], int idx) {

    // if (idx == arr.length - 1) {
    // return true;
    // }

    // if (arr[idx] < arr[idx + 1]) {
    // checkIfIncreasing(arr, idx + 1);
    // } else {
    // return false;
    // }

    // }

    public static void rearrangeX(String a, String res, String xNum, int n) {

        if (n == a.length()) {
            System.out.println(res + xNum);
            return;
        }

        if (a.charAt(n) == 'x' || a.charAt(n) == 'X') {
            xNum += "x";
            rearrangeX(a, res, xNum, n + 1);
        } else {
            res += a.substring(n, n + 1);
            rearrangeX(a, res, xNum, n + 1);
        }
    }

    public static boolean[] map = new boolean[25];

    public static void checkDuplicates(String str, int n, String newStr) {

        if (n == str.length() - 1) {
            System.out.println(newStr);
            return;
        }

        char curCharr = str.charAt(n);
        if (map[curCharr - 'a'] == true) {
            checkDuplicates(str, n + 1, newStr);
        } else if (map[curCharr - 'a'] == false) {
            map[curCharr - 'a'] = true;
            newStr += str.substring(n, n + 1);
            checkDuplicates(str, n + 1, newStr);
        }
    }

    public static void subsequence(String str, int n, String newString) {

        if (n == str.length()) {
            System.out.println(newString);
            return;
        }

        char curCharr = str.charAt(n);

        subsequence(str, n + 1, newString + curCharr);
        subsequence(str, n + 1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";

        subsequence(str, 0, "");
    }
}
