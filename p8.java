import java.util.*;
public class p8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year=sc.nextInt();
        System.out.print("Enter Month : ");
        int month=sc.nextInt();
        if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
            System.out.println("31 Days");
        }
        if (month==2) {
            if (year%4==0) {
                System.out.println("29 Days");
            }
            else{
                System.out.println("28 Days");
            }
        }
        else{
            System.out.println("30 Days");
        }
        sc.close();
    }
}