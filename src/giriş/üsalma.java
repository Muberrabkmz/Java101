package giriş;
import java.util.Scanner;

public class üsalma {
    public static void main(String[] args) {
        int n;
        int r;
        Scanner inp = new Scanner(System.in);
        System.out.print("üssünü almak istediğiniz sayıyı giriniz:");
        n = inp.nextInt();
        System.out.print("üs olucak sayı:");
        r = inp.nextInt();
        int total = 1;
        for (int i = 0; i <= r; i++) {
            total = total * n;
        }
        System.out.println("sonuc:" + total);
    }
}
