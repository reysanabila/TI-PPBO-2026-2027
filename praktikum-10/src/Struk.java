// Latihan 4 : Class Struk

public class Struk implements Cetak {
    private String nomorTransaksi;

    public Struk(String nomorTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
    }

    @Override
    public void cetak() {
        System.out.println("Mencetak Struk Transaksi : " + nomorTransaksi);
    }
}

