// Latihan 5

public class Akun {

    protected String username;
    protected double saldo;

    public Akun(String username, double saldo) {
        this.username = username;
        this.saldo = saldo;
    }
}

class AkunPremium extends Akun {

    private double batasKredit;

    public AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }

    public void cekLimit() {
        System.out.println("\n--- Informasi Akun Premium ---");
        System.out.println("Username     : " + username);
        System.out.println("Saldo        : Rp " + saldo);
        System.out.println("Batas Kredit : Rp " + batasKredit);
        System.out.println("Total Limit  : Rp " + (saldo + batasKredit));
    }
}

