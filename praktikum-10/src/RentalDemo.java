// Latihan 5 : Pengujian Kendaraam

public class RentalDemo {
    public static void main(String[] args) {

        System.out.printf("\n");

        Kendaraan[] daftar = {
                new Mobil("Avanza"),
                new Motor("Trail KLX"),
                new Mobil("Xenia"),
                new Sepeda("Polygon"),
                new Jeep("Jeep Rubicon")
        };

        int hari = 5;
        double total = 0;
        int lebarLabel = 22;

        for (Kendaraan k : daftar) {
            double biaya = k.hitungBiayaSewa(hari);
            System.out.printf("%-" + lebarLabel + "s: %s%n", k.merek, biaya);
            total += biaya;

            if (k instanceof BisaOffroad) {
                ((BisaOffroad) k).jelajahOffroad();
            }
        }

        String labelTotal = "Total sewa " + hari + " hari";
        System.out.printf("%-" + lebarLabel + "s: %s%n", labelTotal, total);
    }
}

