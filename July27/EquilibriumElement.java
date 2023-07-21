
public class EquilibriumElement {
    public static int EquilibriumOPT(int[] arr)
    {
        int arrSum = 0;     // initializing a variable to get sum of entire array
        for (int i : arr) {
            arrSum+=i;      //calculating sum of all elements of array
        }
        int LeftSum=0;      //By default, LeftSum is 0 for startnig array
        int RightSum=arrSum;    // RightSum is the entire sum of array for starting element
        for (int i = 0; i < arr.length; i++) {
            if (LeftSum==RightSum) {
                return i;   // check equilibrium condition and return accordingly
            }
            else{
                LeftSum+=arr[i];RightSum-=arr[i];   //else, increase LS by current element & decrease RS by current element
            }
        }
        return -1;  // if not found return -1
    }
    public static int EquilibriumBF(int[] arr)
    {
        int LeftSum=0,RightSum=0;       // two variable LS & RS
        for (int i = 0; i < arr.length; i++) {
            LeftSum=0;RightSum=0;       // for every element, it's default value is 0
            if (i==0) { 
                LeftSum=0;              // if it's first element, LS=0 & RS is calculated
            }
            if (i==arr.length-1) {
                RightSum=0;             // if it's last element, LS is calculated and RS=0
            }
            else{
                for (int j = i; j < arr.length; j++) {      // calculating RS for other cases
                    RightSum+=arr[j];
                }   
                for (int j = 0; j <= i-1; j++) {            //calculating LS for other cases
                    LeftSum+=arr[j];
                }
            }
            if (LeftSum==RightSum) {        // check equilibrium condition at last after obtaining values of LS & RS
                return i;
            }
        }
        return -1;      //return -1 when not found
    }
    public static void main(String[] args) {

        int[] arr = {7,4,6,1,9,9};
        int ans = EquilibriumOPT(arr);
        System.out.println("index of equilibrium element = "+ans);

    }
}
