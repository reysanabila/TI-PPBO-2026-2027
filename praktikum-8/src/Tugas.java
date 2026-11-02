public class Tugas {

    public static void main(String[] args) {
        // 1. Membuat object dari class Manager
        Manager mgr = new Manager("Eleanor Rigby", "MGR001", 7500000, 2000000);

        // 2. Membuat object dari class Staff
        Staff stf = new Staff("Lana Del Rey", "STF001", 4500000, 1000000);

        // 3. Membuat object dari class Direktur (turunan dari Manager -> Pegawai)
        Direktur dir = new Direktur(".Feast", "DIR001", 15000000, 5000000, 10000000);

        System.out.println("\n=== Data Manager ===");
        mgr.tampilkanData();
        System.out.println("Tunjangan Jabatan : " + mgr.getTunjanganJabatan());

        System.out.println("\n=== Data Staff ===");
        stf.tampilkanData();
        System.out.println("Tunjangan Kinerja : " + stf.getTunjanganKinerja());

        System.out.println("\n=== Data Direktur ===");
        dir.tampilkanData(); // Mewarisi langsung dari Pegawai (lewat Manager)
        System.out.println("Tunjangan Jabatan : " + dir.getTunjanganJabatan());
        System.out.println("Tunjangan Saham   : " + dir.getTunjanganSaham());
    }

}

