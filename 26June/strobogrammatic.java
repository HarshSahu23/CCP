import java.util.*;
public class strobogrammatic
{
    public static boolean isStrobogrammatic(String n)
    {
        int l = 0;
        int r = n.length()-1;
        while (l<=r) {
            char s1 = (n.charAt(l));
            char s2 = (n.charAt(r));
            if (s1=='0'&&s2=='0'||s1=='1'&&s2=='1'||s1=='8'&&s2=='8'||s1=='6'&&s2=='9'||s1=='9'&&s2=='6') {
                l++;r--;
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
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n==0||n==1||n==8) {
            System.out.println("Strobogrammatic");
        }
        else{
            boolean isSB = isStrobogrammatic(Integer.toString(n));
            System.out.println(isSB);
        }
    }
}