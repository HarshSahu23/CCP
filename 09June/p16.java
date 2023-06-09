import Helpers.*;
public class p16 {
    public static void main(String[] args) {
        int[][] A = GenerateMatrix.generateMatrix(4, 2, false, 10);
        System.out.println("Original Matrix : ");
        PrintMatrix.printMatrix(A);
        int[][] TA = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < TA.length; j++) {
                TA[j][i]=A[i][j];
            }
        }
        System.out.println("\nTranspose Matrix : ");
        PrintMatrix.printMatrix(TA);
    }
}
