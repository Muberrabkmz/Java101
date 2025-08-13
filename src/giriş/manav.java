package giriş;
import java.util.Scanner;

public class manav {
    public static void main(String[] args){
        int kg,kg1,kg2,kg3,kg4;
        double total;
        double armut= 2.14;
        double elma= 3.67;
        double domates= 1.11;
        double muz= 0.95;
        double patlican= 5.00;
        Scanner input=new Scanner(System.in);
        System.out.print("armut kaç kilo:");
        kg= input.nextInt();
        System.out.print("elma kaç kilo:");
        kg1= input.nextInt();
        System.out.print("domates kaç kilo:");
        kg2= input.nextInt();
        System.out.print("muz kaç kilo:");
        kg3= input.nextInt();
        System.out.print("patlıcan kaç kilo:");
        kg4= input.nextInt();

        total=(armut*kg)+(elma*kg1)+(domates*kg2)+(muz*kg3)+(patlican*kg4);
        System.out.print("ödenicek tutar:"+total);
    }
}
