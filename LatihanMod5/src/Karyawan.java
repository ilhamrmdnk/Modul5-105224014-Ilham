public class Karyawan {
    // SOAL 1
    private String idKaryawan; //nmr 1
    private String nama; //nmr 1
    private double gajiPokok; //nmr 2
    protected String departemen; //nmr 3
// nmr 1
    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.gajiPokok = 0;
    }
    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
//nmr 1
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

//nmr 2
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok >= 0) {
            this.gajiPokok = gajiPokok;
        } else {
            System.out.println("Gaji Gak boleh negatif!");
        }
    }

//nmr 3
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

//nmr 3
    public void tampilkanDataKaryawan() {
        System.out.println("=== DATA KARYAWAN ===");
        System.out.println("ID        : " + idKaryawan);
        System.out.println("Nama      : " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji      : " + gajiPokok);
    }
}