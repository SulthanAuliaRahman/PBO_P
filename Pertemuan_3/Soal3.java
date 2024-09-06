import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("A:");
        int A = scanner.nextInt(); 
        System.out.print("Operator:");
        char operator = scanner.next().charAt(0);
        System.out.print("B:");  // Operator (seperti +, -, *, /, %)
        int B = scanner.nextInt();          // Bilangan kedua
        
        // Variable untuk menyimpan hasil operasi
        int hasil = 0;
        
        // Melakukan operasi berdasarkan operator
        switch (operator) {
            case '+':
                hasil = A + B;
                break;
            case '-':
                hasil = A - B;
                break;
            case '*':
                hasil = A * B;
                break;
            case '/':
                if (B != 0) {
                    hasil = A / B;
                } else {
                    System.out.println("Error: Pembagian dengan nol");
                    return;
                }
                break;
            case '%':
                if (B != 0) {
                    hasil = A % B;  
                } else {
                    System.out.println("Error: Modulo dengan nol");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }
        
        // Output hasil operasi
        System.out.println("Hasil = "+ hasil);
    }
}
