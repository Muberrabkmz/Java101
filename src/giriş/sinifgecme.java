import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, muzik, fizik, kimya, turkce;
        int toplam = 0;
        int dersSayisi = 0;

        System.out.print("Matematik notu: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            dersSayisi++;
        }

        System.out.print("Müzik notu: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        System.out.print("Fizik notu: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Kimya notu: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        if (dersSayisi == 0) {
            System.out.println("Geçerli ders notu girilmedi!");
        } else {
            double ortalama = (double) toplam / dersSayisi;
            System.out.println("Ortalama: " + ortalama);

            if (ortalama <= 55) {
                System.out.println("Kaldınız!");
            } else {
                System.out.println("Geçtiniz!");
            }
        }
    }
}



