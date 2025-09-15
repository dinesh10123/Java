import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String found = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (alphabet.indexOf(ch) != -1 && found.indexOf(ch) == -1) {
                found += ch; // add unique letters
            }
        }

        if (found.length() == 26) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is NOT a pangram.");
        }
    }
}
