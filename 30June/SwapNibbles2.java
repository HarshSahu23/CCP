import java.util.*;
public class SwapNibbles2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an 8-bit binary number : ");
        int binNum = sc.nextInt();

        int Nibble1  = 0b1111000000000000;
        int Nibble2  = 0b0000111100000000;
        int Nibble3  = 0b0000000011110000;
        int Nibble4  = 0b0000000000001111;

        Nibble1=binNum&Nibble1;
        Nibble2=binNum&Nibble2;
        Nibble3=binNum&Nibble3;
        Nibble4=binNum&Nibble4;

        Nibble1=Nibble1>>>8;
        Nibble3=Nibble3<<8;
        Nibble2=Nibble2>>>8;
        Nibble4=Nibble4<<8;

        int ans = (((Nibble1|Nibble2)|Nibble3)|Nibble4);
        System.out.println("");
        System.out.println("\t\tDecimal\t\tBinary");
        System.out.println("Original: \t"+binNum+"\t\t0"+Integer.toBinaryString(binNum));
        System.out.println("Swapped : \t"+ans+"\t\t0"+Integer.toBinaryString(ans));

        sc.close();
    }
}