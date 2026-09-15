import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int Tarif_450 = 415;
        final int Tarif_900 = 1352;
        final int Tarif_1300 = 1444;
        final int Tarif_2200 = 1444;
        final int Tarif_di_atas_2200 = 1700;

        System.out.println("\n---- MENGHITUNG TARIF LISTRIK ----\n");
        System.out.println("Nominal Daya Listrik : ");
        System.out.println("1. 450");
        System.out.println("2. 900");
        System.out.println("3. 1300");
        System.out.println("4. 2200");
        System.out.println("5. Di atas 2200");

        // 1. Membaca input golongan

        System.out.print("\nMasukkan golongan daya listrik pelanggan (VA) : ");
        int Daya = input.nextInt();

        // 2. Membaca input pemakaian listrik

        System.out.print("Masukkan jumlah pemakaian listrik (kWh)       : ");
        double kwh = input.nextDouble();

        // 4. Menambahkan validasi apabila input kWh bernilai negatif atau nol

        if (kwh <= 0) {
            System.out.println("Inputan anda tidak valid. Jumlah kWh harus lebih besar dari 0.");
        } else {
            int TarifPerKwh = 0;
            boolean DayaValid = true;

            if (Daya == 450) {
                TarifPerKwh = Tarif_450;
            } else if (Daya == 900) {
                TarifPerKwh = Tarif_900;
            } else if (Daya == 1300) {
                TarifPerKwh = Tarif_1300;
            } else if (Daya == 2200) {
                TarifPerKwh = Tarif_2200;
            } else if (Daya > 2200) {
                TarifPerKwh = Tarif_di_atas_2200;
            } else {
                DayaValid = false;
            }

            // 3. Menghitung total tagihan

            if (!DayaValid) {
                System.out.println("Golongan daya yang anda inputkan tidak valid. Masukkan 450, 900, 1300, 2200, atau > 2200.");
            } else {
                double totalTagihan = kwh * TarifPerKwh;

                // 5) Menampilkan hasil akhir
                System.out.println("\n\n=============================================");
                System.out.println("           RINCIAN TAGIHAN LISTRIK        ");
                System.out.println("=============================================\n");
                System.out.printf("Golongan Daya        : %d VA\n", Daya);
                System.out.printf("Jumlah Pemakaian     : %.2f kWh\n", kwh);
                System.out.printf("Tarif per kWh        : Rp %,d\n", TarifPerKwh);
                System.out.println("\n---------------------------------------------");
                System.out.printf("Total Tagihan        : Rp %,.2f\n", totalTagihan);
                System.out.println("=============================================");
            }
        }
        input.close();
    }
}
