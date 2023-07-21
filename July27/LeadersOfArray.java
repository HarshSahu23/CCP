
import java.util.ArrayList;
import java.util.List;

public class LeadersOfArray {
    public static Object[] LeadersBF(int[] arr)
    {
        List<Integer> ans = new ArrayList<Integer>();//creating a list to store all elements that are leaders
        for (int i = 0; i < arr.length-1; i++) {//iterating from the start of the array
            boolean isLeader=true;//assuming all elements are leader by default
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]) {
                    isLeader=false;//even if a single element is larger than the current element, it is not a leader
                    break;
                }
            }
            if (isLeader) {     //if element stays as leader throughout the loop, add it to the list
                ans.add(arr[i]);
            }
        }
        ans.add(arr[arr.length-1]);// also add the last element as the leader coz it's leader by default
        Object[] obj = ans.toArray();//convert list to array
        return obj;
    }
    public static Object[] LeadersOPT(int[] arr)
    {
        List<Integer> ans = new ArrayList<Integer>();   //list to store all leader elements
        int currentHigh = arr[arr.length-1];    //assume the currently highest element is at the last location
        for (int i = arr.length-1; i >=0; i--) {    //traverser from the last to start of array
            if (arr[i]>=currentHigh) {  //if the current element is greater than the current highest element then
                ans.add(arr[i]);        //add it to the leader list
                currentHigh=arr[i];     // swap the current highest element with this element
            }
        }
        Object[] obj = ans.toArray();   //convert list to array and return
        return obj;
    }
    public static void main(String[] args) {

        int[] A = {16,11,8,10,3,2};
        Object[] ans = LeadersOPT(A);
        System.out.println("Leaders : ");
        for (Object object : ans) {
            System.out.print(object+" ");
        }

    }
}
