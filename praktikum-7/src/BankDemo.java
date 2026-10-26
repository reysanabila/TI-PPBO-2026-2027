public class BankDemo {

    public static void main(String [] args ) {
        RekeningBank rek = new RekeningBank ("001" , "Budi" , 100000 );

        rek.setor (50000);
        rek.tarik (30000);
        rek.tarik (500000 ); // seharusnya ditolak, saldo tidak cukup
        rek.setor (-1000);  // seharusnya ditolak, jumlah tidak valid

        System.out.println ("Saldo akhir           : " + rek.getSaldo ());
    }

}

