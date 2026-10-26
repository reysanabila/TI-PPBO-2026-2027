public class TokoDemo {

    public static void main(String[] args) {

        // 1. Membuat Array of Object Produk berisi 5 produk berbeda
        ProdukLama[] daftarProdukLama = {
                new ProdukLama("PH001", "Bros Bunga Silver            ", 150000, 35),
                new ProdukLama("PH002", "Kerabu Bentuk Diamond        ", 100000, 10),
                new ProdukLama("PH003", "Cincin Perak Inisial Custom  ", 1500000, 17),
                new ProdukLama("PH004", "Gelang Giok Hijau            ", 200000, 3),
                new ProdukLama("PH005", "Kalung Perak Halloween       ", 120000, 20)
        };

        // 2. Menampilkan seluruh data produk menggunakan perulangan
        System.out.println("\n======================================================================");
        System.out.println("                     DAFTAR PRODUK TOKO PERHIASAN                     ");
        System.out.println("======================================================================");
        System.out.printf("| %-8s | %-29s | %-15s | %-5s |\n", "KODE", "NAMA PRODUK", "HARGA", "STOK");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < daftarProdukLama.length; i++) {
            daftarProdukLama[i].tampilkanData();
        }
        System.out.println("======================================================================\n");

        // 3. Mensimulasikan pembelian pada 2 produk berbeda
        System.out.println("\n ---------------- SIMULASI PEMBELIAN ----------------\n");

        System.out.println("\n[Skenario 1 : Membeli 2 Perhiasan 'Kerabu Bentuk Diamond']");
        int jumlahBeli1 = 2;
        System.out.println("Total Harga : Rp " + daftarProdukLama[2].hitungTotalHarga(jumlahBeli1));
        daftarProdukLama[2].kurangiStok(jumlahBeli1);

        System.out.println("\n[Skenario 2 : Membeli 4 Perhiasan 'Gelang Giok Hijau']");
        int jumlahBeli2 = 4;
        System.out.println("Total Harga : Rp " + daftarProdukLama[4].hitungTotalHarga(jumlahBeli2));
        daftarProdukLama[4].kurangiStok(jumlahBeli2);

        System.out.println("\n---------------------------------------------------------------\n");

        // 4. Menghitung produk dengan harga termahal
        ProdukLama produkLamaTermahal = daftarProdukLama[0];

        for (int i = 1; i < daftarProdukLama.length; i++) {
            if (daftarProdukLama[i].harga > produkLamaTermahal.harga) {
                produkLamaTermahal = daftarProdukLama[i];
            }
        }

        System.out.println("\n------------ PRODUK DENGAN HARGA TERMAHAL ------------\n");
        System.out.println("Kode Produk  : " + produkLamaTermahal.kodeProduk);
        System.out.println("Nama Produk  : " + produkLamaTermahal.namaProduk);
        System.out.printf("Harga        : Rp %.2f\n", produkLamaTermahal.harga);
        System.out.println("Stok Tersisa : " + produkLamaTermahal.stok);
    }

}