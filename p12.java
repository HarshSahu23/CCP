//Product of matrix
public class p12
{
    public static void main(String[] args)
    {
        // int[][] A = new int[3][2];
        // int[][] B = new int[2][3];
        int[][] A = {{1,2},{4,9},{5,0}};
        int[][] B = {{7,5,6},{8,1,3}};

        System.out.println("\n\nprinting the 1st matrix : ");
        for (int[] i : B) {
            for (int j : i) {
                System.out.print(j+", ");
            }
            System.out.println();
        }
        System.out.println("\n*********************\n\nPrinting the 2nd Matrix:");
        for (int[] i : A) {
            for (int j : i) {
                System.out.print(j+", ");
            }
            System.out.println();
        }
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
        for (int[] i : product) {
            for (int j : i) {
                System.out.print(j+", ");
            }
            System.out.println();
        }
    }
}