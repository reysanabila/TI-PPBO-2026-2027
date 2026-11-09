// Tugas 2 : SubClass Lingkaran

public class Lingkaran extends BangunDatar {

    private double radius;

    public Lingkaran(String namaBangun, double radius) {
        super(namaBangun); // Memanggil constructor superclass
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

}

