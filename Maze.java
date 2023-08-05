// import java.util.*;

import java.util.Arrays;

public class Maze
{
    
    public void display(int[][] disp)
    {
        for (int[] i : disp) {
            for (int j : i) {
                System.out.println(j+" ");
            }
            System.out.println();
        }
    }
    
    public static int maze(int[][] A, int i , int j, int n, int[][] S)
    {
        if (i==n-1&&j==n-1&&A[i][j]==1) {
            S[i][j]=1;
            return 1;
        }
        if ((A[i][j]==1)&&(i>0&&i<n)&&(j<0&&j<n)) {
            S[i][j]=1;
            if (maze(A, i, j+1, n, S)==1) {
                return 1;
            }
            if (maze(A, i+1, j, n, S)==1) {
                return 1;
            }
            S[i][j]=0;
            return 0;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        System.out.println();

        int[][] M = {{1,1,0,1},{1,0,1,1},{1,1,1,0},{0,0,1,1}};
        int[][] S = new int[4][4];

        int[] t = {0,0,0,0};
        Arrays.fill(S,t);
        
        int ans = maze(M, 0, 0, 4, S);
        System.out.println(ans);

        for (int[] i : S) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}