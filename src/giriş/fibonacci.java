package giriş;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinde kaç eleman görmek istersiniz? ");
        int n = input.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Serisi:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int sonraki = a + b;
            a = b;
            b = sonraki;
        }
    }
}
