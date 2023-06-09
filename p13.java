//Uniformity Matrix
public class p13
{
    public static void main(String[] args)
    {
        // int[][] B = {{7,5,9},{23,1,3},{7,3,5}};
        int[][] B = {{4,6,8,},{2,0,6},{10,14,8}};
        boolean allOdd = true;
        boolean allEven = true;
        System.out.println("Printing the matrix ... ");
        for (int[] i : B) {
            for (int j : i) {
                if (j%2!=0) {
                    allEven=false;
                    break;
                }
                if (j%2==0) {
                    allOdd=false;
                    break;
                }
                System.out.print(j+", ");
            }
            System.out.println();
        }

        if (allEven) {
            System.out.println("All elements are even");
        }

        if (allOdd) {
            System.out.println("All elements are odd");
        }
    }
}