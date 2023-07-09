import java.util.*;
import Helpers.MathAlgo;
public class ChineseRemainderTheorem
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This Program finds the correct solution of congruent equations\nusing Chinese Remainder Theorem.");
        
        
        
        System.out.print("How many equations you want to enter : ");
        int size = sc.nextInt();sc.nextLine();
        int[] a = new int[size];
        int[] m = new int[size];
        String input="";String[] inputArray = new String[2];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter values as a,m = ");
            input=sc.nextLine();
            inputArray = input.split(",");
            try {
                a[i]=Integer.parseInt(inputArray[0].trim());
                m[i]=Integer.parseInt(inputArray[1].trim());
            } catch (Exception e) {
                System.out.println();
                i--;
            }
        }


        // int[] a  = {2,3,10};
        // int[] m = {5,7,11};

        boolean NotPairWiseRelativePrime = false;

        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (MathAlgo.GCD2(m[i],m[j])!=1){
                    NotPairWiseRelativePrime = true;
                }
            }
        }
        if (NotPairWiseRelativePrime) {
            System.out.println("m values are not pair wise relative prime, no unique solutions exists ...");
        }

        int[] M = new int[size];
        int[] MInv = new int[size];

        int ProdM=1;
        for (int i = 0; i < size; i++) {
            ProdM*=m[i];
        }
        for (int i = 0; i < size; i++) {
            M[i]=ProdM/m[i];
        }
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < m[i]; j++) {
                int temp=j*M[i];
                if (temp%m[i]==1) {
                    MInv[i]=j;
                    break;
                }
            }
        }
        int sum=0;
        System.out.println("a[i]\tM[i]\tMInv[i]\tProduct");
        System.out.printf("%7s\t%7s\t%7s\t%7s");
        for (int i = 0; i < size; i++) {
            System.out.printf("%7d\t%7d\t%7d\t%7d",a[i],M[i],MInv[i],(a[i]*M[i]*MInv[i]));
            // System.out.println(a[i]+"\t"+M[i]+"\t"+MInv[i]+"\t"+(a[i]*M[i]*MInv[i]));
            System.out.println();
            sum+=(a[i]*M[i]*MInv[i]);
        }
        System.out.println("B = "+(sum%ProdM));




        
    }
}
