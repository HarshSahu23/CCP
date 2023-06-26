import java.util.*;

public class p23_alt
{
    public static boolean isPrime(int n)
    {
        boolean isPrime = true;
        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (n%i==0) {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static int[] isProductOfTwoPrimes(int n)
    {
        int[] ans = new int[3];
        int f1=n,f2=n;
        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (n%i==0) {
                f1=i;f2=n/i;
                break;
            }
        }
        boolean isF1prime = isPrime(f1);
        boolean isF2prime = isPrime(f2);
        if ((isF1prime)&&(isF2prime)) {
            ans[0]=1;ans[1]=f1;ans[2]=f2;
        }
        else{
            ans[0]=1;ans[1]=-1;ans[2]=-1;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faster Algo to calculate \u03A6(n) .... ");
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println((n-1));
        }
        else{
            int[] prod = isProductOfTwoPrimes(n);
            if (prod[1]!=-1) {
                System.out.println((prod[1]-1)*(prod[2]-1));
            }
            else{
                ArrayList<Integer> numerator = new ArrayList<Integer>();
                ArrayList<Integer> denominator = new ArrayList<Integer>();
                ArrayList<Integer> factors = new ArrayList<Integer>();


            }
        }
    }
}