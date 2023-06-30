//Relative Prime -- two numbers whose GCD = 1;
//Calculating GCD


import Helpers.*;
import java.util.*;
public class p22    
{
    public static int GCD(int a,int b)
    {
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
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num : ");
        int b = sc.nextInt();

        int ans = a>b?GCD(a, b):GCD(b, a);
        System.out.println(ans);
        

    }
}