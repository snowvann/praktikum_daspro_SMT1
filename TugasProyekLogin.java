import java.util.Scanner;

public class TugasProyekLogin{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("UserId: ");
        String username = input.nextLine();

        System.out.print("UserPW: ");
        String password = input.nextLine();

        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Login Berhasil!");
        } else {
            System.out.println("Login gagal, coba lagi!");
        }
    }
}
