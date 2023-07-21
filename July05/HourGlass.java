package July05;
import java.util.*;
import Helpers.*;
public class HourGlass
{
    public static int hourglass(int[][] matr)
    {
        int sum = matr[0][0];int[] index={0,0};
        for (int i = 0; i < (matr.length-2); i++) {
            for (int j = 0; j < (matr[0].length-2); j++) {
                int temp = matr[i+1][j+1];
                for (int k = 0; k < 3; k++) {
                    temp = temp + matr[i][j+k];
                    temp = temp + matr[i+2][j+k];
                }
                if (temp>=sum) {
                    sum=temp;
                    index[0]=i;index[1]=j;
                }
            }
        }
        System.out.println();
        System.out.println("Hour glass with max sum ...\n");
        for (int i = index[0]; i < index[0]+3; i++) {
            if (i==index[0]+1) {
                System.out.println("   "+matr[i][index[1]+1]+" ");continue;
            }
            for (int j = index[1]; j < index[1]+3; j++) {
                System.out.print(matr[i][j]+"  ");
            }
            System.out.println();
        }
        return sum;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many rows in matrix : ");
        int rows = sc.nextInt();
        System.out.print("how many columns in matrix : ");
        int cols = sc.nextInt();
        System.out.println();

        int[][] arr = GenerateMatrix.generateMatrix(rows, cols, false, 1000);
        System.out.println();
        PrintMatrix.printMatrix(arr);
        System.out.println();


        int ans = hourglass(arr);
        System.out.println("\nMax sum = "+ans);
        sc.close();
    }
}