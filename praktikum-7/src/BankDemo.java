// Tugas

public class BankDemo {

    public static void main(String[] args) {
        RekeningBank akun1 = new RekeningBank("ACC001", "Qia Ayla Azzura", 2350000, "Tabungan");
        RekeningBank akun2 = new RekeningBank("ACC002", "Raihan Safitri", 5700000, "Giro");

        System.out.println("\n----------------------- Kondisi Awal Rekening -----------------------");
        akun1.cetakMutasi();
        akun2.cetakMutasi();

        System.out.println("----------- Penyetoran dan Penarikan Uang (Qia) -----------");
        akun1.setor(500000);
        akun1.tarik(200000);
        akun1.tarik(10000000);
        akun1.setor(-50000);

        System.out.println("\n----------- Penyetoran dan Penarikan Uang (Raihan) -----------");
        akun2.setor(1000000);
        akun2.tarik(500000);

        System.out.println("\n\n----------------------- Melakukan Tranfer (Qia ke Raihan) -----------------------");
        System.out.println("\n----------- Tranfer Berhasil -----------");
        akun1.transferKe(akun2, 340000);

        System.out.println("\n----------- Transfer Gagal (Saldo anda Kurang) -----------");
        akun1.transferKe(akun2, 5000000);

        System.out.println("\n----------- Transfer Gagal (Jumlah Transfer Tidak Valid) -----------");
        akun1.transferKe(akun2, -100000);

        System.out.println("\n\n----------------------- Kondisi Akhir Rekening -----------------------");
        akun1.cetakMutasi();
        akun2.cetakMutasi();
    }

}

