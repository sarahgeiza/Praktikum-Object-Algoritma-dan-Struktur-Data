public class MahasiswaMain25 {
    public static void main(String[] args) {
        Mahasiswa25 mhs1 = new Mahasiswa25();
        mhs1.nama = "Sarah Geiza";
        mhs1.nim = "254107020020";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1D");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa25 mhs2 = new Mahasiswa25("Anissa Nabila","2141720160", 3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
