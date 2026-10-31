package Session3;
import java.util.Scanner;

public class PersegiFC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nomor Punggung Pemain : ");
        int nomor = input.nextInt();

        System.out.println("\n=== Hasil Analisis Posisi Pemain ===");

        String posisi = "";

        if (nomor % 2 == 0) {
            posisi += "- Target Attacker";

            if (nomor >= 50 && nomor <= 100){
                posisi += "- Berhak Dipilih Menjadi Capten Team";
            }
        }else {
            posisi += "- Defender";

            if (nomor > 90) {
                posisi += "- Playmaker";
            }

            if (nomor % 3 == 0 && nomor % 5 == 0) {
                posisi += "- Keeper";
            }
        }

        System.out.println("Nomor " + nomor + " Berperan Sebagai :");
        System.out.println(posisi);

        input.close();
    }
}
