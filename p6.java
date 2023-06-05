import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound : ");
        int start = sc.nextInt();
        System.out.print("Enter the upper bound : ");
        int end = sc.nextInt();
        int even=0,odd=0;
        for (int i = start; i <= end; i++) {
            if (i%2==0) {
                even+=i;
            }
            else{
                odd+=i;
            }
        }
        System.out.println("\nSum of even numbers in the range = "+even);
        System.out.println("Sum of odd numbers in the range  = "+odd);
        System.out.println();
        sc.close();

    }
}
