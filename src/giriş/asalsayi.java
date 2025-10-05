package giriş;
import java.util.Scanner;


public class asalsayi {
    public static void main(String[] args) {
        System.out.println("1 - 100 arasındaki asal sayılar:");

        for (int i = 2; i <= 100; i++) {
            int sayac = 0; // bölen sayısını tutacak

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }

            if (sayac == 2) { // sadece 1 ve kendisine bölünüyorsa asal
                System.out.print(i + " ");
            }
        }
    }
}
