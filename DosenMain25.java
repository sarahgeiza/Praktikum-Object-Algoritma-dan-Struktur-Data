public class DosenMain25 {
    public static void main(String[] args) {
        Dosen25 dsn1 = new Dosen25();
        dsn1.idDosen = "D001";
        dsn1.nama = "Yudi Junaedi";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Pemrograman";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa kerja: " + dsn1.hitungMasaKerja(2026) + "tahun" );
        dsn1.ubahKeahlian("Basis Data");

        System.out.println();

        Dosen25 dsn2 = new Dosen25("D002", "Siti Aisyah", true, 2018, "Jaringan");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa kerja: " + dsn2.hitungMasaKerja(2025) + "tahun");
        dsn2.ubahKeahlian("Keamanan Jaringan");
    }
}
