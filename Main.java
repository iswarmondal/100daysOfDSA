import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // // IF ELSE STATEMENT
        // if (num == 0) {
        // System.out.println("It's Zero Bro !");
        // } else if (num % 2 == 0) {
        // System.out.println("It's even bro");
        // } else if (num % 2 != 0) {
        // System.out.println("It's odd bro");
        // } else {
        // System.out.println("Who are you !");
        // }

        // // SWITCH STATEMENT
        // int btn = sc.nextInt();
        // switch (btn) {
        // case 1:
        // System.out.println("The botton was 1");
        // break;

        // case 2:
        // System.out.println("The button was 2");
        // break;

        // case 3:
        // System.out.println("This was 3");
        // break;

        // default:
        // System.out.println("What have you done -_(''/)_-");
        // }

        // // FOR LOOP
        // for (int i = sc.nextInt(); i <= 10; i++) {
        // System.out.println(i);
        // }

        // // WHILE LOOP
        // int x = sc.nextInt();
        // while (x < 100) {
        // System.out.println("Hacked");
        // x++;
        // }

        // // DO WHILE LOOP
        // int j = sc.nextInt();
        // do {
        // System.out.println(j);
        // j++;
        // } while (j <= 50);

        // // Print the table of a given number
        // int userNumber = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // int tableResultNumber = userNumber * i;
        // System.out.println(tableResultNumber);
        // }

        // Nested Loops
        // /*
        // Problem
        // *****
        // *****
        // *****
        // *****
        // */
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // /*
        // * Problem
        // ******
        // * * *
        // ******
        // */
        // int x = 5;
        // int y = 4;

        // for (int i = 1; i <= y; i++) {
        // for (int j = 1; j <= x; j++) {
        // if (i == 1 || j == 1 || i == y || j == x) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println("");
        // }

        // /*
        // * Problem
        // *
        // **
        // ***
        // ****
        // */
        // int y = 4;
        // int x = 4;

        // for (int i = 1; i <= y; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // /*
        // * Problem
        // ****
        // ***
        // **
        // *
        // */
        // int y = 4;
        // int x = 4;

        // for (int i = 1; i <= y; i++) {
        // for (int j = x; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // /*
        // * Problem
        // *
        // **
        // ***
        // ****
        // */
        // int y = 4;

        // for (int i = 1; i <= y; i++) {
        // int j = (y - i);

        // while (j >= 0) {
        // System.out.print(" ");
        // j--;
        // }

        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }

        // System.out.println("");
        // }

        // /*
        // * Problem 1 12 123 1234
        // */
        // int y = 4;

        // for (int i = 1; i <= y; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println("");
        // }

        // /*
        // * Problem 12345 1234 123 12 1
        // */
        // int y = 5;

        // for (int i = 0; i < y; i++) {
        // int j = (y - i);
        // for (int k = 1; k <= j; k++) {
        // System.out.print(k);
        // }
        // System.out.println("");
        // }

        // /*
        // * Problem 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        // */
        // int y = 5;
        // int a = 1;

        // for (int i = 1; i <= y; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(a + " ");
        // a++;
        // }
        // System.out.println("");
        // }

        // /*
        // * Problem 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        // */
        // int y = 5;
        // int a = 0;

        // for (int i = 1; i <= y; i++) {

        // for (int j = 1; j <= i; j++) {
        // if ((j + i) % 2 == 0) {
        // a = 1;
        // } else if ((j + i) % 2 != 0) {
        // a = 0;
        // } else {
        // System.out.println("ERROR");
        // }
        // System.out.print(a);
        // }
        // System.out.println("");
        // }

        // /*
        // * Problem home work
        // */
        // int y = 5;

        // for (int i = 1; i <= y; i++) {
        // for (int j = (y - i); j >= 1; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= y; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // /*
        // * Problem home work 2
        // */
        // int y = 5;

        // for (int i = 1; i <= y; i++) {
        // for (int j = (y - i); j > 0; j--) {
        // System.out.print(" ");
        // }
        // for (int k = i; k > 0; k--) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // /*
        // * Problem "BUTTER FLY PATTERN"
        // */
        // int y = 4;
        // int t = 8;

        // for (int i = 1; i <= y; i++) {
        // for (int j = i; j > 0; j--) {
        // System.out.print("*");
        // }
        // for (int k = t - (i * 2); k > 0; k--) {
        // System.out.print(" ");
        // }
        // for (int j = i; j > 0; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = y; i > 0; i--) {
        // for (int j = i; j > 0; j--) {
        // System.out.print("*");
        // }
        // for (int k = t - (i * 2); k > 0; k--) {
        // System.out.print(" ");
        // }
        // for (int j = i; j > 0; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Number perimad
        // int y = 5;

        // // outer loop
        // for (int i = 0; i <= y; i++) {

        // // spaces
        // for (int j = y - i; j > 0; j--) {
        // System.out.print(" ");
        // }

        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i);
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // // Problem palindomic peramid
        // int y = 7;

        // for (int i = 1; i <= y; i++) {

        // // spaces
        // for (int j = (y - i); j > 0; j--) {
        // System.out.print(" ");
        // }

        // // first half of the palindom
        // for (int j = i; j > 0; j--) {
        // System.out.print(j);
        // }

        // // second half of the palindom
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }

        // System.out.println();
        // }

        // // Problem perfect dimond
        // int y = 4;

        // for (int i = 1; i <= y; i++) {
        // for (int j = (y - i); j >= 1; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = (i - 1); j > 0; j--) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
        // for (int i = y; i > 0; i--) {
        // for (int j = (y - i); j >= 1; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = (i - 1); j > 0; j--) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // // Problem holo butterfly
        // int y = 5;

        // for (int i = 1; i <= y; i++) {
        // // top left part
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // // top middle spaces
        // for (int j = (2 * y) - (2 * i); j > 0; j--) {
        // System.out.print(" ");
        // }

        // // top right part
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = y; i > 0; i--) {

        // // bottom left part
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // // bottom middle spaces
        // for (int j = (2 * y) - (2 * i); j > 0; j--) {
        // System.out.print(" ");
        // }

        // // bottom right part
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Problem holo butterfly
        int y = 5;

        for (int i = 1; i <= y; i++) {

            // left free spaces
            for (int j = y - i; j > 0; j--) {
                System.out.print(" ");
            }

            // main body
            for (int j = 1; j <= y; j++) {
                if (j == 1 || j == y || i == 1 || i == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // next line
            System.out.println();
        }
    }
}
