public class Motor extends Kendaraan implements BisaOffroad {
    public Motor(String merek) {
        super(merek);
    }

    @Override
    public double hitungBiayaSewa (int hari) {
        return hari * 100000;
    }

    @Override
    public void jelajahOffroad() {
        System.out.println (merek + " siap menjelajah offroad!" );
    }

}

