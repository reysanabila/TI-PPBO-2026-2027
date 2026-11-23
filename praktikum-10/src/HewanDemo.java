public class HewanDemo {
    public static void main(String [] args ) {
        Hewan[] daftar = {
                new Kucing("\nMilo"),
                new Bebek("Donal"),
                new Elang("Garuda"),
        };

        for (Hewan h : daftar) {
            h.bersuara();
            if (h instanceof BisaTerbang) {
                BisaTerbang bt = (BisaTerbang) h;
                bt.terbang();
            }

            if (h instanceof BisaBerenang) {
                ((BisaBerenang) h).berenang();
            }
        }
    }
}

