import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angka;

        do {
            System.out.print("\nMasukkan angka (0 untuk berhenti): ");
            angka = sc.nextInt();
            System.out.println("\nAnda memasukkan: " + angka);
        } while (angka != 0);

        System.out.println("\nProgram berhenti.");
    }

}