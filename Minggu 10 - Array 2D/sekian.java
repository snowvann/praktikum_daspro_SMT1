import java.util.Scanner;

public class sekian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String penonton[][] = new String [4][2]; 

        do {
            System.out.print("Menu: \n1. Input Data Penonton \n2. Tampilkan Daftar Penonton \n3. Exit\nMasukkan Menu: ");
            String menu = sc.next();
            if (menu.equalsIgnoreCase("1")) {
                do {
                    System.out.println("Input data penonton");
                    sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan Baris ");
                    int baris = sc.nextInt();
                    System.out.println("Masukkan Baris: ");
                    int kolom = sc.nextInt();

                    penonton [baris - 1][kolom - 1] = nama; 

                    System.out.print("Input Penonton lainnya? (y/n): ");
                    String next = sc.next();
                    if (next.equalsIgnoreCase("n")){
                        break; 
                    }
                }while (next.equalsIgnoreCase)
            }
        } while (!(menu.equalsIgnoreCase("3")));
    }
}
