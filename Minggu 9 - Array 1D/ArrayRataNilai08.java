import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Input jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0; 
        double rataLulus = 0; 
        double rataTidakLulus = 0; 
        int jumlahLulus = 0; 
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++; 
            } else {
                totalTidakLulus += nilaiMhs[i]; 
            }
        }
        if (jumlahLulus > 0) {
            rataLulus = totalLulus / jumlahLulus; 
            System.out.println("Rata- rata nilai lulus = "+ rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus. ");
        }
        if (jumlahMahasiswa - jumlahLulus > 0) {
            rataTidakLulus = totalTidakLulus / (jumlahMahasiswa - jumlahLulus);
            System.out.println("rata - rata nilai tidak lulus = " + rataTidakLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
    }
}
