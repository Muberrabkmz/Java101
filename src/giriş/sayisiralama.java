package giriş;
import java.util.Scanner;

public class sayisiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        a= input.nextInt();
        System.out.print("2. sayıyı giriniz:");
        b= input.nextInt();
        System.out.print("3. sayıyı giriniz:");
        c= input.nextInt();

        if(a<b && a<c){
            if(b<c){
                System.out.println("sıralama:a<b<c");
            }
            else{
                System.out.println("sıralama:a<c<b");
            }
        } else if (b<a && b<c){
            if(a<c){
                System.out.println("sıralama:b<a<c");
            }
            else{
                System.out.println("sıralama:b<c<a");
            }
        }
        else{
            if(b<a){
                System.out.println("sıralama:c<b<a");
            }
            else{
                System.out.println("sıralama:c<a<b");
            }
        }
    }
}
