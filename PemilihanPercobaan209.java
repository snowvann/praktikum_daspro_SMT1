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

        System.out.println("Perolehan nilai total : ");
        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);

        if (total <= 39) {
            System.out.println("Nilai akhir = " + total + " sehingga Gagal");
        } else if ( total < 39 && total < 51) {
            System.out.println("Nilai akhir = " + total + " sehingga Kurang");
        } else if ( total < 50 && total < 61){
            System.out.println("Nilai akhir = " + total + " sehingga Cukup");
        } else if ( total < 60 && total < 66){
            System.out.println("Nilai akhir = " + total + " sehingga Lebih dari cukup");
        } else if ( total < 65 && total < 74){
            System.out.println("Nilai akhir = " + total + " sehingga Baik");
        } else if ( total < 73 && total < 81){
            System.out.println("Nilai akhir = " + total + " sehingga Lebih dari baik");
        } else if ( total < 80 && total <= 100){
            System.out.println("Nilai akhir = " + total + " sehingga Kurang");
        } 
            
    }
    
}
