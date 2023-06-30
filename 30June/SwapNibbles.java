import java.util.*;
public class SwapNibbles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an 8-bit binary number : ");
        int binNum = sc.nextInt();

        int leftNibbleExtract  = 0b000011110000;
        int rightNibbleExtract = 0b000000001111;

        leftNibbleExtract=binNum&leftNibbleExtract;
        rightNibbleExtract=binNum&rightNibbleExtract;
        leftNibbleExtract=leftNibbleExtract>>4;
        rightNibbleExtract=rightNibbleExtract<<4;

        int ans = leftNibbleExtract|rightNibbleExtract;
        System.out.println("");
        System.out.println("\t\tDecimal\t\tBinary");
        System.out.println("Original: \t"+binNum+"\t\t0"+Integer.toBinaryString(binNum));
        System.out.println("Swapped : \t"+ans+"\t\t0"+Integer.toBinaryString(ans));

        sc.close();
    }
}