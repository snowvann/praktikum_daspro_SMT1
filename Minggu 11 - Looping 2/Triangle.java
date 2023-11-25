import java.util.Scanner; 
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masikkan nilai N = ");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");  
            }
            System.out.println(); 
        }
    }
}
