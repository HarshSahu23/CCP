//Prints a matrix in an elegantly formatted & aligned fashion
// BMP → Beautiful Matrix Print

package Helpers;

public class PrintMatrix {
    
    public static void printMatrixLinear(int[] matrix) {
        System.out.println();
        int rows = matrix.length;
        int maxLength = 0;
        for (int i : matrix) {
            int tempLength = String.valueOf(matrix[i]).length();
            if (tempLength>=maxLength) {
                maxLength=tempLength;
            }
        }
        String format = "%" + maxLength + "d";
        for (int i = 0; i < rows; i++) {
            System.out.printf(format, matrix[i]);
            if (i < rows - 1) {
                System.out.print(", ");
            }
            if (i==Math.floor(Math.sqrt(rows))) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void printMatrixSquare(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxLength = getMaxElementLength(matrix);
        String format = "%" + maxLength + "d";
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf(format, matrix[i][j]);
                if (j < cols - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    public static int getMaxElementLength(int[][] matrix) {
        int maxLength = 0;
        
        for (int[] row : matrix) {
            for (int element : row) {
                int length = String.valueOf(element).length();
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }
}

