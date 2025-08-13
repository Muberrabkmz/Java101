package giriş;
import java.util.Scanner;


public class kdv {
    public static void main(String[] args){
    double tutar, kdvOran=0.18;

    Scanner input= new Scanner(System.in);
        System.out.print("para tutarınızı giriniz:");
        tutar= input.nextDouble();
        double kdvTutar=kdvOran*tutar;
        double kdvliTutar=kdvTutar+tutar;
        System.out.println("kdvsiz tutar:"+tutar);
        System.out.println("kdv oranı:"+kdvOran);
        System.out.println("kdv tutarı:"+kdvTutar);
        System.out.println("kdv eklenmis hali:"+kdvliTutar);
    }
}
