package giriş;
import java.util.Scanner;

public class sifirdantoplama {
    public static void main(String[] args) {
        int girilen;
        int toplam=0;
        int sayi=0;
        double ortalama;
        Scanner inp=new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        girilen= inp.nextInt();
        for(int i=0;i<=girilen;i++){
            if(i%3==0 && i%4==0){
                toplam=toplam+i;
                sayi++;
            }
        }
        ortalama=toplam/sayi;
        System.out.println("girdiğiniz sayiya kadar olan 3e ve 4e bölünen sayilarin ortalaması:"+ortalama);


    }
}
