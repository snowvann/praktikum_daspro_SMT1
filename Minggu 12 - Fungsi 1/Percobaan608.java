import java.util.Scanner;

public class Percobaan608 {
    public static void TampilHinggaKei(int i){
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }
    public static int Jumlah (int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void TampilJumlah (int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }

    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb; 
        return Luas; 
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int p, l, t, L, vol; 

        System.out.println("Masukkan");
        System.out.print("Panjang : ");
        p = sc.nextInt();
        System.out.print("Lebar : ");
        l = sc.nextInt();
        System.out.print("Tinggi : ");
        t = sc.nextInt();

        L=p*l; //ini yang manual tanpa fungsi 
        System.out.println("Luas Pesergi panjang adalah "+L);
        
        vol = p*l*t; //ini yang manual tanpa fungsi 
        System.out.println("Volume balok adalah "+vol); 

        L = hitungLuas(p, l); //ini pake fungsi
        System.out.println("Luas Pesergi panjang adalah "+L);
        vol = hitungVolume(t, p, l); //ini pake fungsi
        System.out.println("Volume balok adalah "+vol);

        int temp = Jumlah(1,1); 
        TampilJumlah(temp, 5);
    }
}
