public class Main {
    public static void main(String[] args) {
//nmr 4
        Karyawan k1 = new Karyawan("K001", "Budi");

        k1.setDepartemen("IT");

        k1.setGajiPokok(-5000000); // ditolak

        k1.setGajiPokok(5000000);

        k1.tampilkanDataKaryawan();
    }
}