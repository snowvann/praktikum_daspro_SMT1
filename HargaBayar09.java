import java.util.Scanner;

public class HargaBayar09 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int harga, jumlah, jmlHalaman;
        double dis=0.1, total, bayar, jmlDis;
        

        System.out.println("Masukkan harga barang yang dibeli ");
        harga=in.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=in.nextInt();
        System.out.println("Masukkan judul buku yang dibeli " );
        String brand=in.next();
        System.out.println("Masukkan Jumlah Halaman buku yang dibeli ");
        jmlHalaman=in.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
        System.out.println("Brand : " +brand);
        System.out.println("Halaman : " +jmlHalaman);

    }
}
