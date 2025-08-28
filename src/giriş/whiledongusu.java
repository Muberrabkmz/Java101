package giriş;
import java.util.Scanner;

public class whiledongusu {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess=false;
        Scanner inp=new Scanner(System.in);
        while(!isPasswordSuccess){
            System.out.print("Şifreyi giriniz:");
            password= inp.nextInt();
            if(password==123){
                System.out.println("Doğru");
            }else{
                System.out.println("Yanlış");
            }
        }
    }
}
