package giriş;
import java.util.Scanner;
public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi;
        int toplam=0;
        System.out.print("sayi giriniz:");
        sayi= inp.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){

                toplam=toplam+i;

            }
        }
        if(sayi==toplam){
            System.out.println("sayi mükemmel sayıdır.");
        }else{
            System.out.println("sayi mükemmel sayı değildir.");
        }
    }
}
