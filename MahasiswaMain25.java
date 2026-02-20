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

        System.out.println();

        Mahasiswa25 mhsSarahGeiza = new Mahasiswa25("Sarah Geiza Silmi","2141720160", 3.25,"TI 2L");
    
        mhsSarahGeiza.tampilkanInformasi();
    }
}
