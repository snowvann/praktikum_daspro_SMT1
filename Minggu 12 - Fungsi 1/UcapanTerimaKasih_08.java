import java.util.Scanner;

public class UcapanTerimaKasih_08 {
    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan("Halo");//modifikasi
    }

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine(); 
        sc.close();
        return namaOrang; 
    }
    //modifikasi
    public static void UcapanTambahan(String ucapan){ 
        System.out.println(ucapan);
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan(); 
        System.out.println("Thank you "+nama+" for being the best teacher in the world. \n"+
        "You inspired in me a love for learning and made me feel Like I coulde ask you anything.");
    }
}
