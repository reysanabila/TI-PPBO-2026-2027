// Latihan 1 : Class Bebek

public class Bebek extends Hewan {

    public Bebek (String nama) {
        super (nama);
    }

    @Override
    public void bersuara () {
        System.out.println (nama + " : Kwekk Kwekk!" );
    }

}

