package giriş;
import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("küme eleman sayısını giriniz:");
        int n= input.nextInt();
        System.out.print("grupların kaç elemanlı olmasını istersiniz:");
        int r= input.nextInt();
        int total=1;
        int total2=1;
        int total3=1;
        double sonuc=1;

        for(int i=1;i<=n;i++){
           total=total*i;
        }
        for(int j=1;j<=r;j++){
            total2=total2*j;
        }
         for(int k=1;k<=(n-r);k++) {
             total3 = total3 * k;
         }
       sonuc=total/ (total2*total3);
        System.out.println("C(" + n + "," + r + ") = " + sonuc);
    }
}
