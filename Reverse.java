
import java.util.Scanner;
import java.util.StringTokenizer;
public class Reverse {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        int len = str.length();
        String revStr = ""; //Empty String

        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            int wordLen = word.length();
            for (int i = wordLen - 1; i >= 0; i--) {
                revStr += word.charAt(i);
            }
            revStr += " ";
        }

        System.out.println("String with words reversed:");
        System.out.println(revStr);
    }
}
