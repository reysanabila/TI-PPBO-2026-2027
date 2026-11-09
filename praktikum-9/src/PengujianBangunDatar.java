public class PengujianBangunDatar {

    public static void main(String [] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran(6.0),
                new Persegi(25.0),
        };

        double totalLuas = 0.0;

        for (BangunDatar bangun : daftarBangun) {
            totalLuas += bangun.hitungLuas();
        }

        System.out.println("\n---- Menghitung Total Luas Bangun Datar ----");

        for (int i = 0; i < daftarBangun.length; i++) {
            System.out.println("Diketahui luas Bangun ke - " + (i + 1) + " (" + daftarBangun[i].getClass().getSimpleName()
                    + ") : " + daftarBangun[i].hitungLuas());
        }

        System.out.println("----------------------------------------------");
        System.out.println("\nMaka total seluruh luas Bangun Datar adalah : " + totalLuas);

    }

}

