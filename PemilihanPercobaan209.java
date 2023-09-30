import java.util.Scanner;

public class PemilihanPercobaan209 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.println("Nilai uas   : ");
        float uas = input00.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input00.nextFloat();
        System.out.println("Nilai kuis   : ");
        float kuis = input00.nextFloat();
        System.out.println("Nilai tugas   : ");
        float tugas = input00.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
    
}
