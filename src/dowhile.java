import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int pass;
        boolean askpassword=true;
        do{
            System.out.print("Şifrenizi giriniz:");
            pass= inp.nextInt();
            if(pass==123){
                System.out.println("Şifreyi doğru girdiniz.");
                askpassword=false;
            }else{
                System.out.println("Şifreyi yanlış girdinzi.");
            }
        }while(askpassword);
    }
}
