public class Latihan3Produk {
    String namaProduk;
    double harga;

    public Latihan3Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method mengembalikan boolean
    public boolean isMahal(double batasHarga) {
        return this.harga > batasHarga;
    }

    public static void main(String[] args) {
        Latihan3Produk p1 = new Latihan3Produk("\nAir Condisioner", 15000000);
        Latihan3Produk p2 = new Latihan3Produk("Baju Gamis", 150000);

        double batas = 1000000; // Batas harga : Rp 1.000.000

        System.out.println("\n----------- CEK HARGA PRODUK (Batas: Rp " + batas + ") -----------\n");
        System.out.println(p1.namaProduk + " apakah mahal? " + p1.isMahal(batas));
        System.out.println(p2.namaProduk + " apakah mahal? " + p2.isMahal(batas));
    }

}