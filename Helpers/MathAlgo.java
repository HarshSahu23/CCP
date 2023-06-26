package Helpers;

public class MathAlgo {
    public static int GCD(int a, int b)
    {
        if (b>a) {
            int t=b;
            b=a;
            a=t;
        }
        int GCD = 1;
        int temp;
        while (a>b) {
            temp = a%b;
            if (temp==0) {
                return b;
            }
            else{
            a=b; b=temp; 
            }
        }
        return GCD;
    }
    public static int GCD2(int a, int b)
    {
        if (a==0) {
            return b;
        }
        return GCD2(b%a, a);
    }
}
