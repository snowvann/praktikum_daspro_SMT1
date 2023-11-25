import java.util.Scanner;

public class WhileGaji08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur; 
        double gajiLembur =0 , totalGajiLembur = 0;
        String jabatan; 
        
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input08.nextInt();
        
        int i = 0;

        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = input08.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = input08.nextInt();
            

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue; 
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000; 
                System.out.printf("Gaji Lembur : %.2f\n", gajiLembur);
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
                System.out.printf("Gaji Lembur : %.2f\n", gajiLembur);
            } else {
                System.out.println("Jabatan Invalid");
            }
            i++;
            totalGajiLembur += gajiLembur;
        }
        System.out.printf("Total gaji lembur : %.2f\n" + totalGajiLembur);
    }
}
