import java.util.Scanner;

public class DoWhileCuti08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        int jatahCuti, jumlahHari; 
        String konfirmasi; 

        System.out.print("Jatah cuti : ");
        jatahCuti = input08.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input08.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input08.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari; 
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                } 
            } else if (konfirmasi.equalsIgnoreCase("t"))
                { break;
            } else {
                System.out.println("Program Berhenti");
            }
        } while (jatahCuti > 0); 
    }
}
