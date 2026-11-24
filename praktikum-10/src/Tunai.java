// Tugas c : Subclass Tunai

public class Tunai extends MetodePembayaran {
    public Tunai(String namaMetode) {
        super(namaMetode);
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 0;
    }
}

