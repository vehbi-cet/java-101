import java.sql.SQLOutput;
import java.util.Scanner;

public class kdv {

    public static void main(String[] args) {

        double tutar,kdvOran =0.18 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Ödeme Tutarınızı Girin : ");
        tutar = inp.nextDouble();

        double  kdvTutari= tutar * kdvOran ;
        double  kdvliTutar = tutar + kdvTutari;

        kdvOran = (tutar<=1000) ? 0.18 : 0.8 ;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutari);
        System.out.println("KDV'li Tutar :" + kdvliTutar);

    }
}