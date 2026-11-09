public class PenggajianDemo {

    public static void main(String [] args ) {

        Pegawai [] daftarPegawai = {
                new Manager ("\nBudi" , "M001" , 3000000 , 1000000 ),
                new Staff ("Siti" , "S001" , 2000000 , 500000 ),
                new Staff ("Andi" , "S002" , 2000000 , 300000 ),

                // Latihan 5 : Menambahkan Object Direktur
                new Direktur("Jamilah", "D001", 8000000, 2000000, 4000000),

        };

        double totalGaji = 0;
        for (Pegawai pg : daftarPegawai ) {
        double gaji = pg.hitungGaji(); // versi sesuai jenis
        System.out.println (pg.nama + "         : "+ gaji );
        totalGaji += gaji;
        }

        System.out.println ("Total gaji  : " + totalGaji );

    }

}

