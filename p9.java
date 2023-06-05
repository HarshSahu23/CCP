// import java.util.*;
public class p9
{
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 7; i++) {
            if (i%2==0) {
                System.out.print((i*i)-2+", ");
            }
            else{
                System.out.print((i*i)-1+", ");
            }
        }
    }
}