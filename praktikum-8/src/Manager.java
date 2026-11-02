public class Manager extends Pegawai {

    private double tunjanganJabatan;

    public Manager (String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super (nama, nip, gajiPokok); // panggil constructor Pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // Tugas b : Membuat getter tunjanganJabatan
    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }


}

