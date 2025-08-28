package giriş;
import java.util.Scanner;

public class cinzodagı {
    public static void main(String[] args) {
        int year;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        year= input.nextInt();
        if(year%12==0){
            System.out.println("Çin Zodağı burcunuz:Maymun");
        } else if (year%12==1) {
            System.out.println("Çin Zodağı burcunuz:Horoz");
        }else if (year%12==2) {
            System.out.println("Çin Zodağı burcunuz:Köpek");
        }else if (year%12==3) {
            System.out.println("Çin Zodağı burcunuz:Domuz");
        }else if (year%12==4) {
            System.out.println("Çin Zodağı burcunuz:Fare");
        }else if (year%12==5) {
            System.out.println("Çin Zodağı burcunuz:Öküz");
        }else if (year%12==6) {
            System.out.println("Çin Zodağı burcunuz:Kaplan");
        }else if (year%12==7) {
            System.out.println("Çin Zodağı burcunuz:Tvaşan");
        }else if (year%12==8) {
            System.out.println("Çin Zodağı burcunuz:Ejderha");
        }else if (year%12==9) {
            System.out.println("Çin Zodağı burcunuz:Yılan");
        }else if (year%12==10) {
            System.out.println("Çin Zodağı burcunuz:At");
        }else if (year%12==11) {
            System.out.println("Çin Zodağı burcunuz:Koyun");
        }
    }
}
