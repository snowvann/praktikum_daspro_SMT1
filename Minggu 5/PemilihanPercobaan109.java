import java.util.Scanner;

public class PemilihanPercobaan109 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input00.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
        else
            System.out.println("Angka "+angka+" bilangan ganjil");
    }
    
}
