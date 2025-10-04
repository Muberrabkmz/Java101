package giriş;
import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("N sayısı giriniz:");
        int n= inp.nextInt();
        double sonuc=0.0;
        for(int i=1;i<=n;i++){
            sonuc=sonuc+(1.0/i);
        }
        System.out.println("harmonik sonuc:"+sonuc);
    }
}
