public class Buku {

    // Latihan no 1. Mengubah atribut menjadi private dan menambahkan getter untuk masing - masing atribut

    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Latihan no 2. Menambahkan setter untuk atribut judul dan pengarang

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public static void main(String[] args) {
        Buku[] daftarBuku = {
                new Buku("Lagu Anak - Anak Indonesia", "Dika", 2026),
                new Buku("Timun Mas dan Buto Ijo", "Mulan Siara", 2022),
                new Buku("Cara Membuat Berbagai Bunga dari Kertas Origami", "Cinta Ashira", 2024),
                new Buku("Resep Kue Raya", "Gina Nizamy", 2025)
        };

        System.out.println("\n----------------- BUKU YANG TERBIT SETELAH TAHUN 2022 -----------------\n");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].getTahunTerbit() > 2022) {
                System.out.println("- " + daftarBuku[i].getJudul() + " (" + daftarBuku[i].getTahunTerbit() + ")");
            }
        }
    }

}

