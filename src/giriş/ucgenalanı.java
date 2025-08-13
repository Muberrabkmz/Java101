package giriş;
import java.util.Scanner;

public class ucgenalanı {
    public static void main(String[] args){
        int a,b,c;
        double alan;
        Scanner input= new Scanner(System.in);

        System.out.print("birinci kenarın değerini giriniz:");
        a= input.nextInt();
        System.out.print("ikinci kenarın değerini giriniz:");
        b= input.nextInt();
        System.out.print("üçüncü kenarın değerini giriniz:");
        c= input.nextInt();
        double u=(a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("üçgenin alanı:"+alan);

    }
}
