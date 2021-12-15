// https://leetcode.com/problems/search-a-2d-matrix/

public class BinarySearchInMatrix {

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }

            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1 } };

        int[] ans = search(matrix, 1);

        System.out.println(ans[0] + " " + ans[1]);
    }
}