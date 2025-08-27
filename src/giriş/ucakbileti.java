package giriş;
import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        int km,age,tip;
        double ucret = 0;
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilicek mesafeyi km olarak giriniz:");
        km= input.nextInt();
        if(km<0){
            System.out.println("Hatalı veri girdiniz.");
        }else{
            ucret=km/10;
        }
        System.out.print("Yaşınızı giriniz:");
        age= input.nextInt();
        if(age<0){
            System.out.println("Hatalı veri girdiniz:");
        }else if(age<12){
            ucret=ucret/2;
        }
        else if(age>=12 && age<24){
            ucret=(ucret)-(ucret/10);
        }else if(age>=65){
            ucret=(ucret)-(ucret*0.3);
        }


        System.out.print("Yolculuk tipini seçiniz gidiş-geliş(2),tek yön(1):");
        tip= input.nextInt();
        if(tip==2){
            ucret=(ucret)-(ucret*0.2);
        }
        System.out.print("toplam ödenecek tutar:"+ucret);


    }
}
