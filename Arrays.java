import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("How many number are you entering?");
        // int size = sc.nextInt();

        // int numbers[] = new int[size];

        // int maxNum = Integer.MIN_VALUE;
        // int minNum = Integer.MAX_VALUE;

        // for (int i = 0; i < size; i++) {

        // System.out.println("Enter number");
        // numbers[i] = sc.nextInt();
        // }

        // System.out.println("all of your numbers are added to the array");

        // for (int i = 0; i < size; i++) {
        // if (maxNum < numbers[i]) {
        // maxNum = numbers[i];
        // } else if (numbers[i] < minNum) {

        // minNum = numbers[i];
        // }
        // }

        // System.out.println("max number is " + maxNum);
        // System.out.println("min number is " + minNum);

        // for (int i = 0; i < size; i++) {
        // System.out.println("Enter number i : " + i);
        // numbers[i] = sc.nextInt();
        // }

        // String res = "in not assinding order";
        // int minNum = Integer.MIN_VALUE;

        // for (int i = 0; i < size; i++) {
        // if (numbers[i] > minNum) {
        // minNum = numbers[i];
        // } else {
        // res = "in not assinding order";
        // }
        // }
        // if (minNum == numbers[size - 1]) {
        // res = "in assinding order";
        // }
        // System.out.println("The numbers are " + res);

        // // 2D arrays
        // System.out.println("Enter the row number and then column number");
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        // int numbers[][] = new int[rows][cols];

        // System.out.println("Now enter the values");
        // // input
        // // rows
        // for (int i = 0; i < rows; i++) {
        // // cols
        // for (int j = 0; j < cols; j++) {
        // numbers[i][j] = sc.nextInt();
        // }
        // }

        // // the number which to find
        // System.out.println("Now enter the number which you want to find");

        // int findThisNumber = sc.nextInt();

        // // output
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // if (numbers[i][j] == findThisNumber) {
        // System.out.println("Your number is at row number " + (i+1) + " and column
        // number " + (j+1);
        // }
        // ;
        // }
        // System.out.println();
        // }

        // // spiral order matrix
        // System.out.println("total row number");
        // int rows = sc.nextInt();
        // System.out.println("total column number");
        // int cols = sc.nextInt();

        // int matrix[][] = new int[rows][cols];

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.println("enter number");
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // int rowStart = 0;
        // int rowEnd = (rows - 1);
        // int colStart = 0;
        // int colEnd = (cols - 1);

        // while (rowStart <= rowEnd && colStart <= colEnd) {

        // for (int i = colStart; i <= colEnd; i++) {
        // System.out.print(matrix[rowStart][i]);
        // }

        // rowStart++;

        // for (int i = rowStart; i <= rowEnd; i++) {
        // System.out.print(matrix[i][colEnd]);
        // }

        // colEnd--;

        // for (int i = colEnd; i >= colStart; i--) {
        // System.out.print(matrix[rowEnd][i]);
        // }

        // rowEnd--;

        // for (int i = rowEnd; i >= rowStart; i--) {
        // System.out.print(matrix[i][colStart]);
        // }

        // colStart++;
        // }

        // // transpose of a metrix
        // System.out.println("total row numbers");
        // int rows = sc.nextInt();
        // System.out.println("total column numbers");
        // int cols = sc.nextInt();

        // int matrix[][] = new int[rows][cols];

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.println("enter number");
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // int transposedMatrix[][] = new int[cols][rows];

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // transposedMatrix[j][i] = matrix[i][j];
        // }
        // }

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(matrix[i][j]);
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < cols; i++) {
        // for (int j = 0; j < rows; j++) {
        // System.out.print(transposedMatrix[i][j]);
        // }
        // System.out.println();
        // }

        System.out.println("Enter Your full email address\n");
        String userEmail = sc.nextLine();

        String username = "";

        username = userEmail.substring(0, userEmail.indexOf("@"));

        System.out.println(username);

    }
}
