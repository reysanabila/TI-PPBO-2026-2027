// Tugas

public class BangunDatar {

    protected String namaBangun; // Tugas 1 : String namaBangun

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    // Tugas 1 : Hitung Luas
    public double hitungLuas() {
        return 0.0;
    }

    // Tugas 1 : Hitung Keliling
    public double hitungKeliling() {
        return 0.0;
    }

    // Tugas 3 : tampilkanInfo tidak di-override
    public void tampilkanInfo() {
        System.out.println("\nNama Bangun   : " + namaBangun);
        System.out.println("Luas          : " + hitungLuas());
        System.out.println("Keliling      : " + hitungKeliling());
        System.out.println("-----------------------------------");
    }

}

