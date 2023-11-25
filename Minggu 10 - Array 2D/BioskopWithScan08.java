import java.util.Scanner;

public class BioskopWithScan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah penonton: ");
        int jumlahPenonton = sc.nextInt();
        sc.nextLine(); 

        String[][] penontonList = new String[jumlahPenonton][3];

        for (int i = 0; i < jumlahPenonton; i++) {
            System.out.println("Masukkan data penonton ke-" + (i + 1));
            
            System.out.print("Masukkan nama penonton: ");
            String nama = sc.nextLine();
            
            System.out.print("Masukkan umur penonton: ");
            int umur = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Masukkan alamat penonton: ");
            String alamat = sc.nextLine();

            penontonList[i][0] = nama;
            penontonList[i][1] = Integer.toString(umur);
            penontonList[i][2] = alamat;
        }

        System.out.println("\nDaftar penonton:");
        for (int i = 0; i < jumlahPenonton; i++) {
            System.out.println("Nama: " + penontonList[i][0]);
            System.out.println("Umur: " + penontonList[i][1]);
            System.out.println("Alamat: " + penontonList[i][2]);
            System.out.println();
        }
    }
}