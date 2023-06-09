//Sum of all even & odd numbers in a matrix
public class p10
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Printing elements in arrray : ");
        for (int i : a) {
            System.out.print(i+", ");
        }
        int evenSum=0,oddSum=0;
        for (int j : a) {
            if(j%2==0){
                evenSum+=j;
            }
            else{
                oddSum+=j;
            }
        }
        System.out.println("\nSum of all even numbers = "+evenSum);
        System.out.println("Sum of all odd numbers  = "+oddSum);

    }
}