import java.util.*;
public class p18
{
    public static long shift(long a)
    {
        int numOfZero=0;
        int sizeOfNumber=0;
        while (a>0) {
            numOfZero=a%10==0?(numOfZero+1):numOfZero;
            a=a/10;
            sizeOfNumber++;
        }
        String s = "";
        int L = sizeOfNumber-numOfZero;
        for (int i = 0; i < sizeOfNumber; i++) {
            if (i<L) {
                s+="1";
            }
            else{
                s+="0";
            }
        }
        long ans = Integer.parseInt(s);
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a binary number (press 2 to exit): ");
            long a = sc.nextLong();
            if (a==2) {break;}
            System.out.println("Shifted : "+shift(a));
        }
        sc.close();
    }
}