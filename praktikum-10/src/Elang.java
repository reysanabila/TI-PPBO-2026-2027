public class Elang extends Hewan implements BisaTerbang {

    public Elang (String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println (nama + " : Kriiik!" );
    }

    @Override
    public void terbang() {
        System.out.println (nama + " terbang tinggi di angkasa" );
    }
}

