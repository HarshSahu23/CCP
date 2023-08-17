package temp;

import Helpers.*;
class Q807LC
{
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;int heightIncrease=0;
        for (int i = 0; i < n; i++) {
            int j = 0 ;
            int maxInRow=grid[i][j];
            for (j=0;j < n; j++) {
                if (grid[i][j]>maxInRow) {
                    maxInRow=grid[i][j];
                }
            }
            // System.out.println(maxInRow+"\t"+maxInCol);
            
            for (int l = 0; l < grid.length; l++) {
                j=0;
                int maxInCol=grid[i][j];
                for (int m=0; m<n; m++) {
                    if (grid[m][l]>maxInCol) {
                        maxInCol=grid[m][l];
                    }
                }
                int compare = Math.min(maxInRow, maxInCol);
                if (grid[i][l]<compare) {
                    heightIncrease+=(compare-grid[i][l]);
                    grid[i][l]=compare;
                }
            }
        }
        PrintMatrix.printMatrix(grid);
        return heightIncrease;
    }
    public static void main(String[] args)
    {
        // int[][] test = GenerateMatrix.generateMatrix(4, 4, true, 10);
        int[][] test = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,0,1}};
        PrintMatrix.printMatrix(test);
        System.out.println();
        int ans = maxIncreaseKeepingSkyline(test);
        System.out.println("\n"+ans);

    }
}