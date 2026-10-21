public class TokoDemo {

    public static void main(String[] args) {

        // 1. Membuat Array of Object Produk berisi 5 produk berbeda
        Produk[] daftarProduk = {
                new Produk("PH001", "Bros Bunga Silver            ", 150000, 35),
                new Produk("PH002", "Kerabu Bentuk Diamond        ", 100000, 10),
                new Produk("PH003", "Cincin Perak Inisial Custom  ", 1500000, 17),
                new Produk("PH004", "Gelang Giok Hijau            ", 200000, 3),
                new Produk("PH005", "Kalung Perak Halloween       ", 120000, 20)
        };

        // 2. Menampilkan seluruh data produk menggunakan perulangan
        System.out.println("\n======================================================================");
        System.out.println("                     DAFTAR PRODUK TOKO PERHIASAN                     ");
        System.out.println("======================================================================");
        System.out.printf("| %-8s | %-29s | %-15s | %-5s |\n", "KODE", "NAMA PRODUK", "HARGA", "STOK");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < daftarProduk.length; i++) {
            daftarProduk[i].tampilkanData();
        }
        System.out.println("======================================================================\n");

        // 3. Mensimulasikan pembelian pada 2 produk berbeda
        System.out.println("\n ---------------- SIMULASI PEMBELIAN ----------------\n");

        System.out.println("\n[Skenario 1 : Membeli 2 Perhiasan 'Kerabu Bentuk Diamond']");
        int jumlahBeli1 = 2;
        System.out.println("Total Harga : Rp " + daftarProduk[2].hitungTotalHarga(jumlahBeli1));
        daftarProduk[2].kurangiStok(jumlahBeli1);

        System.out.println("\n[Skenario 2 : Membeli 4 Perhiasan 'Gelang Giok Hijau']");
        int jumlahBeli2 = 4;
        System.out.println("Total Harga : Rp " + daftarProduk[4].hitungTotalHarga(jumlahBeli2));
        daftarProduk[4].kurangiStok(jumlahBeli2);

        System.out.println("\n---------------------------------------------------------------\n");

        // 4. Menghitung produk dengan harga termahal
        Produk produkTermahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > produkTermahal.harga) {
                produkTermahal = daftarProduk[i];
            }
        }

        System.out.println("\n------------ PRODUK DENGAN HARGA TERMAHAL ------------\n");
        System.out.println("Kode Produk  : " + produkTermahal.kodeProduk);
        System.out.println("Nama Produk  : " + produkTermahal.namaProduk);
        System.out.printf("Harga        : Rp %.2f\n", produkTermahal.harga);
        System.out.println("Stok Tersisa : " + produkTermahal.stok);
    }

}