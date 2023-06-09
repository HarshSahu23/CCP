public class p14
{
    public static void main(String[] args)
    {
        int[][] A = {{4,6,8,},{2,0,6},{10,14,8}};

        int maxSumRow=0,maxSumCol=0;
        System.out.println("Printing the matrix ...");
        for (int[] i : A) {
            for (int j : i) {
                System.out.print(j+",");
            }
            System.out.println();
            
        }
        System.out.println("\n");
        int count=0;
        for (int[] i : A) {
            int temp=0;
            for (int j : i) {
                temp+=j;
            }
            System.out.println("Sum of Row "+count+" = "+temp);
            if (temp>maxSumRow) {
                maxSumRow=temp;
            }count++;
        }
        count=0;
        for (int i = 0; i < A[0].length; i++) {
            int temp=0;
            for (int j = 0; j < A.length; j++) {
                temp+=A[j][i];
            }
            System.out.println("Sum of Column "+count+" = "+temp);
            if (temp>maxSumCol) {
                maxSumCol=temp;
            }count++;
        }
        System.out.println("\n");
        System.out.println("Max sum of row = "+maxSumRow);
        System.out.println("Max sum of col = "+maxSumCol);
    }
}