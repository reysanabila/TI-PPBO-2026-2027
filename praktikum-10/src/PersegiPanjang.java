// Latihan 1 : SubClass Persegi Panjang

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang (double panjang, double lebar ) {
        super ("Persegi Panjang" );
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Latihan 2 : Menghapus satu method
    @Override
    public double hitungLuas () {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling () {
        return 2 * (panjang + lebar );
    }
}

