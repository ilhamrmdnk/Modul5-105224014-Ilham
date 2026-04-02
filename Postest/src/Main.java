public class Main {
    public static void main(String[] args) {

        Barang barang = new Barang("B001", "Laptop");

        barang.setKategori("Elektronik");

        barang.setHargaSatuan(-1000);
        barang.kurangiStok(10);

        barang.setHargaSatuan(7000000);
        barang.tambahStok(20);
        barang.kurangiStok(5);

        barang.tampilkanDetailBarang();
    }
}