import java.util.*;
import Helpers.*;
public class p23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (to calculate it's number of relative primes) : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int gcd = MathAlgo.GCD(i, n);
            if (gcd==1) {
                count++;
            }
        }
        System.out.println("Φ(n) = "+count);

    }
}