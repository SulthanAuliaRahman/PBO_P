import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Ambil input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            // Ambil input berupa String dan integer
            String text = scanner.next();
            int number = scanner.nextInt();
            
            // Format output dengan printf
            System.out.printf("%-10s%03d%n", text, number);
        }
        System.out.println("================================");
    }
}
