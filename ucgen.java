import java.sql.SQLOutput;
import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        int a,b,c,u,d;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen A Uzunluğunu Girirniz : ");
        a = girdi.nextInt();
        System.out.print("Lütfen B Uzunluğunu Giriniz : ");
        b = girdi.nextInt();
        System.out.print("Lütfen C Uzunluğunu Giriniz : ");
        c = girdi.nextInt();

        u=(a+b+c)/2 ;
        System.out.println("Kenar Uzunluklarını Girdiğiniz Üçgenin Çevresi = "+2*u);
        d=u*(u-a)*(u-b)*(u-c);
        System.out.println("Kenar Uzunluklarını Girdiğiniz Üçgenin Alanı = "+Math.sqrt(d));

    }
}