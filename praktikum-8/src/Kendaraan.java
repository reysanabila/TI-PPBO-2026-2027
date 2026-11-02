// Latihan 2 - Latihan 4

class Kendaraan {
    protected String merek;
    protected int kecepatanMaks;

    public Kendaraan(String merek, int kecepatanMaks) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
}

class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("\n--- Informasi Mobil ---");
        System.out.println("Merek        : " + merek);
        System.out.println("Kecepatan    : " + kecepatanMaks + " km/jam");
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}

class Motor extends Kendaraan {

    protected String jenisMotor; // Contoh: 'Matic' / 'Manual'

    public Motor(String merek, int kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }

    public void tampilkanInfoMotor() {
        System.out.println("\n--- Informasi Motor ---");
        System.out.println("Merek        : " + merek);
        System.out.println("Kecepatan    : " + kecepatanMaks + " km/jam");
        System.out.println("Jenis Motor  : " + jenisMotor);
    }
}

