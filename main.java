import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Not : ");
        mat = inp.nextInt();

        System.out.print("Fizik Not : " );
        fizik = inp.nextInt();

        System.out.print("Kimya Not : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Not : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Not : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Not : ");
        muzik = inp.nextInt();

        int toplam = ( mat + fizik + kimya + turkce + tarih + muzik);
        float sonuc = toplam / 6;
        System.out.println("Ortalamanız : "+ sonuc);

        String  str = sonuc>=50 ? "Geçti" : "Kaldı";
        System.out.println("Sınıfı Geçme Durumu : " + str);
    }
}
