import java.util.Arrays;
import java.util.Scanner;

public class Latihan {

    // 1. membuat method luas persegi panjang dan luas lingkaran

    // luas persegi panjang
    public static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    // luas lingkaran
    public static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    // 2. membuat method prima
    public static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)n); ++i) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    // 3. membuat method konversi suhu
    public static double konversiSuhu(double celsius) {
        return celsius * (double)9.0F / (double)5.0F + (double)32.0F;
    }

    // versi menerima (doubel celsius, String skalaTujuan)
    public static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else {
            return skalaTujuan.equalsIgnoreCase("Fahrenheit") ? celsius * (double)9.0F / (double)5.0F + (double)32.0F : celsius;
        }
    }

    // 4. membuat method nilai minimum dan maksimum

    // nilai minimum
    public static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for(int i = 1; i < data.length; ++i) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        return min;
    }

    // nilai maksimum
    public static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for(int i = 1; i < data.length; ++i) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        return max;
    }

    // 5. membuat method hitung total dan filter rata

    // hitung total
    public static int hitungTotal(int[] data) {
        int total = 0;

        for(int val : data) {
            total += val;
        }

        return total;
    }

    // filter rata
    public static int[] filterDiAtasRataRata(int[] data) {
        if (data.length == 0) {
            return new int[0];
        } else {
            double rataRata = (double)hitungTotal(data) / (double)data.length;
            int count = 0;

            for(int val : data) {
                if ((double)val > rataRata) {
                    ++count;
                }
            }

            int[] hasil = new int[count];
            int index = 0;

            for(int val : data) {
                if ((double)val > rataRata) {
                    hasil[index++] = val;
                }
            }

            return hasil;
        }
    }

    // menampilkan output latihan 1 sampai 5

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // latihan 1
        System.out.println("\n=== Latihan 1 : Luas Persegi Panjang dan Luas Lingkaran ===\n");
        System.out.println("Luas persegi panjang (diketahui panjang = 5 dan lebar = 3) : " + luasPersegiPanjang((double)5.0F, (double)3.0F));
        System.out.println("Luas lingkaran (diketahui jari-jari = 7)                   : " + luasLingkaran((double)7.0F));
        System.out.println();

        // latihan 2
        System.out.println("\n=== Latihan 2 : Bilangan Prima 1 Sampai 50 ===");
        System.out.print("\n");

        for(int i = 1; i <= 50; ++i) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        // latihan 3
        System.out.println("\n=== Latihan 3 : Konversi Suhu ===\n");
        double c = (double)25.0F;
        System.out.println(c + " °C ke Fahrenheit            : " + konversiSuhu(c) + " °F");
        System.out.println(c + " °C ke Kelvin                : " + konversiSuhu(c, "Kelvin") + " K");
        System.out.println(c + " °C ke Fahrenheit (overload) : " + konversiSuhu(c, "Fahrenheit") + " °F");
        System.out.println();

        // latihan 4
        System.out.println("\n=== Latihan 4 : Nilai Minimum Dan Maksimum ===\n");
        System.out.print("Masukkan jumlah data yang ingin diproses : ");
        int n4 = input.nextInt();
        if (n4 > 0) {
            int[] dataLatihan4 = new int[n4];
            System.out.println("\nSilahkan masukkan " + n4 + " jumlah data");

            for(int i = 0; i < n4; ++i) {
                System.out.print("Data ke-" + (i + 1) + " : ");
                dataLatihan4[i] = input.nextInt();
            }

            System.out.println("\nMaka nilai minimum adalah    : " + cariNilaiMinimum(dataLatihan4));
            System.out.println("Maka nilai maksimum adalah   : " + cariNilaiMaksimum(dataLatihan4));
        } else {
            System.out.println("Jumlah data tidak valid.");
        }

        // latihan 5
        System.out.println("\n\n=== Latihan 5 : Mencari Nilai Di Atas Rata - Rata ===");
        System.out.print("\nMasukkan jumlah nilai yang ingin diproses : ");
        int n5 = input.nextInt();
        if (n5 > 0) {
            int[] dataLatihan5 = new int[n5];
            System.out.println("\nSilahkan masukkan " + n5 + " jumlah nilai");

            for(int i = 0; i < n5; ++i) {
                System.out.print("Nilai ke-" + (i + 1) + " : ");
                dataLatihan5[i] = input.nextInt();
            }

            int total = hitungTotal(dataLatihan5);
            double rataRata = (double)total / (double)n5;
            System.out.println("\nTotal Jumlah Nilai      : " + total);
            System.out.printf("Rata-rata Kelas         : %.2f\n", rataRata);
            int[] diatasRata = filterDiAtasRataRata(dataLatihan5);
            System.out.println("Nilai di atas rata-rata : " + Arrays.toString(diatasRata));
        } else {
            System.out.println("Jumlah data tidak valid.");
        }

        input.close();
    }
}
