//Find max value in array
public class p11
{
    public static void main(String[] args)
    {
        
        int[] a = {5,8,0,4,9,6,4,2,6};
        int max = a[0];
        System.out.println("Printing elements in arrray : ");
        for (int i : a) {
            System.out.print(i+", ");
            if (i>max) {
                max=i;
            }
        }
        System.out.println("\nMax element in array = "+max);


    }
}