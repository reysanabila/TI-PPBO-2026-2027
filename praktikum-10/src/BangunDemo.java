// Latihan 1 : Pengujian Bangun Datar

public class BangunDemo {
    public static void main(String[] args) {

        BangunDatar[] daftar = {
                new Persegi(5),
                new PersegiPanjang(6, 4),
                new Lingkaran(7)
        };

        for (BangunDatar b : daftar) {
            b.tampilkanInfo();
            System.out.println("-----------------------------------");
        }
    }
}

