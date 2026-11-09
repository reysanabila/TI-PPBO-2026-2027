// Latihan 4 : SubClass Direktur

public class Direktur extends Manager {

    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
        // Memanggil constructor Manager (constructor chaining)
        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }

    public double getTunjanganSaham() {
        return tunjanganSaham;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganSaham;
    }

}

