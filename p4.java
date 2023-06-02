import java.util.*;
public class p4 {
    public static void main(String[] args) {
       int l,b;
       Scanner sc = new Scanner(System.in) ;
       System.out.print("Enter 1st integer : ");
       l=sc.nextInt();
       System.out.print("Enter 2nd integer : ");
       b=sc.nextInt();
       System.out.println("Length of rope = "+((2*l)+(2*b)));
       System.out.println("Area of carpet = "+(l*b));
       sc.close();
    }
}
