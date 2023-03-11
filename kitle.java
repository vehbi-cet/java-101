import java.sql.SQLOutput;
import java.util.Scanner;

public class kitle {
    public static void main(String[] args) {

        double boy , kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Metre Cinsinden Girin : ");
        boy =inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Girin : ");
        kilo =inp.nextInt();

        double vki  = kilo / (boy * boy)  ;

        System.out.println("Vücut Kitle İndeksiniz : " + vki );

    }
}