public class RentalDemo {
    public static void main(String[] args ) {
        Kendaraan[] daftar = {
                new Mobil ("\nAvanza" ),
                new Motor("Trail KLX" ),
                new Mobil ("Xenia" ),
        };

        int hari = 3;
        double total = 0;
        for (Kendaraan k : daftar ) {
            double biaya = k.hitungBiayaSewa (hari);
            System.out.println (k.merek + " : " + biaya );
            total += biaya;

            if (k instanceof BisaOffroad ) {
                (( BisaOffroad ) k).jelajahOffroad();
            }
        }

        System.out.println ("Total sewa " + hari + " hari : " + total );
    }
}

