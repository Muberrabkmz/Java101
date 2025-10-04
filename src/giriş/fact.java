package giriş;
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("faktoriyel hesaplanacak sayıyı giriniz:");
        int n= input.nextInt();
        int total=1;
        for(int i=1;i<=n;i++){
            total=total*i;
        }
        System.out.println("sonuc:"+total);
    }
}
