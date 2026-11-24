// Latihan 5 : Class Sepeda

public class Sepeda extends Kendaraan {
    public Sepeda(String merek) {
        super(merek);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 25000;
    }
}

