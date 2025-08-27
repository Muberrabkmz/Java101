package giriş;
import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        int derece;
        Scanner inp=new Scanner(System.in);

        System.out.print("Hava derecesini giriniz:");
        derece= inp.nextInt();

        if(derece<5){
            System.out.println("Kayak yapmaya gidebilirsin.");
        }

        else if(5<=derece && derece<=25){
            if(derece<=15){
                System.out.println("Piknik yapmaya gidebilirsin");
            }
            if(derece>=10){
                System.out.println("Sinemaya gidebilirsin");
            }
        }
        else{
            System.out.println("Yüzmeye gidebilirsin");
        }

    }
}
