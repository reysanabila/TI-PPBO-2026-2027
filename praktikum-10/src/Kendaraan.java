public abstract class Kendaraan {
    protected String merek;

    public Kendaraan (String merek) {
        this.merek = merek;
    }

    public abstract double hitungBiayaSewa (int hari);
}

