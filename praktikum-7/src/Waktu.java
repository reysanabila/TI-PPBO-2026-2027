// Latihan no 3. Membuat Class Waktu

public class Waktu {

    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik) {
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("Jam hanya boleh antara jam 0 - 23!");
        }
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("Menit hanya boleh antara menit 0 - 59!");
        }
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("Detik hanya boleh antara Detik 0 - 59!");
        }
    }

    public void tampilkanWaktu() {
        System.out.printf("Waktu : %02d:%02d:%02d\n", jam, menit, detik);
    }

    public static void main(String[] args) {
        System.out.println("\n------ Pengujian Waktu Normal ------\n");
        Waktu waktu1 = new Waktu(9, 35, 12);
        waktu1.tampilkanWaktu();

        System.out.println("\n------ Pengujian Waktu Tidak Normal ------\n");
        Waktu waktu2 = new Waktu(30, -12, 120);
        waktu2.tampilkanWaktu();
    }

}

