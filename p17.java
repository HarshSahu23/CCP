//Rotate Array 90 degree CW

import Helpers.*;
public class p17 {
    public static void main(String[] args) {
        int[][] A = GenerateMatrix.generateMatrix(3, 3, false, 10);
        int[][] B = new int[3][3];
        System.out.println("Original Matrix : ");
        PrintMatrix.printMatrix(A);
        for (int i = 0; i < A.length; i++) {
            int k=A.length-1;
            for (int j = 0; j < A[0].length; j++) {
                B[i][j]=A[k][i];k--;
            }
        }
        System.out.println("\nRotated Matrix : ");
        PrintMatrix.printMatrix(B);
    }
}
