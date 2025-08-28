package giriş;
import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        int year;
        Scanner input=new Scanner(System.in);
        System.out.print("Yıl giriniz:");
        year= input.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.println("Artık yıl.");
            }else{
                System.out.println("Artık yıl değil.");
            }
        }else if(year%4==0){
            System.out.println("Artık yıl.");
        }else{
            System.out.println("Artık yıl değil.");
        }
    }
}
