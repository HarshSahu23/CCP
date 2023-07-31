package July28;
public class ManachersAlgo {
    public static String LongestPalindromicSubstring(char[] Word)
    {
        int n = Word.length;
        char[] CheckWord = new char[(2*n)+3];
        int[] Matches = new int[(2*n)+3];

        CheckWord[0]='#';
        CheckWord[CheckWord.length-1]='@';
        for (int i = 1; i < CheckWord.length; i+=2) {
            CheckWord[i]='#';
        }

        for (int i = 1; i < CheckWord.length; i++) {
            while (CheckWord[i+(1+Matches[i])]==CheckWord[i+(1-Matches[i])]) {
                Matches[i]++;
            }
        }

        int center=0;
        int length=Matches[center];
        for (int i = 1; i < Matches.length; i++) {
            if (Matches[i]>=length) {
                center=i;
                length=Matches[center];
            }
        }

        String longestPalindromicSubstring = "";
        
        return longestPalindromicSubstring;



    }
    public static void main(String[] args) {
        
    }
}
