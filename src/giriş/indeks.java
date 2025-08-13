package giriş;
import java.util.Scanner;
public class indeks {
    public static void main(String[] args){
        double boy,kilo,indeks;
        Scanner input=new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden giriniz:");
        boy= input.nextDouble();
        System.out.print("kilonuzu giriniz:");
        kilo=input.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.print("vücut kütle indeksiniz:"+indeks);

    }
}
