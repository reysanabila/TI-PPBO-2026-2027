public abstract class BangunDatar {

    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    // abstract method : tanpa isi, wajib diisi subclass
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    // method biasa : berisi kode, diwarisi apa adanya
    public void tampilkanInfo() {
        System.out.println("\nNama Bangun   : " + namaBangun);
        System.out.println("Luas          : " + hitungLuas());
        System.out.println("Keliling      : " + hitungKeliling());
    }

}

