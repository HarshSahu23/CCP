import java.util.*;
public class p1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name          : ");
        String name = sc.nextLine();
        System.out.print("\nEnter your age         : ");
        int age = sc.nextInt();
        System.out.print("\nEnter your gender(M/F) : ");
        char gender = sc.next().charAt(0);
        System.out.print("\nEnter your CGPA        : ");
        double cgpa = sc.nextDouble();
        System.out.println("\n******************************");
        System.out.printf("\nName = %s",name);
        System.out.printf("\nAge = %d",age);
        System.out.printf("\nGender = %c",gender);
        System.out.printf("\nCGPA = %.2fs",cgpa);
        sc.close();
    }
}