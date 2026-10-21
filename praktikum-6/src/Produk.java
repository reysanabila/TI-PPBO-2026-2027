public class Produk {

    // 1. Membuat Atribut
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // 2. Constructor dengan parameter menggunakan 'this'
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // 3. Membuat method untuk menghitung total harga yang mengembalikan total harga
    public double hitungTotalHarga(int jumlahBeli) {
        return this.harga * jumlahBeli;
    }

    // 4. Membuat method untuk mengurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= this.stok) {
            this.stok -= jumlah;
            System.out.println("Pembelian berhasil! Stok " + this.namaProduk + " tersisa : " + this.stok);
        } else {
            System.out.println("Gagal membeli " + this.namaProduk + ": Stok tidak mencukupi! (Stok tersedia: " + this.stok + ", " +
                    "Permintaan: " + jumlah + ")");
        }
    }

    // 5. Method untuk menampilkan seluruh informasi produk
    public void tampilkanData() {
        System.out.printf("| %-8s | %-20s | Rp %-12.2f | %-5d |\n",
                this.kodeProduk, this.namaProduk, this.harga, this.stok);
    }

}