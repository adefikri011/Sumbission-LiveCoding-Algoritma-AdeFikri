package session2;

public class NilaiAkhir {
    public static void main(String[] args) {
        String namaMahasiswa = "Siti";
        String Nim = "2024001";

        double bobotTugas = 0.30;
        double bobotUTS = 0.30;
        double bobotUAS = 0.40;

        int nilaiTugas = 85;
        int nilaiUTS = 78;
        int nilaiUAS = 90;

        double nilaiAKhir = (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);

        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("NIM : " + Nim);
        System.out.println("Nilai Akhir : " + nilaiAKhir);
    }
}
