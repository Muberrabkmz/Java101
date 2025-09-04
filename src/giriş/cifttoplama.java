package giriş;
import java.util.Scanner;

public class cifttoplama {
    public static void main(String[] args) {
        int girilen;
        int toplam=0;
        Scanner inp=new Scanner(System.in);
        do{
            System.out.print("sayi giriniz:");
            girilen= inp.nextInt();
            if(girilen%4==0 && girilen%2==0){
                toplam+=girilen;
            }
        }
        while(girilen%2==0);
        System.out.println("toplam:"+ toplam);

    }
}
