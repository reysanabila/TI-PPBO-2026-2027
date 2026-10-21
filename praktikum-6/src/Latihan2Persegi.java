public class Latihan2Persegi {

    double sisi;

    // Constructor berparameter
    public Latihan2Persegi(double sisi) {
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
        // Membuat beberapa object dengan ukuran sisi berbeda
        Latihan2Persegi p1 = new Latihan2Persegi(2.0);
        Latihan2Persegi p2 = new Latihan2Persegi(11.0);
        Latihan2Persegi p3 = new Latihan2Persegi(15.3);

        System.out.println("\n---------------------- PERHITUNGAN PERSEGI ----------------------\n");

        System.out.println("PERSEGI 1 ");
        System.out.println("Sisi     : " + p1.sisi);
        System.out.println("Luas     : " + p1.hitungLuas());
        System.out.println("Keliling : " + p1.hitungKeliling());
        System.out.println("\n---------------------------\n");

        System.out.println("PERSEGI 2 ");
        System.out.println("Sisi     : " + p2.sisi);
        System.out.println("Luas     : " + p2.hitungLuas());
        System.out.println("Keliling : " + p2.hitungKeliling());
        System.out.println("\n---------------------------\n");

        System.out.println("PERSEGI 3 ");
        System.out.println("Sisi     : " + p3.sisi);
        System.out.println("Luas     : " + p3.hitungLuas());
        System.out.println("Keliling : " + p3.hitungKeliling());
    }
}