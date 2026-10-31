package session2;

public class KedaiKopi {
    public static void main(String[] args) {
        String namaPelanggan = "Budi";

        int hargaKopi = 18500;
        int hargaDonat = 5000;

        int jumlahKopi = 4;
        int jumlahDonat = 2;

        int diskonTumbler = 2000;
        double persentasePajak = 0.11;

        double totalBelanja = jumlahKopi * hargaKopi + jumlahDonat * hargaDonat;
        double besaranPajak = totalBelanja * persentasePajak;

        double totalAkhir = totalBelanja + besaranPajak - diskonTumbler;

        System.out.println("Nama Pelanggan : " +  namaPelanggan);
        System.out.println("Total akhir yang harus dibayar : " + totalAkhir);

    }
}
