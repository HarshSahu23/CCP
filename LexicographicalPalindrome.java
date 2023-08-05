import java.util.*;

public class LexicographicalPalindrome {
    public static String LexPalString(String palindrome)
    {
        HashMap<Character,Integer> charFrequency = new HashMap<Character,Integer>();

        for (int i = 0; i < palindrome.length(); i++) {
            if (charFrequency.containsKey(palindrome.charAt(i))) {
                charFrequency.put(palindrome.charAt(i), charFrequency.get(palindrome.charAt(i))+1);
            }
        }
        boolean OddLength;
        if (charFrequency.size()%2==0) {
            OddLength=false; 
        }
        else{
            OddLength=true;
        }
        
        if (!OddLength) {
            int L = palindrome.length();
            char[] front = new char[L/2];
            char[] back = new char[L/2];
            int F = 0;
            int B = (L/2)-1;
            for (int i = 65; i < 91; i++) {
                if (charFrequency.containsKey((char)i)) {
                    do {
                        front[F]=(char)i;
                        back[B]=(char)i;
                        F++;B--;
                        charFrequency.put((char)i, charFrequency.get((char)i)-2);
                    } while (charFrequency.get((char)i)==0);
                }
            }
            String s1 = new String(front);
            System.out.println(s1);
            s1=s1+new String(back);
            return s1;
        }

        return "";
    }
    public static void main(String[] args) {
        String p = "MADAM";
        String ans = LexPalString(p);
        System.out.println(ans);
    }
}























// char[] pld = palindrome.toCharArray();
//         if (palindrome.length()%2==0) {
//             int L = palindrome.length()-1;
//             int R = palindrome.length();
//         }
//         else{
            
//         }
