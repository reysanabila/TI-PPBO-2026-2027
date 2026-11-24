// Latihan 5 : Class Jeep

public class Jeep extends Kendaraan implements BisaOffroad {
    public Jeep(String merek) {
        super(merek);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 500000;
    }

    @Override
    public void jelajahOffroad() {
        System.out.println(merek + " siap menjelajah offroad!");
    }
}

