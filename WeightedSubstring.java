import java.util.*;
public class WeightedSubstring {
    public static int CountWeightedSubstring(String str, int[]weights, int limit)
    {
        HashSet<String> Substrings = new HashSet<String>();
        
        for (int i = 0; i < str.length(); i++) {

            String tempString = "";
            int totalWeights=0;

            for (int j = i; j < str.length(); j++) {

                totalWeights+=weights[j];
                tempString+=Character.toString(str.charAt(j));

                if (totalWeights>limit) {
                    break;
                }
                else{
                    Substrings.add(tempString);
                }
            }
        }

        System.out.println("\n\nPrinting all substring with weight less than "+limit+"\n");
        for (String string : Substrings) {
            System.out.print(string+"\t");
        }
        return Substrings.size();
    }
    public static void main(String[] args) {
        String test = "abca";
        int[] weights  = {1,2,3,4};
        int ans = CountWeightedSubstring(test, weights, 4);
        System.out.println("\n"+"Count of Substrings = "+ans);

    }
}
