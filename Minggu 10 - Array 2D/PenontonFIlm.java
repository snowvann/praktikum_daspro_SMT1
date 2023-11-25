import java.util.Scanner;

public class PenontonFIlm {
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 12;
    public static final char EMPTY_SEAT = '-';
    public static final char OCCUPIED_SEAT = 'X';

    private char[][] seats;

    public PenontonFIlm() {
        seats = new char[NUM_ROWS][NUM_COLS];
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                seats[i][j] = EMPTY_SEAT;
            }
        }
    }

    public void bookSeat(int row, int col) {
        if (row < 0 || row >= NUM_ROWS || col < 0 || col >= NUM_COLS) {
            System.out.println("Seat number is invalid.");
            return;
        }

        if (seats[row][col] == OCCUPIED_SEAT) {
            System.out.println("Seat is already occupied.");
        } else {
            seats[row][col] = OCCUPIED_SEAT;
            System.out.println("Seat has been successfully booked.");
        }
    }

    public void printSeats() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PenontonFIlm theater = new PenontonFIlm();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nama penonton: ");
                    String nama = scanner.next();
                    System.out.print("Baris tempat duduk: ");
                    int row = scanner.nextInt();
                    System.out.print("Kolom tempat duduk: ");
                    int col = scanner.nextInt();
                    theater.bookSeat(row, col);
                    break;
                case 2:
                    theater.printSeats();
                    break;
                case 3:
                    System.out.println("Close the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}