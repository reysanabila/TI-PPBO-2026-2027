public class Pegawai {

    protected String nama;
    protected String nip;
    protected double gajiPokok;

    public Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;

        // Tugas a : Memvalidasi gaji pokok tidak boleh negatif
        if (gajiPokok < 0) {
            System.out.println("Gaji Pokok anda yang bernama (" + nama + ") " +
                    "tidak boleh negatif! Nilai akan otomatis diset menjadi 0!");
            this.gajiPokok = 0;
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    public void tampilkanData () {
        System.out.println ("\nNama              : " + nama);
        System.out.println ("NIP               : " + nip);
        System.out.println ("Gaji Pokok        : " + gajiPokok);
    }

}

