import java.util.Scanner;

public class KalkulatorMethod {

    // a. membuat method seluruh operasi secara terpisah

    // c. membuat metod tambah 2 parameter dan 3 parameter

    // method tambah 2 parameter
    public static double tambah(double a, double b) {
        return a + b;
    }

    // method tambah 3 parameter
    public static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // method kurang
    public static double kurang(double a, double b) {
        return a - b;
    }

    // method kali
    public static double kali(double a, double b) {
        return a * b;
    }

    // method kali
    public static double bagi(double a, double b) {
        if (b == (double)0.0F) {
            System.out.println("Tidak bisa dibagi dengan 0!");
            return Double.NaN;
        } else {
            return a / b;
        }
    }

    // method pangkat
    public static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    // method akar
    public static double akarKuadrat(double angka) {
        if (angka < (double)0.0F) {
            System.out.println("Akar kuadrat dari bilangan negatif tidak terdefinisi pada bilangan real!");
            return Double.NaN;
        } else {
            return Math.sqrt(angka);
        }
    }

    // d. membuat method riwayat maksimum
    public static double riwayatKeMaksimum(double[] riwayatHasil, int jumlahRiwayat) {
        if (jumlahRiwayat == 0) {
            return Double.NaN;
        } else {
            double max = riwayatHasil[0];

            for(int i = 1; i < jumlahRiwayat; ++i) {
                if (riwayatHasil[i] > max) {
                    max = riwayatHasil[i];
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;
        boolean berjalan = true;

        // b. membuat pilihan menu
        while(berjalan) {
            System.out.println("\n====================================");
            System.out.println("\n            KALKULATOR   \n");
            System.out.println("====================================\n");
            System.out.println("Pilihan Menu : \n");
            System.out.println("1. Penjumlahan (2 Angka)");
            System.out.println("2. Penjumlahan (3 Angka)");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Perpangkatan");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("\nSilahkan pilih menu ( 1 - 8 ) : ");
            int pilihan = input.nextInt();
            double hasil = Double.NaN;

            switch (pilihan) {
                case 1: // penjumlahan 2 parameter
                    System.out.print("\nPENJUMLAHAN 2 BILANGAN\n\n");
                    System.out.print("Masukkan angka pertama : ");
                    double t1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    double t2 = input.nextDouble();
                    hasil = tambah(t1, t2);
                    System.out.printf("Hasil Penjumlahan      : %.2f\n", hasil);
                    break;

                case 2: // penjumlahan 3 parameter
                    System.out.print("\nPENJUMLAHAN 3 BILANGAN\n\n");
                    System.out.print("Masukkan angka pertama : ");
                    double to1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    double to2 = input.nextDouble();
                    System.out.print("Masukkan angka ketiga  : ");
                    double to3 = input.nextDouble();
                    hasil = tambah(to1, to2, to3);
                    System.out.printf("Hasil Penjumlahan      : %.2f\n", hasil);
                    break;

                case 3: // pegurangan
                    System.out.print("\nPENGURANGAN\n\n");
                    System.out.print("Masukkan angka pertama : ");
                    double kr1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    double kr2 = input.nextDouble();
                    hasil = kurang(kr1, kr2);
                    System.out.printf("Hasil Pengurangan      : %.2f\n", hasil);
                    break;

                case 4: // perkalian
                    System.out.print("\nPERKALIAN\n\n");
                    System.out.print("Masukkan angka pertama : ");
                    double kl1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua   : ");
                    double kl2 = input.nextDouble();
                    hasil = kali(kl1, kl2);
                    System.out.printf("Hasil Perkalian        : %.2f\n", hasil);
                    break;

                case 5: // pembagian
                    System.out.print("\nPEMBAGIAN\n\n");
                    System.out.print("Masukkan angka pembilang : ");
                    double bg1 = input.nextDouble();
                    System.out.print("Masukkan angka penyebut  : ");
                    double bg2 = input.nextDouble();
                    hasil = bagi(bg1, bg2);
                    if (!Double.isNaN(hasil)) {
                        System.out.printf("Hasil Pembagian          : %.2f\n", hasil);
                    }
                    break;

                case 6: // perpangkatar
                    System.out.print("\nPERPANGKATAN\n\n");
                    System.out.print("Masukkan angka basis    : ");
                    double p1 = input.nextDouble();
                    System.out.print("Masukkan angka pangkat  : ");
                    double p2 = input.nextDouble();
                    hasil = pangkat(p1, p2);
                    System.out.printf("Hasil Pangkat           : %.2f\n", hasil);
                    break;

                case 7: // akar kuadrat
                    System.out.print("\nAKAR KUADRAD\n\n");
                    System.out.print("Masukkan angka      : ");
                    double ak1 = input.nextDouble();
                    hasil = akarKuadrat(ak1);
                    if (!Double.isNaN(hasil)) {
                        System.out.printf("Hasil Akar Kuadrat  : %.2f\n", hasil);
                    }
                    break;

                case 8: // selesai dan menampilkan riwayat
                    berjalan = false;
                    System.out.println("\nTerima kasih telah menggunakan program kalkulator!");
                    double maxHasil = riwayatKeMaksimum(riwayatHasil, jumlahRiwayat);
                    if (Double.isNaN(maxHasil)) {
                        System.out.println("\nAnda belum melakukan perhitungan sama sekali.");
                    } else {
                        System.out.printf("\nNilai hasil terbesar yang pernah dihitung adalah : %.2f\n", maxHasil);
                    }
                    break;
                default:
                    System.out.println("\nPilihan tidak valid! Silakan pilih menu 1 - 8.");
            }

            if (!Double.isNaN(hasil) && pilihan >= 1 && pilihan <= 7 && jumlahRiwayat < riwayatHasil.length) {
                riwayatHasil[jumlahRiwayat] = hasil;
                ++jumlahRiwayat;
            }
        }

        input.close();
    }
}
