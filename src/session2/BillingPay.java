package session2;

public class BillingPay {
    public static void main(String[] args) {
        int notaTagihan = 345000;
        double persentaseLayanan = 0.05;
        int TIP = 20000;
        int jumlahOrang = 5;

        double nominalLayanan = notaTagihan * persentaseLayanan;
        double totalTagihan = notaTagihan + nominalLayanan + TIP;
        double bayaPerOrang = totalTagihan / jumlahOrang;

        System.out.println("==== Detail Split Bill ====");
        System.out.println("Total Pesanan : " + notaTagihan);
        System.out.println("Biaya Layanan (%) : " + nominalLayanan);
        System.out.println("Total Keseluruhan : " + totalTagihan);
        System.out.println("----------------------------");
        System.out.println("Jumlah yang harus di bayar per orang : " + bayaPerOrang);
    }
}
