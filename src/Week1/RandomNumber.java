import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random rd = new Random();
        int counter = 0;
        int num;

        while(true){

            num = rd.nextInt(501);
            System.out.println("Sayı: " + num);

            if(num>50 && num<100) {
                counter++;
                System.out.println("Sayı " + counter + " tekrarda bulundu.");
                return;
            }

            counter++;


            }

        }




 }
