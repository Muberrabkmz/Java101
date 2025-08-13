package giriş;
import java.util.Scanner;

public class ucgenalanı {
    public static void main(String[] args){
        int a,b;
        double alan;
        Scanner input= new Scanner(System.in);
        System.out.print("dik üçgenin dik kenarlarından birinin değerini giriniz:");
        a= input.nextInt();
        System.out.print("dik üçgenin diğer dik kenarının değerini giriniz:");
        b= input.nextInt();
        alan=a*b/2;
        System.out.println("dik üçgenin alanı:"+alan);

    }
}
