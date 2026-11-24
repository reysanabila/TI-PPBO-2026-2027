// Tugas c : Subclass KartuKredit

public class KartuKredit extends MetodePembayaran implements BisaCashback {
    public KartuKredit(String namaMetode) {
        super(namaMetode);
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 0.02 * jumlah;
    }

    @Override
    public double hitungCashback(double jumlah) {
        return 0.01 * jumlah;
    }
}

