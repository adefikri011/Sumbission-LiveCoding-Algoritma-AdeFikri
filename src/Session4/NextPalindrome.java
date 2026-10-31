package Session4;

import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka Awal : ");
        int angka = input.nextInt();

        int kandidat = angka + 1;

        while (true) {
            String textAngka = String.valueOf(kandidat);

            String textTerbalik = "";

            for (int i = textAngka.length() - 1; i >= 0; i--){
                textTerbalik += textAngka.charAt(i);
            }

            if (textAngka.equals(textTerbalik)) {
                System.out.println("Output : " + kandidat);

                break;
            }

            kandidat++;
        }
        input.close();

    }
}
