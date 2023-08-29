import java.util.*;
public class IncrementalSieve
{
    public static List<Integer> I_Sieve(int n)
    {
        List<Integer> primes = new ArrayList<>();
        if (n>=2) {
            primes.add(2);
        }
        int num=3;
        while (primes.size()<n) {
            boolean isPrime=true;
            for (int prime : primes) {
                if (prime*prime>num) {
                    break;
                }
                if (num%prime==0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                primes.add(num);
            }
            num+=2;
        }
        return primes;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many primes to generate : ");
        int n = sc.nextInt();
        List<Integer> ans = I_Sieve(n);
        System.out.println();
        for (int i : ans) {
            System.out.print(i+", ");
        }
        sc.close();

    }
}