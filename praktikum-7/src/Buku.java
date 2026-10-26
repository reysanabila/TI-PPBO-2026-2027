public class Buku {

    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor berparameter menggunakan 'this'
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanData() {
        System.out.println("Judul        : " + this.judul);
        System.out.println("Pengarang    : " + this.pengarang);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Buku[] daftarBuku = {
                new Buku("Kesalahan Presiden ke-8 Indonesia", "Thiko Nestar", 2026),
                new Buku("Teknik Balet Dasar", "Felicia", 2022),
                new Buku("Kemana Pohon - Pohon Kalimantan Pergi?", "Ferry", 2024),
                new Buku("Reservasi Untuk Presiden", "Nadin Amizah", 2025)
        };

        System.out.println("\n----------------- BUKU YANG TERBIT SETELAH TAHUN 2022 -----------------\n");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2022) {
                System.out.println("- " + daftarBuku[i].judul + " (" + daftarBuku[i].tahunTerbit + ")");
            }
        }
    }

}