import java.util.*;
public class AliceApple
{
    public static void main(String[] args)
    {
        int north=0;
        int south=1;
        int east=2;
        int west=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Alice Apple ...");
        int[] directions = new int[4];
        System.out.println("Enter the trees in N,S,E,W direction respectively : ");
        System.out.print("Enter as P,Q,R,S :\t");
        String s = sc.nextLine();
        String[] dir = s.split(",");
        for (int i = 0; i < 4; i++) {
            directions[i]=Integer.parseInt(dir[i]);
        }
        System.out.print("Color of Apple = ");
        String color = sc.nextLine();
        System.out.print("How many apple per tree (K) = ");
        int K = sc.nextInt();
        
        System.out.print("Quantity of Apple you want : ");
        int qty = sc.nextInt();
        
        if (color.trim().toUpperCase().equals("R")) {
            int val = (K*directions[south])+directions[east]+directions[west];
                if (qty<=(K*directions[south])) {
                    System.out.println("Apples collected successfully !");
                }
                else if(qty<=val){
                    System.out.println(val+" apples collected successfully !");
                }
                else{
                    System.out.println("Couldn't Collect :(");
                }
        } 
        else if(color.trim().toUpperCase().equals("G")){
            int val = (K*directions[north])+directions[east]+directions[west];
                if (qty<=(K*directions[north])) {
                    System.out.println("Apples collected successfully !");
                }
                else if(qty<=val){
                    System.out.println(val+" apples collected successfully !");
                }
                else{
                    System.out.println("Couldn't Collect :( ");
                }
        }
        else{
            System.out.println("Enter color as G/R only ...");
        }
        sc.close();
    }
}