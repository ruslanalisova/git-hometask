import java.util.HashMap;

public class javaAdvancedTask1 {

    public static void main(String[] args) {
        int counter;
        char character;
        String linesOfText;
        HashMap<Character, Integer> map = new HashMap();
        char[] alphabet = new char[26];
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet[ch - 'a'] = ch;
        }
        String s = "testadvancedjava";
        System.out.println("Our string: " + s + "\n");
        for (char a : alphabet) {
            counter = 0;
            for (int i = 0; i < s.length(); i++) {
                character = s.charAt(i);
                if (character == a) {
                    counter++;
                }
            }
            System.out.println("\n" + a + "\t" + counter);
        }
    }
}