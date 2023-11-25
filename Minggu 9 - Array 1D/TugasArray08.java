import java.util.Scanner;

public class TugasArray08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int highest = arr[0];
        int lowest = arr[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Nilai tertinggi: " + highest);
        System.out.println("Nilai terendah: " + lowest);
        System.out.println("Nilai rata-rata: " + average);
    }
}