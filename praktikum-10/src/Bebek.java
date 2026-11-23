public class Bebek extends Hewan
        implements BisaTerbang, BisaBerenang {

    public Bebek (String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println (nama + "  : Kwek kwek!" );
    }

    @Override
    public void terbang() {
        System.out.println (nama + " terbang rendah" );
    }

    @Override
    public void berenang() {
    System.out.println (nama + " berenang di kolam" );
    }
}

