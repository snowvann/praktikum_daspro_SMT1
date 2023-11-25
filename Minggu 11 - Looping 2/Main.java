import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // nomor 1
        int i, j, n, s;
        System.out.print ("Masukan jumlah baris : ");
        n = (int) sc.nextInt();
        
        //Perulangan untuk segitiga siku - siku 
        for (i = 1; i <= n; i++)
        {
            s = n - i;
            for(j = 1; j <= s; j++) {
                System.out.print("  ");  //jarak spasi
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j + " " );  //output berupa angka
            }
        System.out.println();
    }
    System.out.println();

        // nomor 2   
    int tinggi_segitiga;
  
    System.out.print("Input tinggi segitiga: ");
    tinggi_segitiga = sc.nextInt();//menginput tinggi segitiga yang diinginkan
        
    for(i = 0; i < tinggi_segitiga; i++) {//deklarasi tinggi
        for(j = 1; j <= tinggi_segitiga-i; j++) { //deklarasi segitiga ke samping
        System.out.print("*");//output menggunakan bintang
        } System.out.println();
        }
    System.out.println();

        // nomor 3
    System.out.print("Masukkan n : ");
    int panjang = sc.nextInt();

    // printSquare  untuk mencetak persegi
    printSquare(panjang);
    } 
    public static void printSquare(int n) {
        Scanner scan = new Scanner(System.in);
        String input; 

        for (int i = 1; i <= n; i++) { //deklarasi tinggi di mulai kolom 1
            for (int j = 1; j <= n; j++) {//deklarasi lebar di mulai baris 1
                if ((i == 1) || (i == n) || (j == 1) || (j == n)) { //deklarasi kolom mana yang kosong mana yang ada 
                    System.out.print(n + " "); //spasi untuk baris
                } else {
                    System.out.print("  "); //spasi untuk baris baris yang koosng
                }
            }
            System.out.println(); 
        }
    }
}