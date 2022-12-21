package rtu.mirea;
import java.util.Scanner;

public class Palindrome {
    private String word;
    Palindrome() {
        Scanner in = new Scanner(System.in);
        word = in.nextLine();
        Palindrome_check(word);
    }
    private void Palindrome_check(String word) {
        if (word.length() == 1) {
            System.out.println("YES");
            return;
        }
        else {
            if (word.substring(0, 1).equals(word.substring(word.length() - 1, word.length()))) {
                if (word.length() == 2) {
                    System.out.println("YES");
                    return;
                }
                Palindrome_check(word.substring(1, word.length() - 1));
            }
            else {
                System.out.println("NO");
                return;
            }
        }
    }
}
