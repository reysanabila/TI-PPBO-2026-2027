public class Persegi {

    double sisi;

    // Constructor berparameter
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return this.sisi * this.sisi;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 4 * this.sisi;
    }

    public static void main(String[] args) {
        Persegi[] daftarPersegi = {
                new Persegi(4.3),
                new Persegi(4.9),
                new Persegi(1.0),
                new Persegi(3.3)
        };

        Persegi persegiTerbesar = daftarPersegi[0];

        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas() > persegiTerbesar.hitungLuas()) {
                persegiTerbesar = daftarPersegi[i];
            }
        }

        System.out.println("\n-------------- MENCARI PERSEGI DENGAN UKURAN LUAS TERBESAR --------------\n");
        System.out.println("Ukuran Sisi : " + persegiTerbesar.sisi);
        System.out.println("Ukuran Luas : " + persegiTerbesar.hitungLuas());
        System.out.println("Keliling    : " + persegiTerbesar.hitungKeliling());

    }

}