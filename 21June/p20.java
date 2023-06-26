import java.util.*;
public class p20
{
    static int f1=0;
    static int f2=0;
    public static boolean getFactors(int n){

        boolean isPrime=true;
        for (int i = 2; i <= Math.ceil(Math.sqrt((double)n)); i++) {
            if (n%i==0) {
                isPrime=false;
                f1 = i;
                f2 = n/i;
            }
        }
        return isPrime;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num = sc.nextInt();

        if (getFactors(num)) {
            System.out.println("Not Possible");
        }
        else{
            System.out.println(f1+"\t"+f2);
        }
        sc.close();
        
    }

}