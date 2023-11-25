import java.util.Scanner;

public class NestedLoop_2341760122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double[][] temps = new double [5][7];
        double [] kotaRata2 = new double [5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            double kotaJml = 0; 
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j+i)+ ": ");
                temps [i][j] = sc.nextDouble();
                kotaJml += temps [i][j];
            } 
            kotaRata2[i] = kotaJml / temps [0].length; 
            System.out.println();
        }
        for (int i = 0; i< temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j <temps[0].length; j++) {
                System.out.println(temps[i][j] + " ");
            } 
            System.out.println("Hasil Rata Ratanya adalah " + kotaRata2);
            System.out.println();
        }
    }
}
