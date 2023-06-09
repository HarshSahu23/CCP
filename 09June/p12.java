//Product of matrix
import Helpers.*;
public class p12
{
    public static void main(String[] args)
    {
        // int[][] A = new int[3][2];
        // int[][] B = new int[2][3];
        
        int[][] A = GenerateMatrix.generateMatrix(3, 2, false,10);
        int[][] B = GenerateMatrix.generateMatrix(2, 3, false,10);
        System.out.println("\n\nprinting the 1st matrix : ");
        PrintMatrix.printMatrix(A);
        
        System.out.println("\n*********************\n\nPrinting the 2nd Matrix:");
        PrintMatrix.printMatrix(B);
        
        int rowA = A.length;
        int colB = B[0].length;

        int[][] product = new int[rowA][colB];
        

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                int val = 0;
                for (int k = 0; k < A[0].length; k++) {
                    val += A[i][k]*B[k][j];
                }
                product[i][j]=val;
            }
        }
        System.out.println("\n\n********************\nProduct : ");
        PrintMatrix.printMatrix(product);
        
    }
}