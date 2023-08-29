import java.util.Scanner;
import Helpers.PrintMatrix;
public class SimpleSieve {
    public static void S_Sieve(int n)
    {
        int[] isPrime = new int[n+1];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i]=i;
        }
        isPrime[0]=isPrime[1]=0;
        PrintMatrix.printMatrixLinear(isPrime);
        for (int i = 2; i <= Math.ceil(Math.sqrt(isPrime.length)); i++) {
            if (isPrime[i]>0) {
                for (int j = i*i; j <= isPrime.length; j+=i) {
                    isPrime[j]=0;
                }
            }
        }
        PrintMatrix.printMatrixLinear(isPrime);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Find prime numbers till : ");
        int n = sc.nextInt();
        S_Sieve(n);
        sc.close();
    }
}
