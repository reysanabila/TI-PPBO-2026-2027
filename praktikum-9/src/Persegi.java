// Latihan 2 : SubClass Persegi

public class Persegi extends BangunDatar {

    private double sisi;

    // Constructor Persegi
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Override method hitungLuas untuk Persegi (Luas = sisi * sisi)
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

}

