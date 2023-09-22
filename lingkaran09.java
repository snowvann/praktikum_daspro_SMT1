import java.util.Scanner;
public class lingkaran09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas, phi=3.14;

        System.out.println("Masukkan jari-jari lingkaran: ");
        r=input.nextInt();

        luas = phi*r*r;
        keliling=2*phi*r; 
        System.out.println("Luas Lingkaran = " +luas);
        System.out.println("keliling lingkaran = " +keliling);
    }
}