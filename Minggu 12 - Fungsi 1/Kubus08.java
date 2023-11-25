import java.util.Scanner;

public class Kubus08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();
        System.out.println();

        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa : ");
            String namaMahasiswa = scanner.next();
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSeluruh nilai mahasiswa:");
        tampilkanNilaiTugas(nilaiTugas);

        System.out.println("\nPada hari keberapa terdapat nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa:");
        int hariKeberapa = cariHariTertinggi(nilaiTugas);
        System.out.println("Hari ke-" + hariKeberapa);

        System.out.println("\nMahasiswa yang memiliki nilai tertinggi:");
        int mahasiswaTertinggi = mahasiswaTertinggi(nilaiTugas);
        System.out.println("Mahasiswa ke-" + (mahasiswaTertinggi + 1));
        int nilaiTertinggi = nilaiTugas[mahasiswaTertinggi][0];

        for (int i = 1; i < jumlahTugas; i++) {
            if (nilaiTugas[mahasiswaTertinggi][i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiTugas[mahasiswaTertinggi][i];
            }
        }
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
    }

    static void tampilkanNilaiTugas(int[][] nilaiTugas) {
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int cariHariTertinggi(int[][] nilaiTugas) {
        int hariKeberapa = 0;
        int nilaiTertinggi = nilaiTugas[0][0];

        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    hariKeberapa = j;
                }
            }
        }
        return hariKeberapa;
    }

    static int mahasiswaTertinggi(int[][] nilaiTugas) {
        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = nilaiTugas[0][0];

        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    mahasiswaTertinggi = i;
                }
            }
        }
        return mahasiswaTertinggi;
    }
}