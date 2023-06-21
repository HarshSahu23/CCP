//Count how much numbers in a given range have  unique digits

import java.util.*;


public class p19alt {
    public static boolean checkUnique(int num)
    {
        boolean isUnique = true;

        String s = Integer.toString(num);
        int[] nums = new int[s.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Integer.parseInt(Character.toString(s.charAt(i)));
        }

        Map<Integer,Integer> digitCount = new HashMap<Integer,Integer>();
        for (int i : nums) {
            if (digitCount.containsKey(i)) {
                isUnique=false;
                break;
            }
            else{
                digitCount.put(i, 1);
            }
        }
        
        return isUnique;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lower Boud : ");
        int LB = sc.nextInt();
        System.out.print("Upper Boud : ");
        int UB = sc.nextInt();
        int count=0;
        for (int i = LB; i <= UB; i++) {
            if (checkUnique(i)) {
                count++;
            } else {
                System.out.println(i+" is not unique ");
            }
        }
        System.out.println(count+" unique numbers between "+LB+" & "+UB);
        sc.close();
    }
}
