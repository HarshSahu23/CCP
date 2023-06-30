import java.util.*;
public class SelectionSort
{
    public static void main(String[] args)
    {
        //Taking the user inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("This program performs selection sort ... ");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] Arr = new int[size];
        System.out.println("Next, enter the values of array separated by comma(,) ");
        System.out.print("Enter here : ");
        String input = sc.nextLine();
        String[] values = input.split(",");
        for (int i = 0; i < size; i++) {
            Arr[i]=Integer.parseInt(values[i].trim());
        }

        

        //printing the initial values of array
        int sortedPointer=0;
        System.out.println();
        for (int val : Arr) {
            System.out.print(val+" ");
        }
        System.out.println("\n---------------------------");




        //performing selection sort
        while (sortedPointer<size-1) {
            int minVal = Arr[sortedPointer];
            int swapIndex=sortedPointer;
            for (int i = sortedPointer; i < size; i++) {
                if (Arr[i]<minVal) {
                    minVal=Arr[i];
                    swapIndex=i;
                }
            }
            int temp=Arr[sortedPointer];
            Arr[sortedPointer]=minVal;
            Arr[swapIndex]=temp;
            for (int val : Arr) {
                System.out.print(val+" ");
            }
            System.out.println();
            sortedPointer++;
        }



        //printing the final sorted array
        System.out.println("----------------------------");
        for (int val : Arr) {
            System.out.print(val+" ");
        }
        sc.close();

    }
}