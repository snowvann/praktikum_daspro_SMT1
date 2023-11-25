import java.util.Scanner;

public class LinierSearch08 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in); 

        System.out.print("Masukkan jumlah elemen array:");
        int jumlahElemen = sc.nextInt();
        int[] arrayInt = new int[jumlahElemen];
        for (int i = 0; i< arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-" +i+ " : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.println("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt(); 
        int hasil = -1; 
        for (int i = 0; i< arrayInt.length; i++){
            if (arrayInt[i] == key) {
                hasil = i; 
                break;
            }
        }
        if (hasil != -1) {
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
        } else {
            System.out.println("Tidak ditemukan dalam indeks");
        }
    }
}
