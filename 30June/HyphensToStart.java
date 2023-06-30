import java.util.*;
public class HyphensToStart
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string using only alphabets & hyphens (-) : ");
        String str = sc.nextLine();sc.close();
        int countHyphens=0;
        String letters = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='-') {
                countHyphens++;
            }
            else{
                letters+=Character.toString(str.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= countHyphens; i++) {
            result.append("-");
        }
        result.insert(countHyphens,letters); 
        System.out.println("After shift all hyphens to start : "+result.toString());
        

    }
}