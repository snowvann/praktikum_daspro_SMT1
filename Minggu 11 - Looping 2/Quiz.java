import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random ();

        char menu ='y'; 
        do{
            int number = random.nextInt(10) +1; 
            boolean success = false; 
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                    if (answer == number) { // modifikasi agar mengetahui dimana angka random
                        System.out.println("Selamat! Anda menebak dengan benar, angka yang benar adalah " + number);
                    } else if (answer < number) {
                        System.out.println("Angka terlalu kecil! coba lagi : ");
                    } else {
                        System.out.println("Angka terlalu tinggi! coba lagi : ");
                    }
            } while(!success);
            System.out.print("Apakah anda ingin mengulang permainan (y/n)? ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y'|| menu == 'Y');
        
    } 
}
