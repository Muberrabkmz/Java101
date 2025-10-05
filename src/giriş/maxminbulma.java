package giriş;
import java.util.Scanner;
public class maxminbulma {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int n;
        int enBuyuk=1;
        int enKucuk=1;

        System.out.print("kaç tane sayı giriceksiniz:");
        n= inp.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        int sayi = inp.nextInt();
         enBuyuk = sayi;
         enKucuk = sayi;

        for(int i=2;i<=n;i++){
            System.out.print(i+ ". sayıyı giriniz:");
             sayi= inp.nextInt();

        if(sayi>enBuyuk){
            enBuyuk=sayi;
        }
        if(sayi<enKucuk){
            enKucuk=sayi;
        }

        }
        System.out.println("En büyük değer:"+enBuyuk);
        System.out.println("En küçük değer:"+enKucuk);

    }
}
