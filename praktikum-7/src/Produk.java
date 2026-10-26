// Latihan no 5. Membuat class Produk

public class Produk {

    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);
        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Stok tidak boleh negative! Stok akan di set ke - 0");
        }
    }

    public String getKodeProduk() {
        return kodeProduk;
    }
    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh Negative!");
        }
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("Stok berhasil ditambahkan. Stok sekarang adalah : " + this.stok);
        } else {
            System.out.println("Jumlah penambahan stok harus bernilai Positif!");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok - jumlah >= 0) {
                this.stok -= jumlah;
                System.out.println("Stok berhasil dikurangi. Stok sekarang adalah : " + this.stok);
            } else {
                System.out.println("Stok tidak mencukupi, stok saat ini : " + this.stok);
            }
        } else {
            System.out.println("Jumlah pengurangan stok harus bernilai Positif!");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n------ Menguji Produk ------\n");

        Produk produk1 = new Produk("P001", "Laptop ASUS", 7500000, 10);

        System.out.println("Info Produk : " + produk1.getNamaProduk() + " | Harga: " + produk1.getHarga() + " | Stok: " + produk1.getStok());

        // Menambah stok
        System.out.println("\nMenambahkan Stok");
        produk1.tambahStok(5);

        // Mengurangi stok
        System.out.println("\nMengurangi Stok");
        produk1.kurangiStok(4);

        // Mengurangi stok versi tidak cukup
        System.out.println("\nMengurangi Stok Tapi Tidak Cukup");
        produk1.kurangiStok(20);

        // Menguji harga negative
        System.out.println("\nMenguji Jika Harga Negative");
        produk1.setHarga(-1000);
    }

}