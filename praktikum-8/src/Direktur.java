// Tugas d : Membuat class Direktur extends Manager

public class Direktur extends Manager {

    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }

    // Membuat getter tunjanganSaham
    public double getTunjanganSaham() {
        return tunjanganSaham;
    }

}

