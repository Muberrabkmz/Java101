package giriş;

import java.util.Scanner;

public class notortalamasi {
    public static void main(String[] args) {


        int mat, turkce, fizik, kimya, muzik, tarih;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();

        System.out.print("Turkce notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = input.nextInt();

        var toplam = mat + turkce + fizik + kimya + muzik + tarih;
        var ortalama = toplam / 6;
        if (ortalama >= 60) {
            System.out.println("Sınıfı geçtiniz");
        } else {
            System.out.println("Sınıfta kaldınız");
        }

    }


}
