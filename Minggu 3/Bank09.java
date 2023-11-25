import java.util.Scanner;
public class Bank09 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        int jml_tabungan_awal, lama_menabung;
        double bunga, presentase=0.02, jml_tabungan_akhir;

        System.out.print("Masukkan tabungan awal : ");
        jml_tabungan_awal = SC.nextInt();
        System.out.print("Masukkan lama menabung : ");
        lama_menabung = SC.nextInt();

        bunga = jml_tabungan_awal*lama_menabung*presentase;
        jml_tabungan_akhir = bunga+bunga;

        System.out.println("Jumlah tabungan akhir : " +jml_tabungan_akhir);
        System.out.println("Jumlah Bunga : " +bunga);


    }
}