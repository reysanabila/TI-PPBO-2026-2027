public class Manager extends Pegawai {

    private double tunjanganJabatan;

    public Manager (String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super (nama, nip, gajiPokok); // panggil constructor Pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public void tampilkanRingkasan () {
        System.out.println("Manager   : " + nama); // ERROR jika private
    }

}

