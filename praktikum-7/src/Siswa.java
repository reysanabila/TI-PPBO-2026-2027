// Latihan no 4. Membuat class Siswa

public class Siswa {

    private double nilai;

    public Siswa(double nilai) {
        setNilai(nilai);
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus berada di antara 1 - 100!");
        }
    }

    public char getNilaiHuruf() {
        if (nilai >= 85) {
            return 'A';
        } else if (nilai >= 70) {
            return 'B';
        } else if (nilai >= 55) {
            return 'C';
        } else if (nilai >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void main(String[] args) {
        System.out.println("\n------ Pengujian Siswa (Jika Nilai Normal) ------");
        Siswa siswa1 = new Siswa(88.5);
        System.out.println("Nilai Angka : " + siswa1.getNilai());
        System.out.println("Nilai Huruf : " + siswa1.getNilaiHuruf());

        System.out.println("\n------ Pengujian Siswa (Nilai Masih Normal) ------");
        Siswa siswa2 = new Siswa(65.0);
        System.out.println("Nilai Angka : " + siswa2.getNilai());
        System.out.println("Nilai Huruf : " + siswa2.getNilaiHuruf());

        System.out.println("\n------ Pengujian Siswa (Jika Nilai Tidak Normal) ------");
        Siswa siswa3 = new Siswa(105.0);
        System.out.println("Nilai Angka : " + siswa3.getNilai());
        System.out.println("Nilai Huruf : " + siswa3.getNilaiHuruf());
    }

}

