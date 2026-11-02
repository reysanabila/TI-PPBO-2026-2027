public class Pegawai {

    protected String nama;
    protected String nip;
    protected double gajiPokok;

    public Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;

    }

    public void tampilkanData () {
        System.out.println ("\nNama       : " + nama);
        System.out.println ("NIP        : " + nip);
        System.out.println ("Gaji Pokok : " + gajiPokok);
    }

}

