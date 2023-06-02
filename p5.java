import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        System.out.println("a         = "+a);
        int rev=0;
        while (a>0) {
            rev=(rev*10)+a%10;
            a=a/10;
        }
        System.out.println("reverse a = "+rev);
        sc.close();
    }
}
