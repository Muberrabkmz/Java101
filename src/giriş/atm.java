package giriş;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int hak = 3;
        int miktar = 1500;
        int select;

        while (hak > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("KODLUYORUZ BANKASINA HOŞGELDİNİZ.");

                do {
                    System.out.println("1- Para yatırma\n2- Para çekme\n3- Bakiye sorgula\n4- Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    input.nextLine(); // nextInt sonrası boş satırı temizle

                    if (select == 1) {
                        System.out.print("Para miktarı: ");
                        int yatirilan = input.nextInt();
                        input.nextLine();
                        miktar += yatirilan;
                    } else if (select == 2) {
                        System.out.print("Para miktarı: ");
                        int cekilen = input.nextInt();
                        input.nextLine();
                        if (cekilen > miktar) {
                            System.out.println("Bakiye yetersiz");
                        } else {
                            miktar -= cekilen;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiye: " + miktar);
                    }
                } while (select != 4);

                System.out.println("TEKRAR GÖRÜŞMEK ÜZERE!");
                break; // kullanıcı çıkış yaptı, while döngüsünü kır
            } else {
                hak--;
                System.out.println("Kullanıcı adı veya şifre yanlış. Tekrar deneyiniz!");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçin.");
                } else {
                    System.out.println("Kalan hakkınız: " + hak);
                }
            }
        }

    }
}
