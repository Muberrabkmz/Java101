package giriş;
import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1;
        int n2;
        int i=1;
        int ebob=1;
        int ekok;
        System.out.print("n1 sayısını giriniz:");
        n1= inp.nextInt();
        System.out.print("n2 sayısını giriniz:");
        n2= inp.nextInt();

            while(i<=n1 && i<=n2){
              if(n1%i==0 && n2%i==0){
                  ebob=i;
              }
            i++;
            }
            ekok=(n1*n2)/ebob;
        System.out.println("ebob:"+ebob);
        System.out.println("ekok:"+ekok);
        }
    }

