public class KebunBinatangDemo {

    public static void main(String [] args ) {

        Hewan[] daftarHewan = {
                new Kucing ("\nMilo" ),
                new Anjing ("Rex" ),
                new Kucing ("Oyen" ),
                new Bebek ("Thomas")
        };

        for (Hewan h : daftarHewan ) {
            h.bersuara (); // versi method sesuai dengan object aslinya
        }

    }

}

