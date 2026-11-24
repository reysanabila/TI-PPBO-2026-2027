// Tugas d dan e : Method Main dan Tampilan Metode Pembayaran

import java.util.Scanner;

public class PembayaranDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.print("Masukkan nominal belanja : ");
        double jumlah = scanner.nextDouble();
        System.out.println("==========================================");

        MetodePembayaran[] daftar = {
                new Tunai("Tunai Kasir"),
                new KartuKredit("Kartu Kredit Visa"),
                new KartuKredit("Kartu Kredit Master"),
                new EWallet("OVO / GoPay")
        };

        int lebar = 18;
        MetodePembayaran metodeTerbaik = null;
        double totalBersihTerkecil = Double.MAX_VALUE;

        for (MetodePembayaran mp : daftar) {
            mp.prosesPembayaran(jumlah);

            double cashback = 0;
            if (mp instanceof BisaCashback) {
                cashback = ((BisaCashback) mp).hitungCashback(jumlah);
                System.out.printf("%-" + lebar + "s : %.0f%n", "Cashback", cashback);
            }

            double biayaAdmin = mp.hitungBiayaAdmin(jumlah);
            double totalBersih = jumlah + biayaAdmin - cashback;
            System.out.printf("%-" + lebar + "s : %.0f%n", "Total Bersih", totalBersih);
            System.out.println("------------------------------------------");

            if (totalBersih < totalBersihTerkecil) {
                totalBersihTerkecil = totalBersih;
                metodeTerbaik = mp;
            }
        }
        if (metodeTerbaik != null) {
            System.out.println("Metode dengan total bersih paling kecil :");
            System.out.printf("%-" + lebar + "s : %s%n", "Metode Terbaik", metodeTerbaik.namaMetode);
            System.out.printf("%-" + lebar + "s : %.0f%n", "Total Bersih", totalBersihTerkecil);
        }

        scanner.close();
    }
}

