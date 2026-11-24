public class Mobil extends Kendaraan {
    public Mobil (String merek) {
        super(merek);
    }

    @Override
    public double hitungBiayaSewa (int hari) {
        return hari * 300000;
    }
}

