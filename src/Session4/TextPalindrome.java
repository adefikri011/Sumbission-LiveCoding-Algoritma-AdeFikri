package Session4;

import java.util.Scanner;

public class TextPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan text / Kalimat : ");
        String text = input.nextLine();

        String textTerbalik = "";

        for (int i = text.length()-1; i >= 0; i--) {
            textTerbalik += text.charAt(i);
        }

        if (text.equals(textTerbalik)) {
            System.out.println(text + " : Palindrome ");
        }else {
            System.out.println(text + " : Bukan Palindorme");
        }
    }
}
