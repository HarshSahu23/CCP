//prints a NxN 2D matrix ready to be copy-pasted into the program

package Helpers;

import java.util.*;

public class GenerateMatrix
{
    public static int[][] generateSquareMatrix(int row, int column, boolean display,int bound)
    {
        Random random = new Random();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j]=random.nextInt(bound+1);
            }
        }
        if (display) {
            displayMatrix(arr);
        }
        return arr;
    }
    public static int[] generateLinearMatrix(int row, boolean display,int bound)
    {
        Random random = new Random();
        int[] arr = new int[row];
        for (int i = 0; i < row; i++) {
            arr[i]=random.nextInt(bound+1);
        }
        if (display) {
            for (int i : arr) {
                System.out.print(i+", ");
            }
        }
        return arr;
    }
    public static void displayMatrix(int[][] arr)
    {
        int val=0;
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[0].length; j++) {
                val=arr[i][j];
                if (j==(arr[0].length)-1) {
                    System.out.print(val);break;
                }
                System.out.print(val+",");
            }
            if (i==arr.length-1) {
                System.out.print("}");
            }
            else{
                System.out.print("},");
            }
        }
        System.out.println("}");
        System.out.println();
    }
}
