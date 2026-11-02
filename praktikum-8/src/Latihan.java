public class Latihan {

    public static void main(String[] args) {
        // Test Latihan 1
        System.out.println("\n=== Latihan 1 : Hewan ===");
        Kucing kucingku = new Kucing("Bastian");
        Anjing anjingku = new Anjing("Elexa");

        System.out.print("Suara " + kucingku.nama + " : Miaw Miaw");
        kucingku.bersuara();

        System.out.print("Suara " + anjingku.nama + "   : Gukk GUKKKK");
        anjingku.bersuara();
        System.out.println();

        // Test Latihan 2, 3, & 4: Kendaraan, Mobil, Motor
        System.out.println("\n=== Latihan 2 - Latihan 4 : Kendaraan ===");
        Mobil mobilKu = new Mobil("BMW", 220, 4);
        mobilKu.tampilkanInfo();

        System.out.println();
        Motor motorKu = new Motor("Royal Enfield", 125, "Bobber");
        motorKu.tampilkanInfoMotor();
        System.out.println();

        // Test Latihan 5: Akun & AkunPremium
        System.out.println("\n=== Latihan 5 : Akun ===");
        AkunPremium akunKu = new AkunPremium("Thomas", 7050000.0, 1200000.0);
        akunKu.cekLimit();
    }

}

