//TASK NO-02
public class DiagonalSums {
    public static int leftDiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += matrix[i][i];
        }
        return leftSum;
    }
    public static int rightDiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += matrix[i][n - 1 - i];
        }
        return rightSum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {17, 12, 5},
            {24, 10, 7},
            {17, 7, 5}
        };
        System.out.println("Left diagonal sum: " + leftDiagonalSum(matrix));
        System.out.println("Right diagonal sum: " + rightDiagonalSum(matrix)); 
    }
}