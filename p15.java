//Sum of numbers in a ZigZag Pattern
import Helpers.GenerateMatrix;
import Helpers.PrintMatrix;
public class p15
{
    public static void main(String[] args)
    {
        System.out.println();
        int[][] A = GenerateMatrix.generateMatrix(5,5,true,100);
        int Sum = 0;int L = A.length;
        for (int i = 0; i < (A.length)-1; i++) {
            Sum+=A[0][i];
        }
        for (int i = 1; i < (A.length); i++) {
            Sum+=A[A.length-1][i];
        }
        int i=0,j=L-1;
        while (i<L) {
            Sum+=A[j][i];
            j--;i++;
        }

        PrintMatrix.printMatrix(A);

        System.out.println("\nSum of numbers in a ZigZag Pattern = "+Sum);
    }
}