import java.util.Scanner;

public class WhileFORKelipatan08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
         int kelipatan; 
         int jumlah = 0; 
         int counter = 0;
         int total = 0; 
         float avg = 0; 

         System.out.print("Masukkan bilangan kelipatan (1-9) : ");
         kelipatan = input08.nextInt();

         int i =1;
         while (i<= 50) {
            if (i % kelipatan == 0) {
            total += 1; 
            counter++;
            System.out.printf("No.%d) %d adalah kelipatan %d\n" , counter, i, kelipatan);
         } 
         i++;
        }
        avg = total/counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d/n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d/n", kelipatan, total);
        System.out.printf("Rata - Rata dari Total %.2f", avg);
    }
}
