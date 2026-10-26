// Tugas

public class RekeningBank {

    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening;

    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
        this.jenisRekening = jenisRekening;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setoran harus lebih dari 0!");
            return;
        }
        saldo += jumlah;
        System.out.println("Setoran berhasil. Saldo anda sekarang   : " + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0!");
        } else if (jumlah > saldo) {
            System.out.println("Mohon maaf, saldo anda tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo anda sekarang : " + saldo);
        }
    }

    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer gagal : Jumlah transfer harus lebih dari 0!");
        } else if (jumlah > this.saldo) {
            System.out.println("Transfer gagal : Saldo pengirim (" + this.saldo + ") tidak mencukupi untuk transfer sebesar : " + jumlah + ".");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer berhasil!");
            System.out.println("- Dari Rekening    : " + this.nomorRekening + " (" + this.pemilik + ")");
            System.out.println("- Ke Rekening      : " + tujuan.nomorRekening + " (" + tujuan.pemilik + ")");
            System.out.println("- Jumlah Transfer  : " + jumlah);
            System.out.println("- Sisa Saldo Anda  : " + this.saldo);
        }
    }

    public void cetakMutasi() {
        System.out.println("\n----------- LAPORAN MUTASI REKENING -----------");
        System.out.println("Nomor Rekening  : " + this.nomorRekening);
        System.out.println("Nama Pemilik    : " + this.pemilik);
        System.out.println("Jenis Rekening  : " + this.jenisRekening);
        System.out.println("Saldo Saat Ini  : Rp " + String.format("%,.2f", this.saldo));
        System.out.println("-----------------------------------------------\n");
    }

}

