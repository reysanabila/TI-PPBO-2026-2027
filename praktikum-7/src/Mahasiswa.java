public class Mahasiswa {

    private String nama;
    private String nim;
    private double ipk ;

    public Mahasiswa (String nama, String nim, double ipk ) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk ;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk () {
        return ipk ;
    }

    public void tampilkanData() {
        System.out.println("\nNama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
    }

    public boolean isCumlaude() {
        return ipk >= 3.5;
    }

}

