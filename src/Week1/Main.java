import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 5000;
        int process;
        int amount;

        System.out.println("Hoşgeldiniz");
        System.out.println("Bir işlem seçiniz.");

        System.out.println("1: Bakiye Görüntüle");
        System.out.println("2: Para Yatırma");
        System.out.println("3: Para Çekme");
        System.out.println("4: Sistemden Çıkış");

        process = input.nextInt();

        switch (process){

            case 1:
                System.out.println("Bakiyeniz: " +balance+ "TL");
                break;
            case 2:
                System.out.println("Ne kadar yatırmak istiyorsunuz? : ");
                int amout = input.nextInt();
                balance += amout;
                System.out.println("Bakiyeniz: " +balance+ "TL");
                break;
            case 3:
                System.out.println("Ne kadar  çekmek istiyorsunuz? : ");
                amout = input.nextInt();
                if(balance>amout){
                    balance -= amout;
                }else{
                    System.out.println("Girdiğiniz tutar geçersizdir!");
                }

                System.out.println("Bakiyeniz: " +balance+ "TL");
                break;
            case 4:
                System.out.println("Sistemden çıkılıyor...");
                break;
            default:
                System.out.println("Geçersiz giriş!");
                break;

        }



    }
}