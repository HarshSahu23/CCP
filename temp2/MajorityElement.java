import java.util.*;
public class MajorityElement {
    public static int Majority(int[] arr)
    {
        int n = (int) Math.floor(arr.length);
        int MajorityElement=arr[0];
        HashMap<Integer,Integer> elementFrequency = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (elementFrequency.containsKey(arr[i])) {
                elementFrequency.put(arr[i],elementFrequency.get(arr[i])+1);
            }
            else{
                elementFrequency.put(arr[i],1);
            }
        }
        for ( Map.Entry<Integer, Integer> hmElement: elementFrequency.entrySet()) {
            if (hmElement.getValue()>=n) {
                MajorityElement = hmElement.getKey();
            }
        }
        return MajorityElement;

    }
    public static void main(String[] args)
    {
        int[] test = {3,4,5,3,3,2,3};
        System.out.println("\n\nName = Harsh Sahu");
        System.out.println("Reg. No = 21BSA10129");
        System.out.print("\nOriginal Array : ");
        for (int i : test) {
            System.out.print(i+",");
        }
        System.out.println();
        int ans = Majority(test);
        System.out.println("\nMajority Element in the array = "+ans);
        System.out.println();
    }
}