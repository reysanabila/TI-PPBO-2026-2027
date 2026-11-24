// Latihan 4 : Pengujian Cetak

public class CetakDemo {
    public static void main(String[] args) {
        Cetak[] dokumen = {
                new Laporan("Laporan Keuangan Bulanan"),
                new Struk("TRX-20261125-01")
        };

        for (Cetak c : dokumen) {
            c.cetak();
        }
    }
}

