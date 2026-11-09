public class Manager extends Pegawai {

    private double tunjanganJabatan;

    public Manager (String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super (nama, nip, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    @Override
    public double hitungGaji () {
        return gajiPokok + tunjanganJabatan;
    }

}

