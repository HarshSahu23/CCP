import java.util.*;

public class ToggleTheSwitch
{
    public static void toggleTheSwitch(int n)
    {
        boolean[] switches = new boolean[n];
        Arrays.fill(switches, 0, n-1, false);
        
        
        //printing the initial states of switches
        System.out.print("init: ");
        for (boolean b : switches) {
            if (b) {
                System.out.print("T ");
            }
            else{
                System.out.print("F ");
            }
        }
        System.out.println();


        for (int i = 1; i <= n; i++) {
            for (int j = i-1; j <n; j=j+i) {
                switches[j]=switches[j]==true?false:true;
            }

            //printing the states of the switches after each loop
            System.out.printf("%3d : ", i);
            for (boolean b : switches) {
                if (b) {
                    System.out.print("T ");
                }
                else{
                    System.out.print(". ");
                }
                
            }
            System.out.println();

        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of switches : ");
        int n = sc.nextInt();
        toggleTheSwitch(n);


    }
}