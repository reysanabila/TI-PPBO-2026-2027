import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Latihan 1 Membaca bilangan bulat

        System.out.print("\n---- MEMBACA BILANGAN BULAT ----\n\n");
        System.out.print("Masukkan sembarang bilangan bulat : ");
        int angka = input.nextInt();

        System.out.print("\n");

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");
        }

        // Latihan 2 Membaca bilangan terbesar dari tiga bilangan bulat

        System.out.print("\n---- MEMBACA BILANGAN TERBESAR ----\n\n");

        System.out.print("Masukkan bilangan bulat pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan bulat kedua   : ");
        int b = input.nextInt();
        System.out.print("Masukkan bilangan butat ketiga  : ");
        int c = input.nextInt();

        int terbesar;

        if (a >= b) {
            if (a >= c) {
                terbesar = a;
            } else {
                terbesar = c;
            }

        } else {
            if (b >= c) {
                terbesar = b;
            } else {
                terbesar = c;
            }
        }

        System.out.println("\nBilangan terbesar dari tiga bilangan bulat yang diinput adalah : " + terbesar);

        // Latihan 3 Membuat menu makanan sederhana

        System.out.print("\n---- MENU MAKANAN SEDERHANA ----\n\n");

        System.out.println("1. Roti Bakar Coklat");
        System.out.println("2. Burger Isi Daging");
        System.out.println("3. Kebab Spesial");
        System.out.println("4. Burger Spesial");
        System.out.print("Silahkan pilih menu yang tercantum di daftar (1-4) : ");

        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("\nAnda memesan : Roti Bakar Coklat");
                break;
            case 2:
                System.out.println("\nAnda memesan : Burger Isi Daging");
                break;
            case 3:
                System.out.println("\nAnda memesan : Kebab Spesial");
                break;
            case 4:
                System.out.println("\nAnda memesan : Burger Spesial");
                break;
            default:
                System.out.println("\nPilihan yang anda masukkan salah. Silakan pilih kembali menu yang tersedia (1-4).");
                break;
        }

        // Latihan 4 Menghitung harga tiket bioskop

        System.out.print("\n---- MENGHITUNG HARGA TIKET BIOSKOP ----\n\n");

        System.out.print("Silahkan masukkan umur Anda                 : ");
        int umur = input.nextInt();

        System.out.print("Apakah Anda seorang mahasiswa? (true/false) : ");
        boolean Mahasiswa = input.nextBoolean();

        int HargaTiket;

        if (umur < 12) {
            HargaTiket = 15000;
        }

        else if (Mahasiswa && umur < 25) {
            HargaTiket = 35000;
        }

        else {
            HargaTiket = 50000;
        }

        System.out.println("\nHarga tiket Anda adalah                     : Rp " + HargaTiket);

        // Latihan 5 Membuat klasifikasi indeks massa tubuh (BMI) sederhana

        System.out.print("\n---- KLASIFIKASI INDEKS MASSA TUBUH ----\n\n");

        System.out.print("Masukkan berat badan anda dalam kg  : ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan anda dalam cm : ");
        double tinggicm = input.nextDouble();

        double tinggimeter = tinggicm / 100; // Mengkonversi tinggi badan dari cm ke dalam meter

        double bmi = berat / (tinggimeter * tinggimeter); // Rumus dari BMI

        String kategori;
        if (bmi < 18.5) {
            kategori = "Kurus";
        }

        else if (bmi < 25.0) {
            kategori = "Normal (Ideal)";
        }

        else if (bmi < 30.0) {
            kategori = "Gemuk";
        }

        else {
            kategori = "Obesitas";
        }

        System.out.printf("Nilai BMI Anda adalah : %.2f\n", bmi);
        System.out.println("Kategori              : " + kategori);

        input.close();
    }
}
