package giriş;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int secim,n1,n2,sonuc;
        System.out.print("birinci sayıyı giriniz:");
        n1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        n2=input.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("seçim yapiniz:");
        secim=input.nextInt();
        switch(secim){
            case 1:
                sonuc=n1+n2;
                System.out.print("sonuç:"+sonuc);
                break;
            case 2:
                sonuc=n1-n2;
                System.out.print("sonuç:"+sonuc);
                break;
            case 3:
                sonuc=n1*n2;
                System.out.print("sonuç:"+sonuc);
                break;
            case 4:
                if(n2!=0){
                sonuc=n1/n2;
                System.out.print("sonuç:"+sonuc);}
                else{
                    System.out.print("bir sayı sıfıra bölünemez.");
                }
                break;
            default:
                System.out.print("doğru seçim yapmadınız.");



        }

    }
}
