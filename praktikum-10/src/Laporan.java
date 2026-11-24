// Latihan 4 : Class Laporan

public class Laporan implements Cetak {
    private String judul;

    public Laporan(String judul) {
        this.judul = judul;
    }

    @Override
    public void cetak() {
        System.out.println("\nMencetak Laporan         : " + judul);
    }
}

