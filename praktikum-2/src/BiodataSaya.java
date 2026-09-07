import java.util.Scanner;

public class BiodataSaya {
    public static void main(String[] args) {

        // Latihan Nomor 1 (Biodata Saya)

        System.out.println("Latihan Nomor 1\n");

        System.out.println("Nama          : Reysa Nabila"); // memasukkan nama
        System.out.println("NIM           : 2025573010101"); // memasukkan nim
        System.out.println("Program Studi : Teknik Informatika"); // memasukkan prodi



        // Latihan Nomor 2 (Biodata Saya dengan print)

        System.out.println("\n\nLatihan Nomor 2\n");

        System.out.print("Nama          : Reysa Nabila - "); // memasukkan nama
        System.out.print("NIM           : 2025573010101"); // memasukkan nim



        // Latihan Nomor 3 (Mendeklarasikan variabel)

        System.out.println("\n\n\nLatihan Nomor 3\n");

        int umur = 20;
        double tinggibadan = 155.2;
        char inisial = 'R';
        boolean mahasiswaAktif = true;

        System.out.println("Umur                    : " + umur);
        System.out.println("Tinggi Badan            : " + tinggibadan);
        System.out.println("Inisial                 : " + inisial);
        System.out.println("Status Mahasiswa Aktif  : " + mahasiswaAktif);



        // Latihan Nomor 4 (Konversi Suhu)

        System.out.println("\n\nLatihan Nomor 4\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam derajat Celsius : ");
        double celsius = input.nextDouble();

        // rumus konversi
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Hasil konversi                      : " + fahrenheit + " °F");



        // Latihan Nomor 5 (Operasi Aritmatika dan Perbandingan Boolean)

        System.out.println("\n\nLatihan Nomor 5\n");

        System.out.print("Masukkan bilangan pertama : ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua   : ");
        int b = input.nextInt();

        System.out.println("\n\n-------- Hasil Operasi Aritmatika --------\n");
        System.out.println(a + " + " + b + " = " + (a + b)); // Operasi Pertambahan
        System.out.println(a + " - " + b + " = " + (a - b)); // Operasi Pengurangan
        System.out.println(a + " * " + b + " = " + (a * b)); // Operasi Perkalian

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b)); // Operasi Pembagian
            System.out.println(a + " % " + b + " = " + (a % b)); // Operasi Sisa Bagi
        } else {
            System.out.println("Pembagian dan sisa bagi tidak bisa dilakukan dengan angka 0.");
        }

        System.out.println("\n\n-------- Hasil Perbandingan dalam Boolean --------\n");
        System.out.println(a + " > " + b + "  : " + (a > b)); // Lebih Besar
        System.out.println(a + " < " + b + "  : " + (a < b)); // Lebih Kecil
        System.out.println(a + " == " + b + " : " + (a == b)); // Sama Besar

        input.close();
    }
}
