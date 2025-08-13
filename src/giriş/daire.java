package giriş;
import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r, aci;
        double pi = 3.14;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.println("dairenin yarıçapını giriniz:");
        r = input.nextInt();
        System.out.println("dairenin merkez açısını giriniz:");
        aci = input.nextInt();
        alan = (pi * (r * r) * aci) / 360;
        System.out.print("dairenin alanı:" + alan);
    }
}
