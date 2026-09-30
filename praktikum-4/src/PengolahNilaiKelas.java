import java.util.Scanner;

public class PengolahNilaiKelas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double KKM = 70.0;

        // a) Membaca jumlah mahasiswa dan menginput nilainya ke dalam array

        System.out.println("==================================================");
        System.out.println("           INPUT DATA NILAI MAHASISWA             ");
        System.out.println("==================================================");

        System.out.print("\nMasukkan jumlah mahasiswa : ");
        int n = scanner.nextInt();

        // mengingatkan user agar jumlah mahasiswa yang di masukkan tidak bernilai 0
        if (n <= 0) {
            System.out.println("\nJumlah mahasiswa jangan bernilai 0");
            scanner.close();
            return;
        }

        double[] nilai = new double[n];
        double[] nilaiAsli = new double[n];

        // Meminta user memasukkan nilai dari masing - masing mahasiswa
        System.out.println("\nSilahkan masukkan nilai ujian masing-masing mahasiswa :");
        for (int i = 0; i < n; i++) {
            System.out.print("\nNilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = scanner.nextDouble();
            nilaiAsli[i] = nilai[i];
        }

        // b) Menghitung dan menampilkan nilai rata-rata kelas, nilai tertinggi, nilai terendah, jumlah mahasiswa yang lulus, dan jumlah mahasiswa yang tidak lulus;

        double total = 0;
        double tertinggi = nilai[0];
        double terendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            // Mencari nilai tertinggi
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            // Mencari nilai terendah
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            // Menentukan kelulusan mahasiswa berdasarkan nilai kkm
            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Mencari nilai rata - rata
        double rataRata = total / n;

        // c) Mengurutkan array secara ascending menggunakan bubble sort

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    double temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // d) Menampilkan hasil

        System.out.println("\n==================================================");
        System.out.println("             LAPORAN HASIL UJIAN KELAS            ");
        System.out.println("==================================================");
        System.out.printf(" Batas Nilai Kelulusan (KKM)        : %.1f\n", KKM);
        System.out.printf(" Jumlah Mahasiswa                   : %d orang\n", n);
        System.out.println("--------------------------------------------------");
        System.out.printf(" Nilai Rata-rata Kelas              : %.2f\n", rataRata);
        System.out.printf(" Nilai Tertinggi                    : %.2f\n", tertinggi);
        System.out.printf(" Nilai Terendah                     : %.2f\n", terendah);
        System.out.println("--------------------------------------------------");
        System.out.printf(" Jumlah Mahasiswa Lulus             : %d orang\n", jumlahLulus);
        System.out.printf(" Jumlah Mahasiswa Yang Tidak Lulus  : %d orang\n", jumlahTidakLulus);
        System.out.println("==================================================");
        System.out.println("               DAFTAR URUTAN NILAI                ");
        System.out.println("==================================================");

        System.out.print(" Sebelum Diurutkan : [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiAsli[i] + (i < n - 1 ? ", " : " "));
        }
        System.out.println("]");

        System.out.print(" Sesudah Diurutkan : [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + (i < n - 1 ? ", " : " "));
        }
        System.out.println("]");
        System.out.println("==================================================");

        scanner.close();
    }

}
