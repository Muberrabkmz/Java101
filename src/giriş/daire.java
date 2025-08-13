package giriş;
import java.util.Scanner;

public class daire {
    public static void main(String[] args){
        int r;
        double pi=3.14;
        double alan,cevre;
        Scanner input=new Scanner(System.in);
        System.out.print("dairenin yarıçapını giriniz:");
        r= input.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("dairenin alanı:"+alan);
        System.out.print("dairenin çevresi:"+cevre);
    }
}
