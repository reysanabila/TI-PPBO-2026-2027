// Latihan 3 : Subclass Pinguin

public class Pinguin extends Hewan implements BisaBerenang {

    public Pinguin(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println (nama + "  : Kerr Kerr!" );
    }

    @Override
    public void berenang() {
        System.out.println(nama + " berenang dengan lincah di dalam air.");
    }
}

