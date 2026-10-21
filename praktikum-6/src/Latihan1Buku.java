public class Latihan1Buku {

    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor berparameter menggunakan 'this'
    public Latihan1Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanData() {
        System.out.println("Judul        : " + this.judul);
        System.out.println("Pengarang    : " + this.pengarang);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        // Membuat 2 object berbeda
        Latihan1Buku latihan1Buku1 = new Latihan1Buku("Lagu Koreah", "Daniella", 2018);
        Latihan1Buku latihan1Buku2 = new Latihan1Buku("To Be Human", "Winnie The Pooh", 2012);

        // Menampilkan data kedua object
        System.out.println("\n------------ DATA BUKU ------------\n");
        latihan1Buku1.tampilkanData();
        latihan1Buku2.tampilkanData();
    }

}