// package July05;
import java.util.*;
public class KaratsubaAlgo
{
    public static long KS(long X, long Y)
    {
        long max = X>Y?X:Y;
        long n=0;
        while (max>0) {
            max=max/10;n++;
        }
        if (n%2!=0) {
            n+=1; //0
        }
        long A = X/((int)Math.pow(10, (n/2)));
        long B = X%((int)Math.pow(10, (n/2)));
        
        long C = Y/((int)Math.pow(10, (n/2)));
        long D = Y%((int)Math.pow(10, (n/2)));

        long ac = A*C;
        long bd = B*D;
        long ad = A*D;
        long bc = B*C;

        long ans = (ac*((long)Math.pow(10, n)))+
                    ((ad+bc)*(long)Math.pow(10, (n/2)))+
                    bd;

        // System.out.println(A);
        // System.out.println(B);
        // System.out.println(C);
        // System.out.println(D);

        return ans;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program multiplies two long numbers using a fast approach");
        System.out.print("Enter 1st num : ");
        long n1 = sc.nextLong();
        System.out.print("Enter 2nd num : ");
        long n2 = sc.nextLong();
        
        long ans = KS(n1, n2);
        System.out.println(ans);
    }
}