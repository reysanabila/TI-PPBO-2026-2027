public class PengujianBangunDatar {

    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran A", 7.0),
                new Persegi("Persegi G", 5.0),
                new PersegiPanjang("Persegi Panjang P1", 6.0, 4.0),
                new Lingkaran("Lingkaran B", 10.0),
                new PersegiPanjang("Persegi Panjang P2", 8.0, 3.0)
        };

        double totalLuas = 0.0;
        BangunDatar bangunTerbesar = daftarBangun[0]; // Inisialisasi awal untuk pembanding luas terbesar

        System.out.println("\n ---- Informasi Bangun Datar ----");

        for (BangunDatar bangun : daftarBangun) {
            bangun.tampilkanInfo();

            double luasSaatIni = bangun.hitungLuas();
            totalLuas += luasSaatIni;

            if (luasSaatIni > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = bangun;
            }
        }

        System.out.println("\n======================================================");
        System.out.println("Total Luas Seluruh Bangun Datar    : " + totalLuas);
        System.out.println("------------------------------------------------------");
        System.out.println("Bangun Dengan Luas Terbesar Adalah : ");
        System.out.println("------------------------------------------------------");
        System.out.println("Nama   : " + bangunTerbesar.namaBangun);
        System.out.println("Jenis  : " + bangunTerbesar.getClass().getSimpleName());
        System.out.println("Luas   : " + bangunTerbesar.hitungLuas());
        System.out.println("======================================================");

    }

}


