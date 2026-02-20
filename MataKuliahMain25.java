public class MataKuliahMain25 {
    public static void main(String[] args) {
        MataKuliah25 mk1 = new MataKuliah25();
        mk1.kodeMK = "Y123P";
        mk1.kodeMK = "Dasar Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(5);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println();

        MataKuliah25 mk2 = new MataKuliah25("Y123P", "Algoritma dan Struktur Data", 3, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);
    }
}
