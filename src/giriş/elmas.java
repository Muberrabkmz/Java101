package giriş;
import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Elmas yüksekliğini giriniz (tek sayı): ");
        int n = input.nextInt();

        // Üst üçgen
        for (int i = 1; i <= n; i++) {
            for (int bosluk = n - i; bosluk > 0; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= 2 * i - 1; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt üçgen
        for (int i = n - 1; i >= 1; i--) {
            for (int bosluk = n - i; bosluk > 0; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= 2 * i - 1; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

