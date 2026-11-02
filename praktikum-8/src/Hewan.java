// Latihan 1

class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(" ");
    }
}

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama); // Memanggil constructor Hewan
    }
}

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama); // Memanggil constructor Hewan
    }
}

