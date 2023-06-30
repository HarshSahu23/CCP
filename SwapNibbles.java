import java.util.*;
public class SwapNibbles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an 8-bit binary number : ");
        String binNum = sc.nextLine();
        int[] bits = new int[8];
        for (int i = 0; i < bits.length; i++) {
            bits[i]=Integer.parseInt(Character.toString(binNum.charAt(i)));
        }
        int pointA=0;
        int pointB=4;
        for (int i = 0; i < 4; i++) {
            
        }
        
        
    }
}