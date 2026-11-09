// Latihan 2 : SubClass Lingkaran

public class Lingkaran extends BangunDatar {

    private double radius;

    // Constructor Lingkaran
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    // Override method hitungLuas untuk Lingkaran (Luas = phi * r * r)
    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

}

