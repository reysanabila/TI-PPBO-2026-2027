public class Latihan5ArrayPersegi {

    public static void main(String[] args) {
        Latihan2Persegi[] daftarPersegi = {
                new Latihan2Persegi(4.3),
                new Latihan2Persegi(4.9),
                new Latihan2Persegi(1.0),
                new Latihan2Persegi(3.3)
        };

        Latihan2Persegi persegiTerbesar = daftarPersegi[0];

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