// Tugas a : Abstract class MetodePembayaran

public abstract class MetodePembayaran {
    protected String namaMetode;

    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    public abstract double hitungBiayaAdmin(double jumlah);

    public void prosesPembayaran(double jumlah) {
        double admin = hitungBiayaAdmin(jumlah);
        double totalBayar = jumlah + admin;
        int lebar = 18;

        System.out.printf("%-" + lebar + "s : %s%n", "Metode", namaMetode);
        System.out.printf("%-" + lebar + "s : %.0f%n", "Jumlah Belanja", jumlah);
        System.out.printf("%-" + lebar + "s : %.0f%n", "Biaya Admin", admin);
        System.out.printf("%-" + lebar + "s : %.0f%n", "Total Bayar", totalBayar);
    }
}

