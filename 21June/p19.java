import java.util.*;
public class p19
{
    public static boolean allDigUnique(int n)
    {
        boolean isUnique = true;
        String s = Integer.toString(n);
        int[] nums = new int[s.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Integer.parseInt(Character.toString(s.charAt(i)));
        }
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    isUnique=false;
                    break;
                }
            }
        }
        return isUnique;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lower Boud : ");
        int LB = sc.nextInt();
        System.out.print("Upper Boud : ");
        int UB = sc.nextInt();
        for (int i = LB; i <= UB; i++) {
            System.out.println(i+" has all unique digits : "+allDigUnique(i));
        }
        sc.close();
    }
}