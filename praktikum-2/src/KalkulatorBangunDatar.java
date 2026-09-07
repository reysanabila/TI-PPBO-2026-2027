/* KalkulatorBangunDatar.java
*   berisi program tentang :
*    1. mencari keliling dan luas persegi panjang
*    2. mencari luas dan keliling lingkaran
*    3. menyimpan hasil luas persegi panjang ke dalam variabel boolean
*       bernama luasBesar yang bernilai true jika luas > 100, dan menampilkan nilainya.
* */

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Program Mencari Luas dan Keliling dari persegi panjang
            System.out.println("1. Mencari Luas dan Keliling Persegi Panjang\n");
            System.out.print("Masukkan panjang dari persegi panjang yang diketahui : ");
            double panjang = input.nextDouble();

            System.out.print("Masukkan lebar dari persegi panjang yang diketahui   :");
            double lebar = input.nextDouble();

            // Rumus mencari luas dan keliling persegi panjangg
            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);

            System.out.println("\nLuas Persegi Panjang adalah     : " + luas);
            System.out.println("Keliling Persegi Panjang adalah : " + keliling);


        // 2. Program Mencari Luas dan Keliling dari lingkaran
            System.out.println("\n\n2. Mencari Luas dan Keliling Lingkaran\n");
            System.out.print("Masukkan jari-jari dari lingkaran yang diketahui : ");
            double jariJari = input.nextDouble();

            // rumusnya :
            double luasLingkaran = Math.PI * jariJari * jariJari;
            double kelilingLingkaran = 2 * Math.PI * jariJari;

            System.out.println("\nLuas Lingkaran adalah     : " + luasLingkaran);
            System.out.println("Keliling Lingkaran adalah : " + kelilingLingkaran);


        // 3. Menyimpan hasil luas persegi panjang ke dalam variabel boolean

            // Mengecek apakah luas persegi > 100
            boolean luasBesar = luas > 100;

            System.out.println("\n3. Apakah luas persegi panjang > 100? (luasBesar) : " + luasBesar);

        input.close();
    }
}
