package giriş;
import java.util.Scanner;

public class kdvhesaplama {
    public static void main(String[] args){
        int tutar;
        double kdvOran= 0.18,kdvOran2=0.08;

        Scanner input=new Scanner(System.in);
        System.out.print("tutar giriniz:");
        tutar= input.nextInt();
        if ( tutar<1000){
            double kdvTutar=tutar*kdvOran;
            double kdvliTutar=tutar+kdvTutar;

            System.out.println("kdvsiz fiyat:"+tutar);
            System.out.println("kdv oranınız:"+kdvOran);
            System.out.println("kdv tutarınız:"+kdvTutar);
            System.out.println("kdvli tutar:"+kdvliTutar);
        }else{
            double kdvTutar2=tutar*kdvOran2;
            double kdvliTutar2=tutar+kdvTutar2;
            System.out.println("kdvsiz fiyat:"+tutar);
            System.out.println("kdv oranınız:"+kdvOran2);
            System.out.println("kdv tutarınız:"+kdvTutar2);
            System.out.println("kdvli tutar:"+kdvliTutar2);
        }


    }
}
