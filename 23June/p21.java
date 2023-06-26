import java.util.*;
public class p21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Find prime numbers from 0 till ... ");

        int L = sc.nextInt();
        boolean[] number = new boolean[L];
        Arrays.fill(number, 0, L, true);

        for (int i = 2; i*i < L; i++) {
            if (number[i]) {
                for (int j = i*i; j < L; j+=i) {
                    number[j]=false;
                }
            }
        }
        
        for (int i = 0; i < number.length; i++) {
            if (number[i]) {
                System.out.print(i+",\t");
            }
            else{
                System.out.print
                ("\t");
            }
            System.out.print(number[i]);
            System.out.println();
            
        }

        sc.close();
    }
}