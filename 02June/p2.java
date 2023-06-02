import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c = sc.next().charAt(0);
        System.out.println("\n"+"char = "+c);
        System.out.println("int char = "+(int)c);
        sc.close();
    }
}
