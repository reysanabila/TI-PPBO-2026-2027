public class Latihan4ArrayOfObject {

    public static void main(String[] args) {
        Latihan1Buku[] daftarBuku = {
                new Latihan1Buku("Kesalahan Presiden ke-8 Indonesia", "Thiko Nestar", 2026),
                new Latihan1Buku("Teknik Balet Dasar", "Felicia", 2022),
                new Latihan1Buku("Kemana Pohon - Pohon Kalimantan Pergi?", "Ferry", 2024),
                new Latihan1Buku("Reservasi Untuk Presiden", "Nadin Amizah", 2025)
        };

        System.out.println("\n----------------- BUKU YANG TERBIT SETELAH TAHUN 2022 -----------------\n");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2022) {
                System.out.println("- " + daftarBuku[i].judul + " (" + daftarBuku[i].tahunTerbit + ")");
            }
        }
    }
}