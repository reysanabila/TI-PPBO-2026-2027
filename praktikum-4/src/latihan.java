import java.util.Scanner;

public class latihan {

    public static void main(String[] args) {

        // 1. Program perkalian for loop

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n---- PERKALIAN ----\n");
        System.out.print("\nMasukkan angka perkalian untuk membuat tabel perkalian : ");
        int angka = scanner.nextInt();

        System.out.println("\n---- Tabel Perkalian " + angka + " ----");
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }

        // 2. Program segitiga terbalik dab pola persegi

        System.out.print("\n---- SEGITIGA TERBALIK DAN POLA PERSEGI ----\n");
        System.out.print("\nMasukkan ukuran / tinggi : ");
        int n = scanner.nextInt();

        System.out.println("\n--- Pola Segitiga Terbalik ---");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\n--- Pola Persegi ---");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 3. Array terbalik

        System.out.print("\n---- ARRAY TERBALIK ----\n");
        int[] angkaarray = new int[10];

        System.out.println("\nMasukkan 10 angka :\n");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemen ke-" + (i + 1) + " : ");
            angkaarray[i] = scanner.nextInt();
        }

        System.out.println("\nArray dalam urutan terbalik :");
        for (int i = 9; i >= 0; i--) {
            System.out.print(angkaarray[i] + " ");
        }
        System.out.println();

        // 4. Membaca matriks 3 x 3

        System.out.print("\n---- MATRIKS 3 X 3 ----\n");

        int[][] matriks = new int[3][3];
        int totalKeseluruhan = 0;

        System.out.println("\nMasukkan elemen matriks 3 x 3 :\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Hasil Perhitungan ---\n");
        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;
            for (int j = 0; j < 3; j++) {
                jumlahBaris += matriks[i][j];
            }
            System.out.println("Jumlah elemen baris ke-" + (i + 1) + " : " + jumlahBaris);
            totalKeseluruhan += jumlahBaris;
        }

        System.out.println("\nJumlah seluruh elemen matriks : " + totalKeseluruhan);

        // 5. Menampilkan nilai terbesar kedua

        System.out.print("\n---- MENAMPILKAN NILAI TERBESAR KEDUA ----\n");
        System.out.print("\nMasukkan jumlah elemen array : ");
        int a = scanner.nextInt();

        if (a < 2) {
            System.out.println("Masukkan minimal 2 elemen!");
            return;
        }

        int[] arr = new int[a];
        System.out.println("\nMasukkan elemen array :");
        for (int i = 0; i < a; i++) {
            System.out.print("Elemen ke-" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > terbesar) {
                terbesarKedua = terbesar;
                terbesar = num;
            } else if (num > terbesarKedua && num != terbesar) {
                terbesarKedua = num;
            }
        }

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Semua elemen bernilai sama");
        } else {
            System.out.println("\nNilai terbesar       : " + terbesar);
            System.out.println("Nilai terbesar kedua : " + terbesarKedua);
        }

        // 6. Mengurutkan array secara ascending menggunakan bubble sort

        System.out.print("\n---- BUBBLE SORT ----\n");
        System.out.print("\nMasukkan jumlah elemen array : ");
        int c = scanner.nextInt();
        int[] array = new int[c];

        System.out.println("\nMasukkan elemen array :");

        for (int i = 0; i < c; i++) {
            System.out.print("Elemen ke-" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("\nTampilan array sebelum diurutkan : ");

        for (int num : array) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < c - 1; i++) {
            for (int j = 0; j < c - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("\nTampilan array sesudah diurutkan (Ascending) : ");

        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
