package giriş;
import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("üçgen yapmak istediğiniz sayıyı giriniz:");
        int sayi= inp.nextInt();
        for(int i=0;i<=sayi;i++){
            for(int yildiz=sayi-i;yildiz>0;yildiz--){
                System.out.print("*");
            }
            for(int bosluk=0;bosluk<sayi;bosluk++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
