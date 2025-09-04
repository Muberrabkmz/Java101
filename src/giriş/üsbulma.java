package giriş;
import java.util.Scanner;

public class üsbulma {
    public static void main(String[] args) {
        int girilen;
        Scanner input=new Scanner(System.in);
        System.out.print("sınır sayısı seçiniz:");
        girilen= input.nextInt();
        for(int i=1;i<girilen;i*=4){
            System.out.print(i+",");

        }System.out.println("");
        for(int j=1;j<girilen;j*=5){
            System.out.print(j+",");
        }
    }
}
