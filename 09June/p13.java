//Uniformity Matrix
import Helpers.*;
public class p13
{
    public static void main(String[] args)
    {
        int[][] B = GenerateMatrix.generateMatrix(3, 3, false, 100);
        boolean allOdd = true;boolean allEven = true;
        System.out.println("Printing the matrix ... ");
        PrintMatrix.printMatrix(B);


        for (int[] i : B) {
            for (int j : i) {
                if (j%2!=0) {
                    allEven=false;
                }
            }
        }
        if (allEven) {
            System.out.println("All elements are even");
        }

        for (int[] i : B) {
            for (int j : i) {
                if (j%2==0) {
                    allOdd=false;
                }
            }
        }
        if (allOdd) {
            System.out.println("All elements are odd");
        }

        if (!allEven&&!allOdd) {
            System.out.println("Not a uniformity matrix");
        }

    
    }
}