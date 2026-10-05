public class ScopeDemo {

    static void metodeA() {
        int x = 10; // x milik metode A
        System.out.println("Di metode A, x = " + x);
    }

    static void metodeB() {
        int x = 99; // x milik metode B, berbeda dari metode A
        System.out.println("Di metode B, x = " + x);
    }

    public static void main(String[] args) {
        metodeA();
        metodeB();
    }

}
