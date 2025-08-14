package giriş;

import java.util.Scanner;

public class kullanicigiris {

    public static void main(String[] args) {
        String password="java101";
        String inputPassword;
        String newPassword;
        String userName;
        String secim;
        Scanner inp = new Scanner(System.in);
        System.out.print("kullanıcı adını giriniz:");
        userName = inp.nextLine();
        System.out.print("şifrenizi giriniz:");
        inputPassword = inp.nextLine();
        if (userName.equals("patika") && password.equals(inputPassword)) {
            System.out.println("giriş yaptınız.");
        } else {
            System.out.println("yanlış bilgileri giriniz.");
            System.out.println("şifrenizi değiştirmek ister miziniz?");
            System.out.println("E" + "/" + "H");
            secim = inp.nextLine().toUpperCase();

            if (secim.equals("E") || secim.equals("H")) {
                switch (secim) {
                    case "E":
                        System.out.println("yeni şifrenizi giriniz:");
                        newPassword = inp.nextLine();
                        if (password.equals(newPassword)) {
                            System.out.println("eski şifreyle aynı yeni şifre giriniz");
                            System.out.println("yeni şifrenizi giriniz:");
                            newPassword = inp.nextLine();
                            password = newPassword;
                            System.out.println("Şifre değiştirildi: " + password);

                        } else {
                            System.out.println("şifreniz değiştirildi.");
                        }
                        break;
                    case "H":
                        break;

                }
            } else {
                System.out.println("Lütfen Geçerli Bir Cevap Giriniz!");
            }
        }
    }


}
