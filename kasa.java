import java.sql.SQLOutput;
import java.util.Scanner;

public class kasa {
    public static void main(String[] args) {

        double Armut,Elma,Domates,Muz,Patlican;
        double a = 2.14 ,e = 3.67 ,d = 1.11,m = 0.95 ,p = 5.00 ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut : ");
        Armut =inp.nextDouble();

        System.out.print("Kaç Kilo Elma : ");
        Elma =inp.nextDouble();

        System.out.print("Kaç Kilo Domates : ");
        Domates =inp.nextDouble();

        System.out.print("Kaç Kilo Muz : ");
        Muz =inp.nextDouble();

        System.out.print("Kaç Kilo Patlıcan : ");
        Patlican =inp.nextDouble();

        double Islem = (Armut*a) + (Elma*e) + (Domates*d) + (Muz*m) + (Patlican*p);

        System.out.println("Toplam Ödenecek Tutar : " + Islem + "TL");


    }
}