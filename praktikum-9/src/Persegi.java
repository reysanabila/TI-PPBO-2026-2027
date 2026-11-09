// Tugas 2 : SubClass Persegi

public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi(String namaBangun, double sisi) {
        super(namaBangun); // Memanggil constructor superclass
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

}

