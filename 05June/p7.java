import java.util.*;
public class p7
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a 3 digit number to check if it's trendy (press -1 to exit): ");

            int num = sc.nextInt();
            if (num==-1||!(num>-1000&&num<1000)) {
                System.out.println("exiting ... ");
                break;
            }

            if (((num/10)%10)%3==0) {
                System.out.println(num+" is a trendy number");
            }
            else{
                System.out.println(num+" is not a trendy number");
            }
            
        }
        sc.close();
    }
}