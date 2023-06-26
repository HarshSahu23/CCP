import java.util.*;
public class BinaryPalindrom
{
    public static boolean BinaryPalindrome(String bin)
    {
        int L=0;
        int R=bin.length()-1;
        while (L<=R) {
            char c1 = bin.charAt(L);
            char c2 = bin.charAt(R);
            if (c1=='1'&&c2=='1'||c1=='0'&&c2=='0') {
                L++;R--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        String binNum = sc.nextLine();
        boolean ans = BinaryPalindrome(binNum);
        System.out.println(ans);
    }
}