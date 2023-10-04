import java.util.Scanner;

public class Pemilihan2Percobaan208 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totalSudut;

        System.out.println("Masukkan sudut1 yang diketahui: ");
            sudut1=input08.nextInt();
        System.out.println("Masukkan sudut2 yang diketahui: ");
            sudut2=input08.nextInt();
        System.out.println("Masukkan sudut3 yang diketahui: ");
            sudut3=input08.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku siku");
        } else if (totalSudut <= 180) {
            if ((sudut1 < 90) || (sudut2 < 90) || (sudut3 < 90))
                System.out.println("Segitiga tersebut adalah segitiga lancip");
        } else if (totalSudut >= 180){
            if ((sudut1 > 90) || (sudut2 > 90) || (sudut3 > 90))
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        }else
            System.out.println("Bukan Segitiga");
    }
}
