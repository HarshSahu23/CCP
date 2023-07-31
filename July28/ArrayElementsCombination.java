package July28;
public class ArrayElementsCombination {
    
    private static int getPairsRecursive(int[] arr, int index, int totalCount)
    {
        if (index == arr.length - 1) {
            return totalCount;
        }
        totalCount+=getPairElementsRecursive(arr, index, index+1,0);
        System.out.println();
        return getPairsRecursive(arr, index+1, totalCount);
    }
    private static int getPairElementsRecursive(int[] arr, int index1, int index2, int count)
    {
        if (index2==arr.length) {
            return count;
        }
        System.out.print(arr[index1]+","+arr[index2]+"\t");
        return getPairElementsRecursive(arr, index1, index2+1, count+1);
    }
    public static void main(String[] args)
    {
        int[] A = {1,2,3,4};
        System.out.println();
        int totalCount = getPairsRecursive(A,0,0);        

        System.out.println("\nTotal Number of Pairs = "+totalCount);
    }
}
