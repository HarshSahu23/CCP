import java.util.*;
public class SimpleSieve
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates all prime numbers from 2 till Limit");
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, 0, n, true);

        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= n; j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        int range = (Integer.toString(n)).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < range; i++) {
            sb.append("-");
        }
        String F =  sb.toString();
        for (int i = 0; i < n; i++) {
            if (i%((int)Math.sqrt(n))==0) {
                System.out.println();
            }
            if (isPrime[i]==true) {
                System.out.printf(" %2d ", i);
            }
            else{
                System.out.print(" "+F+" ");
            }
        }
    }
}