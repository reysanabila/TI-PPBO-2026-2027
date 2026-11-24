// Tugas c : Subclass EWallet

public class EWallet extends MetodePembayaran implements BisaCashback {
    public EWallet(String namaMetode) {
        super(namaMetode);
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 1000;
    }

    @Override
    public double hitungCashback(double jumlah) {
        double cb = 0.05 * jumlah;
        return Math.min(cb, 20000);
    }
}

